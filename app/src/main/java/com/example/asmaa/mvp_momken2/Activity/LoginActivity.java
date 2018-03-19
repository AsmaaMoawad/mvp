package com.example.asmaa.mvp_momken2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.asmaa.mvp_momken2.Presenter.LoginPresenter;
import com.example.asmaa.mvp_momken2.R;
import com.example.asmaa.mvp_momken2.View.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginView {


    String           mUsername , mCenterId , mPassword;
    LoginPresenter   LoginPresenter;





      @BindView(R.id.login_progress)             ProgressBar progressBar;
      @BindView(R.id.etName)                     EditText    et_mUsername;
      @BindView(R.id.etPass)                     EditText    et_mPassword;
      @BindView(R.id.etCenterID)                 EditText    et_mCenterId;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        et_mUsername.setError(getString(R.string.invalidUserName));


    }

    @Override
    public void setPasworsdError() {
        et_mPassword.setError(getString(R.string.invalidPassword));

    }


    @Override
    public void setCentidError() {
        et_mCenterId.setError(getString(R.string.invalidCenterID));

    }




    @Override
    public void OnSuccessLogin() {

        Intent intent= new Intent(this,Evoucher_centers_DateActivity.class);
        startActivity(intent);

    }

    @Override
    public void OnFailLogin() {
        Toast.makeText(this,"FailLogin",Toast.LENGTH_SHORT).show();


    }


    @OnClick(R.id.btnLogin)
    public void login(){

        mUsername = et_mUsername.getText().toString();

        mPassword = et_mPassword.getText().toString();

        mCenterId = et_mCenterId.getText().toString();

        LoginPresenter = new LoginPresenter(this,mUsername,mPassword,mCenterId,this);
        LoginPresenter.LoginUser();


    }


}

