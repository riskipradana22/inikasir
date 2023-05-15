package com.riski.laundry.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.riski.laundry.database.dao.LaundryDao;
import com.riski.laundry.model.ModelLaundry;

@Database(entities = {ModelLaundry.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LaundryDao laundryDao();
}
