package com.example.android.loactionsample.retrofit;

import com.example.android.loactionsample.datamodel_photo.PhotoResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PhotoService {
    @GET("search/2/poiDetails.json")
    Observable<PhotoResult> getPhotoResult
            (@Query("key") String key,//EKJAdAiCT7KLa5nZZz1p0jnn0jIJGyMZ
             @Query("id") String photoId);
}