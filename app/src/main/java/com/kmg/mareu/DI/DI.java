package com.kmg.mareu.DI;

import com.kmg.mareu.ApiService.MeetingApiService;
import com.kmg.mareu.Repository.MeetingRepository;

public class DI {

    public static MeetingRepository createMeetingRepository() {
        return new MeetingRepository(new MeetingApiService());
    }
}
