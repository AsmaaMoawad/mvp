package com.example.asmaa.mvp_momken2.Model;


import com.example.asmaa.mvp_momken2.Presenter.Evoucher_centersDatePresenterInterface;
import com.example.asmaa.mvp_momken2.Presenter.Evoucher_centers_ListPresenterInterface;
import com.example.asmaa.mvp_momken2.Presenter.LoginPresenterInterface;
import com.example.asmaa.mvp_momken2.Service.RetrofitService;

import java.util.List;

/**
 * Created by Asmaa on 3/14/2018.
 */

public class DataManager  implements DataManagerInterface{

     static String  mUsername , mPassword , mCenterId;
     static  List<Evoucher_Centers_Model> ListModelOf_EvoucherCentersStored;


    RetrofitService                            retrofitService ;
    Evoucher_centersDatePresenterInterface     evoucher_centersDatePresenterInterface;
    Evoucher_centers_ListPresenterInterface    evoucher_centers_listPresenterInterface;
    LoginPresenterInterface                    loginPresenterInterface ;


    public DataManager(Evoucher_centersDatePresenterInterface evoucher_centersDatePresenterInterface ) {
        this.evoucher_centersDatePresenterInterface = evoucher_centersDatePresenterInterface;

    }
    public DataManager(LoginPresenterInterface loginPresenterInterface ) {
        this.loginPresenterInterface = loginPresenterInterface;

    }

    public DataManager(Evoucher_centers_ListPresenterInterface evoucher_centers_listPresenterInterface) {
        this.evoucher_centers_listPresenterInterface = evoucher_centers_listPresenterInterface;
    }

    @Override
    public void OnSuccessLogin() {
        loginPresenterInterface.onSuccessLogin();

    }

    @Override
    public void OnFailLogin() {
        loginPresenterInterface.onFailedLogin();
    }

    @Override
    public void Login(String mUsername, String mPassword, String mCenterId) {
        this.mCenterId=mCenterId;
        this.mPassword=mPassword;
        this.mUsername=mUsername;
        retrofitService   = new RetrofitService( this);
        retrofitService.Login(mUsername,mPassword,mCenterId);

    }

    @Override
    public void SendDataToService_EvoucherCenterDate( String mTransactionId, String mFromDate, String mToDate) {
        retrofitService                   = new RetrofitService( this);
        retrofitService.getEvoucher_centers(mUsername,mPassword,mCenterId,mTransactionId,mFromDate,mToDate);

    }

    @Override
    public void OnSuccessReturnList(List<Evoucher_Centers_Model> ListModelOf_EvoucherCenters) {
        ListModelOf_EvoucherCentersStored=ListModelOf_EvoucherCenters;
        evoucher_centersDatePresenterInterface.OnSuccessResponse_Evoucher_centers();


    }

    @Override
    public List<Evoucher_Centers_Model> GetListModelOf_EvoucherCenters() {
        return ListModelOf_EvoucherCentersStored;
    }


    @Override
    public void OnEmptyData() {
        evoucher_centersDatePresenterInterface.OnEmptyResponse_Evoucher_centers();

    }
}
