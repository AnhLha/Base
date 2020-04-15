package com.example.basemvvm.model.data.base;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseResponseList<T extends BaseData> extends TemplateResponse {
    @SerializedName("data")
    @Expose
    private List<T> data = null;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
