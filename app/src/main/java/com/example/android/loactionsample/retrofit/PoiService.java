package com.example.android.loactionsample.retrofit;

import com.example.android.loactionsample.datamodel_main.MainResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PoiService {
    @GET("search/2/poiSearch/{keyword}.json")
    Observable<MainResult> getMainResult
            (@Path("keyword") String keyword,//bikeshop
             @Query("lat") double lat,
             @Query("lon") double lon,
             @Query("view") String view,//Unified
             @Query("relatedPois") String relatedPois,//off
             @Query("key") String key);//EKJAdAiCT7KLa5nZZz1p0jnn0jIJGyMZ
}
