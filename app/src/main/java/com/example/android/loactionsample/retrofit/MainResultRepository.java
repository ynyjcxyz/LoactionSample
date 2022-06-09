package com.example.android.loactionsample.retrofit;

import com.example.android.loactionsample.datamodel_main.MainResult;
import io.reactivex.Observable;

public class MainResultRepository {
    public static Observable<MainResult> getMainResult(String keyword,
                                                       double lat,
                                                       double lon,
                                                       String view,
                                                       String relatedPois,
                                                       String key){
        return GetRetrofitObj.poiService().getMainResult(keyword,lat,lon,view,relatedPois,key);
    }
}