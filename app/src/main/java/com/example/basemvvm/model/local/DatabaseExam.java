package com.example.basemvvm.model.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Exam.class}, version = 1, exportSchema = false)
public abstract class DatabaseExam extends RoomDatabase {
    public abstract DaoQuery daoQuery();
}
