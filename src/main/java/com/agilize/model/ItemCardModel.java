package com.agilize.model;

public class ItemCardModel {

    private String itemName;
    private int itemImage;
    private int itemValidity;
    private int itemNumber;
    private int itemCVC;

    public ItemCardModel (String name, int validity, int number, int cvc, int image){

        itemImage = image;
        itemName = name;
        itemValidity = validity;
        itemNumber = number;
        itemCVC = cvc;

    }


    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemValidity() {
        return itemValidity;
    }

    public void setItemValidity(int itemValidity) {
        this.itemValidity = itemValidity;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemCVC() {
        return itemCVC;
    }

    public void setItemCVC(int itemCVC) {
        this.itemCVC = itemCVC;
    }
}
