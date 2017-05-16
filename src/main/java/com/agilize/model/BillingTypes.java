package com.agilize.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BillingTypes {
    public static final String AMOUNT = "amount"; // Valor livre
    public static final String CARD = "card"; // Comanda
    public static final String TABLE = "table";  // mesa

    public @interface BillingTypesDef {}

    public final String key;

    public BillingTypes(@BillingTypesDef String key) {
        this.key = key;
    }

    public static @BillingTypesDef String parse( String key) throws Exception {
        switch (key) {
            case AMOUNT:
                return AMOUNT;
            case CARD:
                return CARD;
            case TABLE:
                return TABLE;
        }
        throw new Exception("Value not valid : "+key);
    }
}