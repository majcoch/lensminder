package com.appnuggets.lensminder.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.appnuggets.lensminder.database.entity.Drops;

import java.util.List;

@Dao
public interface DropsDao {
    @Query("SELECT * FROM drops WHERE in_use = 1")
    Drops getInUse();

    @Query("SELECT * FROM drops WHERE in_use = 0 ORDER BY start_date DESC")
    List<Drops> getAllNotInUse();

    @Insert
    void insert(Drops drops);

    @Update
    void update(Drops drops);
}
