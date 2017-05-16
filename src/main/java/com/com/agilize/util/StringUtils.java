package com.agilize.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {

    private static Locale ptBr = new Locale("pt", "BR");

    public static String formatPercent(double percent) {
        NumberFormat formatter = NumberFormat.getPercentInstance(ptBr);

        return formatter.format(percent);
    }

    public static String formatMoney(double money) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(ptBr);

        return formatter.format(money);
    }

    public static String formatMoneyNoDollar(double money) {
        DecimalFormat formatter = (DecimalFormat) DecimalFormat.getCurrencyInstance(ptBr);
        String symbol = formatter.getCurrency().getSymbol();


        return formatter.format(money).replace(symbol, "");
    }

    public static Number parseMoney(String money) throws java.text.ParseException {
        DecimalFormat formatter = (DecimalFormat) DecimalFormat.getCurrencyInstance(ptBr);

        return formatter.parse(money);
    }
}