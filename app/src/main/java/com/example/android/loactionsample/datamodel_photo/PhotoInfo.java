package com.example.android.loactionsample.datamodel_photo;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public abstract class PhotoInfo implements Serializable {
    @SerializedName("description")
    public abstract String description();

    @SerializedName("photos")
    public abstract List<PhotoUnit> photoList();

    @SerializedName("reviews")
    public abstract List<ReviewUnit> reviewList();
}
