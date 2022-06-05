package com.example.android.loactionsample.datamodel_main;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

@GenerateTypeAdapter
@AutoValue
public abstract class PoiDetailUnit {
    @SerializedName("id")
    public abstract String photoId();

    @SerializedName("sourceName")
    public abstract String sourceName();
}
