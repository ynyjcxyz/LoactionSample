package com.example.android.loactionsample.retrofit;

import com.example.android.loactionsample.util.AppConstants;
import com.example.android.loactionsample.util.GsonClientUtil;
import com.example.android.loactionsample.util.OkHttpClientUtil;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class GetRetrofitObj {
    static PoiService poiService(){
        Retrofit poiRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.baseUrl)
                .addConverterFactory(GsonConverterFactory.create(GsonClientUtil.createGson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpClientUtil.buildOkHttpClient())
                .build();
        return poiRetrofit.create(PoiService.class);
    }

    static PhotoService photoService(){
        Retrofit photoRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.baseUrl)
                .addConverterFactory(GsonConverterFactory.create(GsonClientUtil.createGson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpClientUtil.buildOkHttpClient())
                .build();
        return photoRetrofit.create(PhotoService.class);
    }
}
