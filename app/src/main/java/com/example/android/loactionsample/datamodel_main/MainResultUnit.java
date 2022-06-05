package com.example.android.loactionsample.datamodel_main;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

@GenerateTypeAdapter
@AutoValue
public abstract class MainResultUnit {
    @SerializedName("poi")
    public abstract Poi poi();

    @SerializedName("address")
    public abstract Address address();

    @SerializedName("dataSources")
    public abstract DataSources dataSources();
}
