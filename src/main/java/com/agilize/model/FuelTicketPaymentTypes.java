package com.agilize.model;

public class FuelTicketPaymentTypes {
    public static final String Goodcard = "Goodcard";
    public static final String Valecard = "Valecard";

    public @interface FuelTicketPaymentTypesDef { }

    public final String key;

    public FuelTicketPaymentTypes(@FuelTicketPaymentTypesDef String key) {
        this.key = key;
    }
}