package com.example.basemvvm.model.data.base;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseReponse<T extends BaseData> extends TemplateResponse {
    @SerializedName("data")
    @Expose
    private T data = null;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
