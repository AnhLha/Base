package com.example.basemvvm.model.data.roomtopical;

import com.example.basemvvm.model.data.base.BaseData;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ListTopicalResponse extends BaseData {
    @SerializedName("listExam")
    private ArrayList<TopicalResponse> listExam;

    public ListTopicalResponse() {
        this.listExam = new ArrayList<>();
    }

    public ListTopicalResponse(ArrayList<TopicalResponse> listExam) {
        this.listExam = listExam;
    }

    public ArrayList<TopicalResponse> getListExam() {
        return listExam;
    }

    public void setListExam(ArrayList<TopicalResponse> listExam) {
        this.listExam = listExam;
    }
}
