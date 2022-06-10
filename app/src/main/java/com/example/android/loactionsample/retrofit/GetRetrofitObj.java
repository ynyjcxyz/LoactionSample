package com.example.android.loactionsample.retrofit;

import static com.example.android.loactionsample.util.GsonClientUtil.createGson;
import static com.example.android.loactionsample.util.OkHttpClientUtil.buildOkHttpClient;
import com.example.android.loactionsample.util.AppConstants;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class GetRetrofitObj {
    static PoiService poiService(){
        Retrofit poiRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.baseUrl)
                .addConverterFactory(GsonConverterFactory.create(createGson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(buildOkHttpClient())
                .build();
        return poiRetrofit.create(PoiService.class);
    }

    static PhotoService photoService(){
        Retrofit photoRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(createGson()))
                .client(buildOkHttpClient())
                .build();
        return photoRetrofit.create(PhotoService.class);
    }

    static PoiTest TestService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(createGson()))
                .client(buildOkHttpClient())
                .build();
        return retrofit.create(PoiTest.class);
    }
}
