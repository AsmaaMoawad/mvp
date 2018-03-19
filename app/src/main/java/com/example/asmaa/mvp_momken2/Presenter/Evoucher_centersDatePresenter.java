package com.example.asmaa.mvp_momken2.Presenter;

import android.content.Context;
import android.content.Intent;

import com.example.asmaa.mvp_momken2.Activity.Evoucher_centers_ListActivity;
import com.example.asmaa.mvp_momken2.Model.DataManager;
import com.example.asmaa.mvp_momken2.Model.DataManagerInterface;
import com.example.asmaa.mvp_momken2.Model.Evoucher_Centers_Model;
import com.example.asmaa.mvp_momken2.Service.RetrofitService;
import com.example.asmaa.mvp_momken2.View.Evoucher_centersDateView;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Asmaa on 2/21/2018.
 */

public class Evoucher_centersDatePresenter implements Evoucher_centersDatePresenterInterface {








    Evoucher_centersDateView          View_Evoucher_centersDate;
    String
                                      mTransactionId,
                                      mFromDate,
                                      mToDate ;
    DataManager                       dataManager;




    public Evoucher_centersDatePresenter(Evoucher_centersDateView View_Evoucher_centersDate  , String mTransactionId, String mFromDate, String mToDate) {
        this.View_Evoucher_centersDate                  =  View_Evoucher_centersDate;
        this.mToDate                                    =  mToDate;
        this.mFromDate                                  =  mFromDate;
        this.mTransactionId                             =  mTransactionId;

    }



    @Override
    public void OnEmptyResponse_Evoucher_centers() {
        View_Evoucher_centersDate.OnEmptyResponse();

    }



    @Override
    public void OnSuccessResponse_Evoucher_centers() {

        View_Evoucher_centersDate.OnSuccess();



    }



    public void GetEvoucher_centerslist(){
        dataManager = new DataManager(this);
        dataManager.SendDataToService_EvoucherCenterDate(mTransactionId,mFromDate,mToDate);


    }
}
