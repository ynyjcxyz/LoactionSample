package com.example.android.loactionsample.datamodel_photo;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public abstract class ReviewUnit implements Serializable {
    @SerializedName("text")
    public abstract String text();

    @SerializedName("date")
    public abstract String date();
}