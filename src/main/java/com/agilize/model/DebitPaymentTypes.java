package com.agilize.model;

public class DebitPaymentTypes {
    public static final String Visa = "Visa";
    public static final String MasterCard = "MasterCard";

    public @interface DebitPaymentTypesDef { }

    public final String key;

    public DebitPaymentTypes(@DebitPaymentTypesDef String key) {
        this.key = key;
    }
}