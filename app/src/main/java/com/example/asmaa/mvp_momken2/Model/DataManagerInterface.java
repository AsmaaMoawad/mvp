package com.example.asmaa.mvp_momken2.Model;


import com.example.asmaa.mvp_momken2.Presenter.Evoucher_centersDatePresenter;

import java.util.List;

/**
 * Created by Asmaa on 3/14/2018.
 */

public interface DataManagerInterface {

    void OnSuccessLogin();
    void OnFailLogin();
    void Login( String mUsername, String mPassword, String mCenterId);


    void SendDataToService_EvoucherCenterDate(String mTransactionId, String mFromDate, String mToDate);
    void OnSuccessReturnList(List<Evoucher_Centers_Model>ListModelOf_EvoucherCenters);

    List<Evoucher_Centers_Model>  GetListModelOf_EvoucherCenters();
    void OnEmptyData();

}
