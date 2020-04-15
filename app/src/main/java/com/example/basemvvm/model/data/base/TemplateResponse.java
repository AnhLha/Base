package com.example.basemvvm.model.data.base;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TemplateResponse {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("message")
    @Expose
    private boolean message;
    @SerializedName("description")
    @Expose
    private String description;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isMessage() {
        return message;
    }

    public void setMessage(boolean message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
