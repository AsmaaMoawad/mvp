package com.example.asmaa.mvp_momken2.Service;

import android.util.Log;

import com.example.asmaa.mvp_momken2.Model.APIs;
import com.example.asmaa.mvp_momken2.Model.DataManagerInterface;
import com.example.asmaa.mvp_momken2.Model.Evoucher_Centers_Model;
import com.example.asmaa.mvp_momken2.Model.LoginModel;
;
import com.example.asmaa.mvp_momken2.Presenter.LoginPresenterInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asmaa on 2/3/2018.
 */

public class RetrofitService {
       DataManagerInterface                        DataManagerInterface ;
       List<Evoucher_Centers_Model>                ListModelOf_EvoucherCenters;


    public RetrofitService(DataManagerInterface DataManagerInterface ) {
        this.DataManagerInterface = DataManagerInterface;
    }


    public void Login(String us, String p, String cid) {

        APIs Api = ServiceConnection.getApiClient().create(APIs.class);
        Call<LoginModel> call = Api.Loginconnection(us, p, cid, "Mobiwire");


        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {

                if (!response.body().getUserName().equals("0")) {

                    Log.d("xx", "Response");
                    DataManagerInterface.OnSuccessLogin();


                } else {
                    DataManagerInterface.OnFailLogin();


                }


            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                t.getMessage();


            }
        });
    }


public void getEvoucher_centers(String mUsername, String mPassword, String mCid, String mTransactionId, String mFromDate, String mToDate) {
        APIs Api = ServiceConnection.getApiClient().create(APIs.class);


        Call<List<Evoucher_Centers_Model>> call = Api.getEvoucher_centers(mUsername, mPassword, mCid, mTransactionId, mFromDate, mToDate);

            call.enqueue(new Callback<List<Evoucher_Centers_Model>>() {
                @Override
                public void onResponse(Call<List<Evoucher_Centers_Model>> call, Response<List<Evoucher_Centers_Model>> response) {

                    Log.e("res", response.body().toString() );
                    if(!(response.body().isEmpty())) {

                        ListModelOf_EvoucherCenters = response.body();
                        DataManagerInterface.OnSuccessReturnList(ListModelOf_EvoucherCenters);



                    }
                    else{
                        DataManagerInterface.OnEmptyData();


                    }



                }


                @Override
                public void onFailure(Call<List<Evoucher_Centers_Model>> call, Throwable t) {
                    t.getMessage();

                }


            });
        }

}


