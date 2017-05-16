package com.agilize.model;

public class BillRequest extends AgilizeMessage {

    private long peopleCount;
    private String tableOrCard;

    public BillRequest() {
    }

    public BillRequest(String _key, String table_or_card, String _customer, int _peopleCount) {
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
}