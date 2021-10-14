package com.kmg.mareu.Ui.CreateMeetingActivity;

import android.os.Bundle;

import com.kmg.mareu.Base.BaseActivity;
import com.kmg.mareu.R;

public class CreateMeetingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_meeting);

        CreateMeetingFragment fragment = new CreateMeetingFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.create_activity_main_layout, fragment)
                .commit();
    }
}
