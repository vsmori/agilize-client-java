package com.agilize.model;


public class outGetBillResponse extends BillRequest {

    BillResponse response;

    public outGetBillResponse() {
    }

    @SuppressWarnings("unused")
    public BillResponse getResponse() {
        return response;
    }
}