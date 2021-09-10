package com.pdv.mareu.Ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.pdv.mareu.Model.Meeting;
import com.pdv.mareu.R;

import java.io.Serializable;
import java.util.List;

public class MeetingItemRecyclerViewAdapter extends RecyclerView.Adapter<MeetingItemViewHolder> {

    private List<Meeting> mMeetingList;

    // CONSTRUCTOR
    public MeetingItemRecyclerViewAdapter(List<Meeting> meetingList) {
        this.mMeetingList = meetingList;
    }

    @NonNull
    @Override
    public MeetingItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_meeting_item, viewGroup, false);
        return new MeetingItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeetingItemViewHolder meetingItemViewHolder, int i) {
        meetingItemViewHolder.updateWithMeeting(this.mMeetingList.get(i));
        meetingItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TAG", "onClick: click item");
            }
        });
    }

    @Override
    public int getItemCount() {
        return mMeetingList.size();
    }
}