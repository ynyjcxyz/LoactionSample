package com.example.android.loactionsample.datamodel_main;

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

@GenerateTypeAdapter
@AutoValue
public abstract class Address {
    @SerializedName("country")
    public abstract String country();

    @SerializedName("countrySubdivisionName")
    public abstract String countrySubdivisionName();

    @SerializedName("freeformAddress")
    public abstract String freeformAddress();
}
