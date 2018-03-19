package com.example.asmaa.mvp_momken2.Service;

import com.example.asmaa.mvp_momken2.Utils.URLs;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Asmaa on 1/31/2018.
 */

public class ServiceConnection {

    public static Retrofit retrofit=null;
    public static Retrofit getApiClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(URLs.ServerUrl).
                    addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }
}
