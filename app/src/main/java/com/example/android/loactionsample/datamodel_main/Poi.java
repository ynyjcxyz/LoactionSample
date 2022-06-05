package com.example.android.loactionsample.datamodel_main;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

@GenerateTypeAdapter
@AutoValue
public abstract class Poi {
    @SerializedName("name")
    public abstract String name();

    @SerializedName("phone")
    public abstract String phone();

    @SerializedName("url")
    public abstract String url();
}
