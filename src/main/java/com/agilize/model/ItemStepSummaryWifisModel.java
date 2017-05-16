package com.agilize.model;

/**
 * Created by Developer on 06/12/2016.
 */
public class ItemStepSummaryWifisModel {

    private String itemSummaryName;
    private String itemImgSummaryAddress;

    public ItemStepSummaryWifisModel (String name, String address){

        itemSummaryName = name;
        itemImgSummaryAddress = address;

    }

    public String getItemSummaryName() {
        return itemSummaryName;
    }

    public void setItemSummaryName(String itemSummaryName) {
        this.itemSummaryName = itemSummaryName;
    }

    public String getItemImgSummaryAddress() {
        return itemImgSummaryAddress;
    }

    public void setItemImgSummaryAddress(String itemImgSummaryAddress) {
        this.itemImgSummaryAddress = itemImgSummaryAddress;
    }
}
