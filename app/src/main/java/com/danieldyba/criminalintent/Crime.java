package com.danieldyba.criminalintent;

import java.util.UUID;

/**
 * Created by ddyba on 2/7/15.
 */
public class Crime {
    private UUID mId;
    private String title;

    public Crime() {
        mId = UUID.randomUUID(); // Generates a unique identifier
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return title;
    }

}
