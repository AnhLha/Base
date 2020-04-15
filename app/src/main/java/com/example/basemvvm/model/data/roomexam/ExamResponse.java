package com.example.basemvvm.model.data.roomexam;

import com.example.basemvvm.model.data.base.BaseData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExamResponse extends BaseData{
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("school")
    @Expose
    private String school;
    @SerializedName("grade")
    @Expose
    private int grade;

    public ExamResponse(String id, String year, String subject, String school, int grade) {
        this.id = id;
        this.year = year;
        this.subject = subject;
        this.school = school;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
