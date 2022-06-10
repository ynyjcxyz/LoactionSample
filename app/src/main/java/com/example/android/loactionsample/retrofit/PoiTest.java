package com.example.android.loactionsample.retrofit;

import com.example.android.loactionsample.datamodel_main.MainResult;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PoiTest {
    @GET("v3/{uuid}")
    Single<MainResult> getPoiData(@Path("uuid") String parameterUuid);
}