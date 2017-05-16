package com.agilize.model;

import java.util.HashMap;
import java.util.Map;

public class UserModel {

    private String name;
    private String email;
    private String photo;
    private String uid;
    private int type;
    public Map<String, Boolean> data = new HashMap<>();

    public UserModel() {

    }

    @SuppressWarnings("unused")
    public UserModel(String uid, String name) {
        this.uid = uid;
        this.name = name;
        this.type = 0;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Map<String, Boolean> getData() {
        return data;
    }

    public void setData(Map<String, Boolean> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @SuppressWarnings("unused")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
