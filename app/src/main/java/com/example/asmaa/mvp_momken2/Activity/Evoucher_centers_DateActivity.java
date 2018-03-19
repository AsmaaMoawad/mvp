package com.example.asmaa.mvp_momken2.Activity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asmaa.mvp_momken2.Presenter.Evoucher_centersDatePresenter;
import com.example.asmaa.mvp_momken2.R;
import com.example.asmaa.mvp_momken2.View.Evoucher_centersDateView;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Evoucher_centers_DateActivity extends AppCompatActivity implements Evoucher_centersDateView


{


    @BindView(R.id.fromDate)                       TextView        fromDisplayDate_tv  ;
    @BindView(R.id.toDate)                         TextView        toDisplayDate_tv    ;


    String    ToDate, FromDate                 ;

    int             year, day, month                 ,
                    FLAG_START_DATE= 0               ,
                    FLAG_END_DATE=1                  ;






    Evoucher_centersDatePresenter      presenter     ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        setContentView(R.layout.activity_evoucher_centers_date);
        ButterKnife.bind(this);


    }


    @OnClick(R.id.SendDate)
    void OnClick() {
        FromDate    = fromDisplayDate_tv.getText().toString();
        ToDate      = toDisplayDate_tv.getText().toString();
        presenter   = new Evoucher_centersDatePresenter( this, "0", FromDate, ToDate);
        presenter.GetEvoucher_centerslist();


    }

    @OnClick(R.id.ChangeFromDate)
    public void ChangeFromDate() {
         DatePickerDialog( FLAG_START_DATE);
    }

    @OnClick(R.id.ChangeToDate)
    public void ChangetoDate() {
        DatePickerDialog(FLAG_END_DATE);

    }







    @Override
    public void OnEmptyResponse() {
        Toast.makeText(this,"لا يوجد عمليات فى هذه الفتره ",Toast.LENGTH_LONG).show();


    }

    @Override
    public void OnSuccess() {
        Intent intent=new Intent(this, Evoucher_centers_ListActivity.class);
        startActivity(intent);

    }



    void DatePickerDialog( final int flag){

        Calendar c  = Calendar.getInstance();

        year        = c.get(Calendar.YEAR);
        month       = c.get(Calendar.MONTH);
        day         = c.get(Calendar.DAY_OF_MONTH);



        DatePickerDialog DatePiker = new DatePickerDialog(Evoucher_centers_DateActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {




                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month, day);

                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");


                if (flag == FLAG_START_DATE) {
                    fromDisplayDate_tv.setText(dateFormat.format(calendar.getTime()));
                } else if (flag == FLAG_END_DATE) {
                    toDisplayDate_tv.setText(dateFormat.format(calendar.getTime()));
                }


            }
        },year,month,day);


        DatePiker.show();
    }



}
