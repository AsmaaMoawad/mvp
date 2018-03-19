package com.example.asmaa.mvp_momken2.Presenter;

import android.util.Log;


import com.example.asmaa.mvp_momken2.Model.LoginModel;
import com.example.asmaa.mvp_momken2.Service.AllServices;
import com.example.asmaa.mvp_momken2.View.LoginView;


/**
 * Created by Asmaa on 1/30/2018.
 */

public class LoginPresenter  implements  LoginPresenterInterface {


    LoginModel loginModel ;

    LoginView        view;
    String           mUsername , mPassword ,mCenterId;
    AllServices      allServices;

    public LoginPresenter(LoginView view, String mUsername, String mPassword, String mCenterId) {
        this.view = view;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mCenterId = mCenterId;

    }


    public boolean CheckUsername() {
        if (mUsername.isEmpty()) {
            view.setUsernameError();
            view.hideProgress();
            return false;
        }

        return true;
    }


    public boolean CheckPassword() {
        if (mPassword.isEmpty()) {
            view.setPasworsdError();
            view.hideProgress();
            return false;
        }


        return true;
    }


    public boolean CheckCenID() {
        if (mCenterId.isEmpty()) {
            view.setCentidError();
            view.hideProgress();
            return false;
        }

        return true;
    }


    public void LoginUser() {
        view.showProgress();

        if ((CheckCenID()) & (CheckPassword()) & (CheckUsername())) {
            allServices   = new AllServices( this);
            allServices.Login(mUsername,mPassword,mCenterId);

        }
    }



    public void onSuccessLogin(String us,String b, int d)
    {


        loginModel=new LoginModel(this);
        loginModel.setUserName(us);
        view.OnSuccess(us,b,d);
        view.hideProgress();


    }



    public void onFailedLogin(){
        view.OnFail();
        view.hideProgress();


    }
}

