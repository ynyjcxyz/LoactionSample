package com.example.android.loactionsample.datamodel_photo;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

@GenerateTypeAdapter
@AutoValue
public abstract class PhotoResult {
    @SerializedName("id")
    public abstract String id();

    @SerializedName("result")
    public abstract PhotoInfo photoInfo();
}