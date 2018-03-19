package com.example.asmaa.mvp_momken2.Presenter;

import com.example.asmaa.mvp_momken2.Model.DataManager;
import com.example.asmaa.mvp_momken2.Model.DataManagerInterface;
import com.example.asmaa.mvp_momken2.Model.Evoucher_Centers_Model;
import com.example.asmaa.mvp_momken2.Service.RetrofitService;
import com.example.asmaa.mvp_momken2.View.Evoucher_centersListView;

import java.util.List;

/**
 * Created by Asmaa on 3/11/2018.
 */

public class Evoucher_centers_ListPresenter implements Evoucher_centers_ListPresenterInterface {

    static List<Evoucher_Centers_Model> ListModelOf_EvoucherCenters ;
    Evoucher_centersListView          Evoucher_centersListView;
    DataManager                       dataManager ;

    public Evoucher_centers_ListPresenter(Evoucher_centersListView evoucher_centersListView) {
        this.Evoucher_centersListView = evoucher_centersListView;
    }





   @Override
    public  void   GetEvoucher_centerslist(){
        dataManager = new DataManager(this);
        ListModelOf_EvoucherCenters =dataManager.GetListModelOf_EvoucherCenters();
        Evoucher_centersListView .OnSuccessResponse(ListModelOf_EvoucherCenters);
    }


}
