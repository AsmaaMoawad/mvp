package com.example.asmaa.mvp_momken2.Presenter;

import android.content.Context;
import android.content.Intent;


import com.example.asmaa.mvp_momken2.Activity.Evoucher_centers_DateActivity;
import com.example.asmaa.mvp_momken2.Model.DataManager;
import com.example.asmaa.mvp_momken2.Service.RetrofitService;
import com.example.asmaa.mvp_momken2.View.LoginView;


/**
 * Created by Asmaa on 1/30/2018.
 */

public class LoginPresenter  implements  LoginPresenterInterface {


    Context         mContext ;

    LoginView        loginView;
    String           mUsername , mPassword ,mCenterId;
    DataManager     dataManager;

    public LoginPresenter(LoginView view, String mUsername, String mPassword, String mCenterId,Context mContext ) {
        this.loginView = view;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mCenterId = mCenterId;
        this.mContext=mContext;

    }


    public boolean CheckUsername() {
        if (mUsername.isEmpty()) {
            loginView.setUsernameError();
            loginView.hideProgress();
            return false;
        }

        return true;
    }


    public boolean CheckPassword() {
        if (mPassword.isEmpty()) {
            loginView.setPasworsdError();
            loginView.hideProgress();
            return false;
        }


        return true;
    }


    public boolean CheckCenID() {
        if (mCenterId.isEmpty()) {
            loginView.setCentidError();
            loginView.hideProgress();
            return false;
        }

        return true;
    }

  @Override
    public void LoginUser() {
        loginView.showProgress();

        if ((CheckCenID()) & (CheckPassword()) & (CheckUsername())) {

            dataManager = new DataManager(this);
            dataManager.Login(mUsername,mPassword,mCenterId);


        }
    }



    public void onSuccessLogin()
    {



        loginView.OnSuccessLogin();
        loginView.hideProgress();



    }



    public void onFailedLogin(){
        loginView.OnFailLogin();
        loginView.hideProgress();


    }
}

