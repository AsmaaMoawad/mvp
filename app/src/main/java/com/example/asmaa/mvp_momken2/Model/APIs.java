package com.example.asmaa.mvp_momken2.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Asmaa on 1/31/2018.
 */

public interface APIs {
    @GET("UserManagmentLogin")
    Call<LoginModel> Loginconnection(@Query("UserName") String UserName, @Query("Password") String Password, @Query("CenId") String cenID, @Query("Source") String s);


    @GET("Evoucher_centers")
    Call<List<Evoucher_Centers_Model>>getEvoucher_centers(@Query("UserName") String UserName, @Query("Password") String Password, @Query("CenterID") String cenID, @Query("transactionId") String transactionId, @Query("fromDate") String fromDate , @Query("toDate") String toDate);
}


