package com.agilize.model;


import com.agilize.util.StringUtils;

public class BillItem {

    private boolean changed = false;
    private int id;
    private String desc;
    private int quantity;
    private int new_quantity;
    private double price;
    @SuppressWarnings("unused")
    private String priceAmountStr; //@TODO: in the future, bill should have a "currency" identifier only
    private String priceStr;
    private double total;
    private String totalStr;
    private boolean checked;
    private int itemImageUrl;
    private int ItemRelativeLayout;
    private boolean itemChk;

    public BillItem() {
    }

    @SuppressWarnings("unused")
    public boolean isChanged() {
        return changed;
    }

    @SuppressWarnings("unused")
    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    @SuppressWarnings("unused")
    public void setId(int id) {
        this.id = id;
    }

    @SuppressWarnings("unused")
    public int getNew_quantity() {
        return new_quantity;
    }

    @SuppressWarnings("unused")
    public void setNew_quantity(int new_quantity) {
        this.new_quantity = new_quantity;
    }

    @SuppressWarnings("unused")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @SuppressWarnings("unused")
    public void setPrice(double price) {
        this.price = price;
    }

    @SuppressWarnings("unused")
    public String getPriceAmountStr() {
        return StringUtils.formatMoney(price);
    }

    @SuppressWarnings("unused")
    public void setPriceAmountStr(String priceAmountStr) {
        this.priceAmountStr = priceAmountStr;
    }

    @SuppressWarnings("unused")
    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    @SuppressWarnings("unused")
    public void setTotal(double total) {
        this.total = total;
    }

    @SuppressWarnings("unused")
    public void setTotalStr(String totalStr) {
        this.totalStr = totalStr;
    }

    @SuppressWarnings("unused")
    public boolean isChecked() {
        return checked;
    }

    @SuppressWarnings("unused")
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @SuppressWarnings("unused")
    public int getItemImageUrl() {
        return itemImageUrl;
    }

    @SuppressWarnings("unused")
    public void setItemImageUrl(int itemImageUrl) {
        this.itemImageUrl = itemImageUrl;
    }

    @SuppressWarnings("unused")
    public int getItemRelativeLayout() {
        return ItemRelativeLayout;
    }

    @SuppressWarnings("unused")
    public void setItemRelativeLayout(int itemRelativeLayout) {
        ItemRelativeLayout = itemRelativeLayout;
    }

    @SuppressWarnings("unused")
    public boolean isItemChk() {
        return itemChk;
    }

    @SuppressWarnings("unused")
    public void setItemChk(boolean itemChk) {
        this.itemChk = itemChk;
    }

    @SuppressWarnings("unused")
    public String getDesc() {
        return desc;
    }

    @SuppressWarnings("unused")
    public int getQuantity() {
        return (changed) ? new_quantity : quantity;
    }

    @SuppressWarnings("unused")
    public void setQuantity(int _quantity) {
        new_quantity = quantity = _quantity;
    }

    @SuppressWarnings("unused")
    public void changeQuantity(int _quantity) {
        new_quantity = _quantity;
    }

    @SuppressWarnings("unused")
    public double getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public double getPrice() {
        return price;
    }

    @SuppressWarnings("unused")
    public String getPriceStr() {
        return priceStr;
    }

    @SuppressWarnings("unused")
    public double getTotal() {
        if (changed) {
            return getPrice() * new_quantity;
        } else {
            return total;
        }
    }

    public double getTotalOriginal() {
        return total;
    }

    @SuppressWarnings("unused")
    public String getTotalStr() {
        return StringUtils.formatMoney(getTotal());
    }
}