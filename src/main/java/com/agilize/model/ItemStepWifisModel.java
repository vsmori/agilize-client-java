package com.agilize.model;

/**
 * Created by Developer on 05/12/2016.
 */
public class ItemStepWifisModel {

    private String itemName;
    private String itemAddress;
    private boolean statusChk;

    public ItemStepWifisModel (String name, String address, boolean status){

        itemName = name;
        itemAddress = address;
        statusChk = status;

    }

    public boolean isStatusChk() {
        return statusChk;
    }

    public void setStatusChk(boolean statusChk) {
        this.statusChk = statusChk;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemAddress() {
        return itemAddress;
    }

    public void setItemAddress(String itemAddress) {
        this.itemAddress = itemAddress;
    }
}
