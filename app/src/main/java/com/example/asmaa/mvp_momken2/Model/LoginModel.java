package com.example.asmaa.mvp_momken2.Model;

import com.example.asmaa.mvp_momken2.Presenter.LoginPresenterInterface;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Asmaa on 1/30/2018.
 */

public  class LoginModel {


    public String getCentername() {
        return centername;
    }

    public void setCentername(String centername) {
        this.centername = centername;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Expose

    @SerializedName("centername")
    public String centername;
    @Expose
    @SerializedName("balance")
    public String balance;
    @Expose
    @SerializedName("centerId")
    public int centerId;
    @Expose
    @SerializedName("userRole")
    public String userRole;
    @Expose
    @SerializedName("password")
    public String password;
    @Expose
    @SerializedName("login")
    public String login;
    @Expose
    @SerializedName("userName")
    public String userName;
    @Expose
    @SerializedName("userId")
    public int userId;
    @Expose
    @SerializedName("CenterId")
    public int CenterId;
    @Expose
    @SerializedName("UserRole")
    public String UserRole;
    @Expose
    @SerializedName("Password")
    public String Password;
    @Expose
    @SerializedName("Login")
    public String Login;
    @Expose
    @SerializedName("UserName")
    public String UserName;
    @Expose
    @SerializedName("UserId")
    public int UserId;
}
