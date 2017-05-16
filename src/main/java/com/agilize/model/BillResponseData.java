package com.agilize.model;

import java.io.Serializable;

public class BillResponseData implements Serializable {
    @SuppressWarnings("unused")
    public String place_id;
    @SuppressWarnings("unused")
    public String place_user_id;
    public Bill bill;

    public BillResponseData() {
    }

    @SuppressWarnings("unused")
    public Bill getBill() {
        return bill;
    }
    @SuppressWarnings("unused")
    public String getPlaceId() {
        return place_id;
    }

    @SuppressWarnings("unused")
    public String getPlaceUserId() {
        return place_user_id;
    }
}