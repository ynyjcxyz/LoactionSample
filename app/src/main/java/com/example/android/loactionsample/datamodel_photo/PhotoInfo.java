package com.example.android.loactionsample.datamodel_photo;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public abstract class PhotoInfo {
    @SerializedName("description")
    public abstract String description();

    @SerializedName("photos")
    public abstract List<PhotoUnit> photoList();

    @SerializedName("reviews")
    public abstract List<ReviewUnit> reviewList();
}
