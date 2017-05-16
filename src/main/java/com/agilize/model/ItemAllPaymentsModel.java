package com.agilize.model;

/**
 * Created by Developer on 01/12/2016.
 */
public class ItemAllPaymentsModel {

        private String itemNameLocal;
        private int itemImgCard;
        private String itemValue;
        private String itemDate;

        public ItemAllPaymentsModel(String name, int imgCard, String value, String date) {

            itemNameLocal = name;
            itemImgCard = imgCard;
            itemValue = value;
            itemDate = date;
        }

    public String getItemNameLocal() {
        return itemNameLocal;
    }

    public void setItemNameLocal(String itemNameLocal) {
        this.itemNameLocal = itemNameLocal;
    }

    public int getItemImgCard() {
        return itemImgCard;
    }

    public void setItemImgCard(int itemImgCard) {
        this.itemImgCard = itemImgCard;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemDate() {
        return itemDate;
    }

    public void setItemDate(String itemDate) {
        this.itemDate = itemDate;
    }


}
