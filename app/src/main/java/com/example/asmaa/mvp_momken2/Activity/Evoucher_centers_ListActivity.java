package com.example.asmaa.mvp_momken2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.asmaa.mvp_momken2.Adaptors.Evoucher_centers_Adaptor;
import com.example.asmaa.mvp_momken2.Model.Evoucher_Centers_Model;
import com.example.asmaa.mvp_momken2.Presenter.Evoucher_centersDatePresenter;
import com.example.asmaa.mvp_momken2.Presenter.Evoucher_centers_ListPresenter;
import com.example.asmaa.mvp_momken2.R;
import com.example.asmaa.mvp_momken2.View.Evoucher_centersListView;

import java.util.List;

public class Evoucher_centers_ListActivity extends AppCompatActivity implements Evoucher_centersListView {

    RecyclerView                evoucher_centers_RecycleView  ;

    Evoucher_centers_Adaptor    evoucher_centers_adaptor      ;


    Evoucher_centers_ListPresenter evoucher_centers_listPresenter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_evoucher_centers__list);
        evoucher_centers_RecycleView   = (RecyclerView) findViewById(R.id.RecycleVoucherCenter);
        evoucher_centers_RecycleView.setHasFixedSize(false);
        evoucher_centers_RecycleView.setLayoutManager(new LinearLayoutManager(this));
        evoucher_centers_listPresenter=new Evoucher_centers_ListPresenter(this);
        evoucher_centers_listPresenter.GetEvoucher_centerslist();


    }




    @Override
    public void OnSuccessResponse(List<Evoucher_Centers_Model> ListModelOf_EvoucherCenters) {
        Toast.makeText(this,"كل العمليات خلال هذه الفتره",Toast.LENGTH_LONG);
        evoucher_centers_adaptor     = new Evoucher_centers_Adaptor(ListModelOf_EvoucherCenters);
        evoucher_centers_RecycleView.setAdapter(evoucher_centers_adaptor);
    }

}


