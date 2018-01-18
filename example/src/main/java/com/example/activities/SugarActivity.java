package com.example.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.R;
import com.example.entity.TestEntity;
import com.orm.SugarRecord;


public class SugarActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TestEntity entity = new TestEntity();
        entity.setKid("0");
        entity.setKname("test");
        entity.setUpdate_time(System.currentTimeMillis() / 1000);
        SugarRecord.update(entity);
    }

    public void insert1(View view) {
        TestEntity entity = new TestEntity();
        entity.setKid("1");
        entity.setKname("test");
        entity.setUpdate_time(System.currentTimeMillis() / 1000);
        SugarRecord.update(entity);
    }

    public void insert2(View view) {
        TestEntity entity = new TestEntity();
        entity.setKid("0");
        entity.setKname("test1");
        entity.setUpdate_time(System.currentTimeMillis() / 1000);
        SugarRecord.update(entity);
    }

    public void repeat(View view) {
        TestEntity entity = new TestEntity();
        entity.setKid("0");
        entity.setKname("test");
        entity.setUpdate_time(System.currentTimeMillis() / 1000);
        SugarRecord.update(entity);
    }
}
