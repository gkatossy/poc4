package com.kmg.mareu.ApiService;

import com.kmg.mareu.Model.Meeting;
import com.kmg.mareu.Model.Room;

import java.util.List;

public interface MyMeetingApiService {

    List<Meeting> getMeetingList();

    void addMeeting(Meeting meeting);

    void deleteMeeting(Meeting meeting);

    List<Room> getRooms();

    List<Meeting> filterByDate(String date);

    List<Meeting> filterByPlace(String place);
}
