package com.example.asmaa.mvp_momken2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Asmaa on 2/21/2018.
 */

public class Evoucher_Centers_Model implements Serializable {


    @SerializedName("val")
        @Expose
        private String val;
        @SerializedName("serv_name")
        @Expose
        private String servName;
        @SerializedName("Message")
        @Expose
        private String message;
        @SerializedName("Voucher_num")
        @Expose
        private String voucherNum;
        @SerializedName("Serial")
        @Expose
        private String serial;
        @SerializedName("Code")
        @Expose
        private String code;
        @SerializedName("Mobile")
        @Expose
        private String mobile;
        @SerializedName("Value")
        @Expose
        private String value;
        @SerializedName("Service_name")
        @Expose
        private String serviceName;
        @SerializedName("Invoice_num")
        @Expose
        private String invoiceNum;
        @SerializedName("totalWithAddedMoney")
        @Expose
        private Object totalWithAddedMoney;
        @SerializedName("AddedTime")
        @Expose
        private String addedTime;
        @SerializedName("BalanceNow")
        @Expose
        private Object balanceNow;




        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public String getServName() {
            return servName;
        }

        public void setServName(String servName) {
            this.servName = servName;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getVoucherNum() {
            return voucherNum;
        }

        public void setVoucherNum(String voucherNum) {
            this.voucherNum = voucherNum;
        }

        public String getSerial() {
            return serial;
        }

        public void setSerial(String serial) {
            this.serial = serial;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public String getInvoiceNum() {
            return invoiceNum;
        }

        public void setInvoiceNum(String invoiceNum) {
            this.invoiceNum = invoiceNum;
        }

        public Object getTotalWithAddedMoney() {
            return totalWithAddedMoney;
        }

        public void setTotalWithAddedMoney(Object totalWithAddedMoney) {
            this.totalWithAddedMoney = totalWithAddedMoney;
        }

        public String getAddedTime() {
            return addedTime;
        }

        public void setAddedTime(String addedTime) {
            this.addedTime = addedTime;
        }

        public Object getBalanceNow() {
            return balanceNow;
        }

        public void setBalanceNow(Object balanceNow) {
            this.balanceNow = balanceNow;
        }


    }
