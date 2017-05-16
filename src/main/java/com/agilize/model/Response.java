package com.agilize.model;

public abstract class Response {

    public int status;
    public String message;

    public Response() {
    }

    @SuppressWarnings("unused")
    public int getStatus() {
        return status;
    }

    @SuppressWarnings("unused")
    public String getMessage() {
        return message;
    }
}