package com.agilize.model;

/**
 * Created by Developer on 29/11/2016.
 */
public class ItemPaymentModel {

    private String itemName;
    private String itemValues;
    private String itemValueFixed;
    private int itemImageUrl;
    private String itemAmount;
    private boolean itemChk;
    private int ItemRelativeLayout;

   public ItemPaymentModel (String name, String values, int imageUrl, String amount,
                            String valueFixed, boolean statusChk, int relativeLayout){

        itemName = name;
        itemValues = values;
        itemImageUrl = imageUrl;
        itemAmount = amount;
        itemValueFixed = valueFixed;
        itemChk = statusChk;
        ItemRelativeLayout = relativeLayout;
    }


    public int getItemRelativeLayout() {
        return ItemRelativeLayout;
    }

    public void setItemRelativeLayout(int itemRelativeLayout) {
        ItemRelativeLayout = itemRelativeLayout;
    }

    public boolean isItemChk() {
        return itemChk;
    }

    public void setItemChk(boolean itemChk) {
        this.itemChk = itemChk;
    }

    public String getItemValueFixed() {
        return itemValueFixed;
    }

    public void setItemValueFixed(String itemValueFixed) {
        this.itemValueFixed = itemValueFixed;
    }

    public String getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(String itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemValues() {
        return itemValues;
    }

    public void setItemValues(String itemValues) {
        this.itemValues = itemValues;
    }


    public int getItemImageUrl() {
        return itemImageUrl;
    }

    public void setItemImageUrl(int itemImageUrl) {
        this.itemImageUrl = itemImageUrl;
    }
}
