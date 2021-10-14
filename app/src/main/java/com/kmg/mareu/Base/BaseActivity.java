package com.kmg.mareu.Base;

import android.support.v7.app.AppCompatActivity;
import com.kmg.mareu.MareuApplication;
import com.kmg.mareu.Repository.MeetingRepository;

public abstract class BaseActivity extends AppCompatActivity {

    public MeetingRepository getMeetingRepository(){
        return ((MareuApplication) getApplication()).getMeetingRepository();
    }
}
