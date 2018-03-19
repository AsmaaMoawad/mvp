package com.example.asmaa.mvp_momken2.View;

import com.example.asmaa.mvp_momken2.Model.LoginModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Asmaa on 1/30/2018.
 */

public interface LoginView {


    void showProgress();
    void hideProgress();

    void setUsernameError();
    void setPasworsdError();
    void  setCentidError();


    void OnSuccess(String us ,String p , int d);
    void OnFail();







}
