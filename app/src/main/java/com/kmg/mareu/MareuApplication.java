package com.kmg.mareu;

import android.app.Application;
import android.content.res.Configuration;

import com.kmg.mareu.DI.DI;
import com.kmg.mareu.Repository.MeetingRepository;

public class MareuApplication extends Application {

    private MeetingRepository mMeetingRepository;

    public MeetingRepository getMeetingRepository() {
        if (mMeetingRepository == null){
            mMeetingRepository = DI.createMeetingRepository();
        }
        return mMeetingRepository;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.mMeetingRepository = null;
    }
}
