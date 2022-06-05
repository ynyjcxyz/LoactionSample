package com.example.android.loactionsample.datamodel_main;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

import java.util.List;

@GenerateTypeAdapter
@AutoValue
public abstract class DataSources {
    @SerializedName("poiDetails")
    public abstract List<PoiDetailUnit> poiDetails();
}
