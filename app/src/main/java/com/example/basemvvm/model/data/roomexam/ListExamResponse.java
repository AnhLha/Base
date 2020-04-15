package com.example.basemvvm.model.data.roomexam;

import com.example.basemvvm.model.data.base.BaseData;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ListExamResponse extends BaseData {
    @SerializedName("listExam")
    private ArrayList<ExamResponse> listExam;

    public ListExamResponse() {
        this.listExam = new ArrayList<>();
    }

    public ListExamResponse(ArrayList<ExamResponse> listExam) {
        this.listExam = listExam;
    }

    public ArrayList<ExamResponse> getListExam() {
        return listExam;
    }

    public void setListExam(ArrayList<ExamResponse> listExam) {
        this.listExam = listExam;
    }
}
