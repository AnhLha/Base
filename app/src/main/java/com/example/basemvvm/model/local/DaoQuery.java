package com.example.basemvvm.model.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DaoQuery {
    @Insert
    void insertExam(Exam exam);

    @Query("SELECT * FROM Exam WHERE grade = :grade")
    Exam filterExamByGrade(int grade);
}
