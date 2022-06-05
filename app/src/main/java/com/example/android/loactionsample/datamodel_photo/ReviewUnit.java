package com.example.android.loactionsample.datamodel_photo;

import com.google.gson.annotations.SerializedName;

public abstract class ReviewUnit {
    @SerializedName("text")
    public abstract String text();

    @SerializedName("date")
    public abstract String date();
}