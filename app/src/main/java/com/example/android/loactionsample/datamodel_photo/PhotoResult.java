package com.example.android.loactionsample.datamodel_photo;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;
import java.io.Serializable;

@GenerateTypeAdapter
@AutoValue
public abstract class PhotoResult implements Serializable {
    @SerializedName("id")
    public abstract String id();

    @SerializedName("result")
    public abstract PhotoInfo photoInfo();
}