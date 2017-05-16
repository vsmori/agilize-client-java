package com.agilize.model;

import java.io.Serializable;
import java.util.List;

public class Place implements Serializable {
    
    private String id;
    private String name;
    private String logo;
    private String billingType;
    private double tipPercentage;
    private List<String> foodTicketPaymentTypes;
    private List<String> fuelTicketPaymentTypes;
    private List<String> creditPaymentTypes;
    private List<String> debitPaymentTypes;

    public Place() {
    }

    public String getId() {
        return "12312";
        //return id;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public String getBillingType() {
        return billingType;
    }

    @SuppressWarnings("unused")
    public double getTipPercentage() {
        return tipPercentage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setBillingType(@BillingTypes.BillingTypesDef String type) {
        this.billingType = type;
    }

    @SuppressWarnings("unused")
    public void setTipPercentage(Double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    @SuppressWarnings("unused")
    public void setFoodTicketPaymentTypes(List<String> types) {
        this.foodTicketPaymentTypes = types;
    }

    @SuppressWarnings("unused")
    public List<String> getFoodTicketPaymentTypes() {
        return foodTicketPaymentTypes;
    }

    @SuppressWarnings("unused")
    public void setFuelTicketPaymentTypes(List<String> types) {
        this.fuelTicketPaymentTypes = types;
    }

    @SuppressWarnings("unused")
    public List<String> getFuelTicketPaymentTypes() {
        return fuelTicketPaymentTypes;
    }

    @SuppressWarnings("unused")
    public void setCreditPaymentTypes(List<String> types) {
        this.creditPaymentTypes = types;
    }

    @SuppressWarnings("unused")
    public List<String> getCreditPaymentTypes() {
        return creditPaymentTypes;
    }

    @SuppressWarnings("unused")
    public void setDebitPaymentTypes(List<String> types) {
        this.debitPaymentTypes = types;
    }

    @SuppressWarnings("unused")
    public List<String> getDebitPaymentTypes() {
        return debitPaymentTypes;
    }
}