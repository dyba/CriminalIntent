package com.danieldyba.criminalintent.models;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ddyba on 2/7/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime() {
        mId = UUID.randomUUID(); // Generates a unique identifier
        mDate = new Date();
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

}
