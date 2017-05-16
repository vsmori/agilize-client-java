package com.agilize.model;

public class CreditPaymentTypes {
    public static final String Visa = "Visa";
    public static final String MasterCard = "MasterCard";

    //@StringDef({ Visa, MasterCard })
    public @interface CreditPaymentTypesDef { }

    public final String key;

    public CreditPaymentTypes(@CreditPaymentTypesDef String key) {
        this.key = key;
    }

    public static int getDrawable(String key) {
        return 1;
        /*
        int drawable = R.drawable.card_list;

        switch (key) {
            case "Visa":
                drawable = R.drawable.card_visa;
                break;
            case "MasterCard":
                drawable = R.drawable.card_master;
                break;
        }

        return drawable;
        */
    }
}