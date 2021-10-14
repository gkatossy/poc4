package com.kmg.mareu.ApiService;

import com.kmg.mareu.Model.Meeting;
import com.kmg.mareu.Model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class MeetingGeneratorApi {

    /**
     * List of Rooms
     */
    public static List<Room> ROOM_LIST = Arrays.asList(
            new Room("Brand","#e9d0c6"),
            new Room("Consulting","#a22c29"),
            new Room("Glory","#9f7833"),
            new Room("Imagine","#7c7f65"),
            new Room("Kickstart","#9abca4"),
            new Room("Mystic","#b9f18c"),
            new Room("Thrive","#b2ffd6"),
            new Room("Utopia","#7ee8fa"),
            new Room("Vision","#37515f"),
            new Room("Wired","#2b2d42")
    );

    /**
     * List of Meetings
     */
    public static List<Meeting> MEETINGS = Arrays.asList();

    /**
     * Generate list of meetings we will use for app
     * @return ArrayList of Meetings
     */
    static List<Meeting> generateMeetings() { return new ArrayList<>(MEETINGS);}

    /**
     * Generate list of rooms
     * @return new ROOM_LIST ArrayList
     */
    static List<Room> generateRooms(){ return new ArrayList<>(ROOM_LIST);}


    /*
    *########################################################
    *###  CREATE FAKE_MEETING FOR TEST ###
    *########################################################
    */

    public static Calendar mCalendar = Calendar.getInstance();
    public static Date mDate = mCalendar.getTime();
    public static Date mDate2 = oneHourMoreToDate();

    public static Date oneHourMoreToDate(){
        mCalendar.add(Calendar.DATE,2);
        mDate2 = mCalendar.getTime();
        return mDate2;
    }

    public static List<String> MAILS = Arrays.asList(
            "Mario@gmail.com",
            "Luigi@gmail.com",
            "peach@gmail.com"
    );
    public static List<Meeting> FAKE_MEETING = Arrays.asList(
            new Meeting(mDate,ROOM_LIST.get(0),"Réunion 1", MAILS),
            new Meeting(mDate2,ROOM_LIST.get(1),"Réunion 2", MAILS)
    );
}
