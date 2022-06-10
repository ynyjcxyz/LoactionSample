package com.example.android.loactionsample.retrofit;

import com.example.android.loactionsample.datamodel_main.MainResult;
import io.reactivex.Observable;
import io.reactivex.Single;

public class MainResultRepository {
    public static Observable<MainResult> getMainResult(String keyword,
                                                       double lat,
                                                       double lon,
                                                       String view,
                                                       String relatedPois,
                                                       String key){
        return GetRetrofitObj.poiService().getMainResult(keyword,lat,lon,view,relatedPois,key);
    }

    public static Single<MainResult> getResult(String uuid) {
        return GetRetrofitObj.TestService().getPoiData(uuid);
    }
}