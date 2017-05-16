package com.agilize.model;

public class FoodTicketPaymentTypes {
    public static final String VR = "VR";
    public static final String Sodexo = "Sodexo";
    public static final String Alelo = "Alelo";

    public @interface FoodTicketPaymentTypesDef { }

    public final String key;

    public FoodTicketPaymentTypes(@FoodTicketPaymentTypesDef String key) {
        this.key = key;
    }
}