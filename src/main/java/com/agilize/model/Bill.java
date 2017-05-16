package com.agilize.model;

import com.agilize.util.StringUtils;

import java.util.List;

public class Bill extends AgilizeMessage {

    private List<BillItem> items;
    private double total;
    private String totalStr;
    private double paid;
    private String paidStr;
    private double unpaid;
    private String unpaidStr;
    private double perPerson;
    private String perPersonStr;
    private double tips;
    private String tipsStr;
    private double convenienceTax;
    private String convenienceTaxStr;
    private long peopleCount;
    private String tableOrCard;

    public Bill() {
    }

    public Bill(String _key, String table_or_card, String _customer, int _peopleCount) {
        super(_key, MessageTypes.getBill);
        this.tableOrCard = table_or_card;
        this.customer = _customer;
        this.peopleCount = _peopleCount;
    }

    @SuppressWarnings("unused")
    public String getKey() { return key; }

    @SuppressWarnings("unused")
    public String getTableOrCard() { return tableOrCard; }

    @SuppressWarnings("unused")
    public String getCustomer() { return customer; }

    @SuppressWarnings("unused")
    public long getPeopleCount() { return peopleCount; }

    @SuppressWarnings("unused")
    public String getStart_client_date_time() { return start_client_date_time; }

    @SuppressWarnings("unused")
    public String getEnd_client_date_time() { return end_client_date_time; }

    @SuppressWarnings("unused")
    public boolean getReached_customer() { return reached_customer; }

    @SuppressWarnings("unused")
    public double getTotal() { return total; }

    @SuppressWarnings("unused")
    public String getTotalStr() {
        return StringUtils.formatMoney(total);
    }

    @SuppressWarnings("unused")
    public double getPaid() { return paid; }

    @SuppressWarnings("unused")
    public String getPaidStr() {
        return StringUtils.formatMoney(paid);
    }

    @SuppressWarnings("unused")
    public double getUnpaid() { return unpaid; }

    @SuppressWarnings("unused")
    public String getUnpaidStr() {
        return StringUtils.formatMoney(unpaid);
    }

    @SuppressWarnings("unused")
    public double getPerPerson() { return perPerson; }

    @SuppressWarnings("unused")
    public String getPerPersonStr() {
        return StringUtils.formatMoney(perPerson);
    }

    @SuppressWarnings("unused")
    public double getTips() { return tips; }

    @SuppressWarnings("unused")
    public String getTipsStr() {
        return StringUtils.formatMoney(tips);
    }

    @SuppressWarnings("unused")
    public double getConvenienceTax() { return convenienceTax; }

    @SuppressWarnings("unused")
    public String getConvenienceTaxStr() {
        return StringUtils.formatMoney(convenienceTax);
    }
    public List<BillItem> getItems() { return items; }

    @SuppressWarnings("unused")
    public double getSelectedTotal() {
        double total = 0;
        if (items != null) {
            for (BillItem item :
                    items) {
                total += item.getPrice() * item.getQuantity();
            }
        }

        return total;
    }

    @SuppressWarnings("unused")
    public String getSelectedTotalStr() {
        return StringUtils.formatMoney(getSelectedTotal());
    }

    @SuppressWarnings("unused")
    public double getNettoTotal()  {
        double total = 0;
        if (items != null) {
            for (BillItem item :
                    items) {
                total = item.getPrice() * item.getQuantity();
            }

            return total + getTips() + getConvenienceTax();
        }

        return getTotal() + getTips() + getConvenienceTax();
    }
}