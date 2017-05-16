package com.agilize.model;

public class ItemCardSpinner {

    String name;
    Integer imageId;
    String id;

    public ItemCardSpinner(String text, Integer imageId, String idStr){
        this.name =text;
        this.imageId=imageId;
        this.id = idStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getImageId(){
        return imageId;
    }
}
