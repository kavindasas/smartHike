package com.example.smarthike;

/**
 * Created by dp on 7/9/2017.
 */

public class Hike {

    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    @com.google.gson.annotations.SerializedName("hike_name")
    private String mHikeName;

    @com.google.gson.annotations.SerializedName("hike_description")
    private String mHikeDescription;

    @com.google.gson.annotations.SerializedName("hike_destination")
    private String mHikeDestination;

    public Hike(){
    }

    @Override
    public String toString() {
        return getText();
    }

    public Hike(String hikeName) {
        this.setHikeName(hikeName);
    }

    public String getText() {
        return mHikeName;
    }

    public final void setHikeName(String hikeName) {
        mHikeName = hikeName;
    }

    public String getId() {
        return mId;
    }

    public final void setHikeDescription(String hikeDescription) {
        mHikeDescription = hikeDescription;
    }

    public String getHikeDescription() {
        return mHikeDescription;
    }

    public final void setHikeDestination(String hikeDestination) {
        mHikeDestination = hikeDestination;
    }

    public String getHikeDestination() {
        return mHikeDestination;
    }

    public final void setId(String id) {
        mId = id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Hike && ((Hike) o).mId == mId;
    }
}
