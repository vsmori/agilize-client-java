package com.agilize.model;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AgilizeMessage implements Serializable {

    public enum MessageTypes {
        getBill,
        recordPayment,
        paymentStatus
    }

    public AgilizeMessage() {
    }

    public AgilizeMessage(String _key, MessageTypes _message_type) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.ENGLISH);
        this.key = _key;
        this.start_client_date_time = df.format(new Date());
        this.reached_customer = false;
        this.message_type = _message_type;
    }

    public String key;
    protected String customer;
    protected String start_client_date_time;
    protected String end_client_date_time;
    protected boolean reached_customer;

    protected MessageTypes message_type;
}
