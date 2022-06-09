package com.example.android.loactionsample.datamodel_photo;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public abstract class PhotoUnit implements Serializable {
    @SerializedName("id")
    public abstract String id();
}