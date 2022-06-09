package com.example.android.loactionsample.retrofit;

import com.example.android.loactionsample.datamodel_photo.PhotoResult;
import io.reactivex.Observable;

public class PhotoRepository {
    public static Observable<PhotoResult> getPhotoResult(String key,String photoId){
        return GetRetrofitObj.photoService().getPhotoResult(key,photoId);
    }
}