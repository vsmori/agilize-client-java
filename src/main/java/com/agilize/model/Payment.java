package com.agilize.model;

import java.io.Serializable;

public class Payment implements Serializable {

    private String placeName;
    private String placeLogo;
    private String userId;
    private String placeUserId;
    private String date;
    private double amount;
    private String processor;
    private String creditCardBrand;
    private String creditCardNumberCardEnd;
    private String creditCardHolderName;
    private String processorResponse;
    private String processorAuthorizationCode;

    public Payment() {
    }

    @SuppressWarnings("unused")
    public void setPlaceName(String placeName) { this.placeName = placeName; }

    @SuppressWarnings("unused")
    public String getPlaceName() { return this.placeName; }

    @SuppressWarnings("unused")
    public void setUserId(String userId) { this.userId = userId; }

    @SuppressWarnings("unused")
    public String getUserId() { return this.userId; }

    @SuppressWarnings("unused")
    public void setPlaceUserId(String placeUserId) { this.placeUserId = placeUserId; }

    @SuppressWarnings("unused")
    public String getPlaceUserId() { return this.placeUserId; }

    @SuppressWarnings("unused")
    public void setPlaceLogo(String placeLogo) { this.placeLogo = placeLogo; }

    @SuppressWarnings("unused")
    public String getPlaceLogo() { return this.placeLogo; }

    @SuppressWarnings("unused")
    public void setAmount(double amount) { this.amount = amount; }

    @SuppressWarnings("unused")
    public double getAmount() { return this.amount; }

    @SuppressWarnings("unused")
    public void setDate(String date) { this.date = date; }

    @SuppressWarnings("unused")
    public String getDate() { return this.date; }

    @SuppressWarnings("unused")
    public void setProcessor(String processor) { this.processor = processor; }

    @SuppressWarnings("unused")
    public String getProcessor() { return this.processor; }


    @SuppressWarnings("unused")
    public void setCreditCardBrand(String creditCardBrand) { this.creditCardBrand = creditCardBrand; }

    @SuppressWarnings("unused")
    public String getCreditCardBrand() { return this.creditCardBrand; }

    @SuppressWarnings("unused")
    public void setCreditCardNumberCardEnd(String creditCardNumberCardEnd) { this.creditCardNumberCardEnd = creditCardNumberCardEnd; }

    @SuppressWarnings("unused")
    public String getCreditCardNumberCardEnd() { return this.creditCardNumberCardEnd; }

    @SuppressWarnings("unused")
    public void setCreditCardHolderName(String creditCardHolderName) { this.creditCardHolderName = creditCardHolderName; }

    @SuppressWarnings("unused")
    public String getCreditCardHolderName() { return this.creditCardHolderName; }

    @SuppressWarnings("unused")
    public void setProcessorResponse(String processorResponse) { this.processorResponse = processorResponse; }

    @SuppressWarnings("unused")
    public String getProcessorResponse() { return this.processorResponse; }

    @SuppressWarnings("unused")
    public void setProcessorAuthorizationCode(String processorAuthorizationCode) { this.processorAuthorizationCode = processorAuthorizationCode; }

    @SuppressWarnings("unused")
    public String getProcessorAuthorizationCode() { return this.processorAuthorizationCode; }
}
