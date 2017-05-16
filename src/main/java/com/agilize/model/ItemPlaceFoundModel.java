package com.agilize.model;

/**
 * Created by Developer on 30/11/2016.
 */
public class ItemPlaceFoundModel {


    private String itemName;
    private int itemImgCompany;

    public ItemPlaceFoundModel (String name, int imageUrl){

        itemName = name;
        itemImgCompany = imageUrl;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImgCompany() {
        return itemImgCompany;
    }

    public void setItemImgCompany(int itemImgCompany) {
        this.itemImgCompany = itemImgCompany;
    }
}
