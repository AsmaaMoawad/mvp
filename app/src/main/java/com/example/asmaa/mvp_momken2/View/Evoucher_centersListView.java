package com.example.asmaa.mvp_momken2.View;

import android.widget.Toast;

import com.example.asmaa.mvp_momken2.Model.Evoucher_Centers_Model;

import java.util.List;

/**
 * Created by Asmaa on 3/11/2018.
 */

public interface Evoucher_centersListView {
    void OnSuccessResponse(List<Evoucher_Centers_Model> ListModelOf_EvoucherCenters);
}
