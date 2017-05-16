package com.agilize.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

// Tarj - Codename para cartões, referência de Tarjetas
public class Tarj {

    private static Tarj mInstance;
    private DatabaseReference fb;
    private String numberCard;
    private String cvv;
    private String month;
    private String idUser;
    public Map<String, Boolean> data = new HashMap<>();

    public Tarj() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        fb = database.getReference("tarj");
    }

    public Tarj(String numberCardInfo, String cvvInfo, String monthInfo) {
        this.numberCard = numberCardInfo;
        this.cvv = cvvInfo;
        this.month = monthInfo;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public Map<String, Boolean> getData() {
        return data;
    }

    public void setData(Map<String, Boolean> data) {
        this.data = data;
    }

    public static synchronized Tarj getInstance() {
        if (mInstance == null) {
            mInstance = new Tarj();
        }
        return mInstance;
    }

    public String add(String sauce1, int sauce2, String sauce3) {
        DatabaseReference card = fb.push();

        card.setValue(new Sauce(sauce1, sauce2, sauce3));

        return card.getKey();
    }

    public String[] get(String key) {
        DatabaseReference c = fb.child(key);
        if (c != null) {
            return new String[]{c.child("s1").toString(), c.child("s2").toString(), c.child("s3").toString()};
        } else {
            return null;
        }
    }


    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("number", numberCard);
        result.put("cvv", cvv);
        result.put("month", month);
        return result;
    }

}