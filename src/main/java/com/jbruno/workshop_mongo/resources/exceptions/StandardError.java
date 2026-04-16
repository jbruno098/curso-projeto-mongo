package com.jbruno.workshop_mongo.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
    private Instant timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {}

    public StandardError(Instant timeStamp, Integer status, String error, String message, String path) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public StandardError setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public StandardError setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getError() {
        return error;
    }

    public StandardError setError(String error) {
        this.error = error;
        return this;
    }

    public String getPath() {
        return path;
    }

    public StandardError setPath(String path) {
        this.path = path;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public StandardError setMessage(String message) {
        this.message = message;
        return this;
    }
}
