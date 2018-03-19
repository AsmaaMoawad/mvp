package com.example.asmaa.mvp_momken2.Activity;

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


    String mUsername , mCenterId , mPassword;
    LoginPresenter presenter;




      @BindView(R.id.login_progress)             ProgressBar progressBar;
      @BindView(R.id.etName)                     EditText username;
      @BindView(R.id.etPass)                     EditText password;
      @BindView(R.id.etCenterID)                 EditText cenID;




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
        username.setError(getString(R.string.invalidUserName));


    }

    @Override
    public void setPasworsdError() {
        password.setError(getString(R.string.invalidPassword));

    }


    @Override
    public void setCentidError() {
        cenID.setError(getString(R.string.invalidCenterID));

    }




    @Override
    public void OnSuccess(String us , String b ,int d) {
        Toast.makeText(this,"SuccessLogin"+ us +" "+ b +" "+ String.valueOf(d),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnFail() {
        Toast.makeText(this,"FailLogin",Toast.LENGTH_SHORT).show();


    }


    @OnClick(R.id.btnLogin)
    public void login(){
        mUsername=username.getText().toString();

        mPassword=password.getText().toString();

        mCenterId=cenID.getText().toString();

        presenter = new LoginPresenter(this,mUsername,mPassword,mCenterId);


        presenter.LoginUser();

    }


}

