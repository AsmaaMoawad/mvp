package com.example.asmaa.mvp_momken2.Adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asmaa.mvp_momken2.Model.Evoucher_Centers_Model;
import com.example.asmaa.mvp_momken2.R;

import java.util.List;

/**
 * Created by Asmaa on 2/20/2018.
 */

public class Evoucher_centers_Adaptor extends RecyclerView.Adapter<Evoucher_centers_Adaptor.ViewHolder> {






    List<Evoucher_Centers_Model> ListModelOf_Evoucher_Centers;


    public Evoucher_centers_Adaptor(List<Evoucher_Centers_Model> ListOfEvoucherModel) {
        this.ListModelOf_Evoucher_Centers = ListOfEvoucherModel;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.customitem_evoucher_centers,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
      final Evoucher_Centers_Model evoucher_centersModel=ListModelOf_Evoucher_Centers.get(position);
      holder.bindData(evoucher_centersModel);

    }


    @Override
    public int getItemCount() {
        return ListModelOf_Evoucher_Centers.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Value_Evoucher_Centers;
        TextView AddedTime_Evoucher_Centers;
        TextView ServiceName_Evoucher_Centers;


        public ViewHolder(View itemView) {
            super(itemView);
            Value_Evoucher_Centers        = (TextView)itemView.findViewById(R.id.cardvalue);
            AddedTime_Evoucher_Centers    =(TextView)itemView.findViewById(R.id.cardTime);
            ServiceName_Evoucher_Centers  =(TextView)itemView.findViewById(R.id.cardname);

        }
        public void bindData(Evoucher_Centers_Model obj) {
            AddedTime_Evoucher_Centers.setText(obj.getAddedTime());
            ServiceName_Evoucher_Centers.setText(obj.getServiceName());
            Value_Evoucher_Centers.setText(obj.getValue());

        }
    }
}
