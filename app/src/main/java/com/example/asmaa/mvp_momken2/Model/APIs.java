package com.example.asmaa.mvp_momken2.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Asmaa on 1/31/2018.
 */

public interface APIs {
     void Login(String us, String p , String cid  );

    @GET("api/UserManagmentLogin")
    Call<LoginModel> Loginconnection(@Query("UserName") String UserName, @Query("Password") String Password, @Query("CenId") String cenID, @Query("Source") String s);
}
