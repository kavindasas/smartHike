package com.example.smarthike;

/**
 * Created by dp on 7/11/2017.
 */

public class Hiker {

    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    @com.google.gson.annotations.SerializedName("hiker_username")
    private String mHikerUserName;

    @com.google.gson.annotations.SerializedName("hiker_email")
    private String mHikerEmail;

    @com.google.gson.annotations.SerializedName("hiker_password")
    private String mHikerPassword;

    public Hiker(){
    }

    @Override
    public String toString() {
        return getText();
    }

    public Hiker(String hikerUserName) {
        this.setHikerUserName(hikerUserName);
    }

    public String getText() {
        return mHikerUserName;
    }
    public final void setHikerUserName(String hikerUserName) {
        mHikerUserName = hikerUserName;
    }

    public String getId() {
        return mId;
    }

    public final void setHikerEmail(String hikerEmail) {
        mHikerEmail = hikerEmail;
    }

    public String getHikerEmail() {
        return mHikerEmail;
    }

    public final void setHikerPassword(String hikerPassword) {
        mHikerPassword = hikerPassword;
    }

    public String getHikerPassword() {
        return mHikerPassword;
    }

    public final void setId(String id) {
        mId = id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Hiker && ((Hiker) o).mId == mId;
    }
}


