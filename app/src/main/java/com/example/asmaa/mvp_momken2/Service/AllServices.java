package com.example.asmaa.mvp_momken2.Service;

import android.util.Log;

import com.example.asmaa.mvp_momken2.Model.APIs;
import com.example.asmaa.mvp_momken2.Model.LoginModel;
import com.example.asmaa.mvp_momken2.Presenter.LoginPresenter;
import com.example.asmaa.mvp_momken2.Presenter.LoginPresenterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asmaa on 2/3/2018.
 */

public class AllServices   {


    LoginPresenterInterface loginPresenterInterface;


    public AllServices(LoginPresenterInterface loginPresenterInterface) {
        this.loginPresenterInterface=loginPresenterInterface;
    }

    public void Login(String us, String p , String cid  ) {

        APIs Api = ServiceConnection.getApiClient().create(APIs.class);
        Call<LoginModel> call = Api.Loginconnection(us, p, cid, "Mobiwire");


        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {

                if (!response.body().getUserName().equals("0")) {
                    Log.d("xx", "Response");
                    loginPresenterInterface.onSuccessLogin(response.body().getUserName(),response.body().getBalance(),response.body().getCenterId());
//                    Toast.makeText(mContext,   "اهلا", Toast.LENGTH_LONG).show();



                } else {
                    loginPresenterInterface.onFailedLogin();


                }


            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {


            }
        });
    }




//    @Override
//    public Call<LoginModel> Loginconnection(String UserName, String Password, String cenID, String s) {
//        return null;
//    }
}