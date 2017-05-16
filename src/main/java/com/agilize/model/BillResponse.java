package com.agilize.model;

import java.io.Serializable;

public class BillResponse extends Response{
    public BillResponseData data;

    public BillResponse() {
    }

    @SuppressWarnings("unused")
    public BillResponseData getData() {
        return data;
    }
}

