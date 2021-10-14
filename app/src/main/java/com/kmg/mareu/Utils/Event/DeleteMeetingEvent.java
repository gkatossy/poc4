package com.kmg.mareu.Utils.Event;

import com.kmg.mareu.Model.Meeting;

public class DeleteMeetingEvent {

    public Meeting mMeeting;

    public DeleteMeetingEvent(Meeting meeting){
        this.mMeeting = meeting;
    }
}
