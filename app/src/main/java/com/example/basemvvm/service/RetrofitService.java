package com.example.basemvvm.service;

import android.content.SharedPreferences;
import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.basemvvm.utils.Constants.ACCESS_TOKEN;

public class RetrofitService {
    private static SharePreferenceService mSharePreferenceService;
    public static Retrofit createService(String url){
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//        httpClient.addInterceptor(chain ->{
//            Request original = chain.request();
//            String token = mSharePreferenceService.getAccessToken();
//            Log.d("TOKEN", token);
//            Request request = original.newBuilder()
//                    .header("Authorization",mSharePreferenceService.getAccessToken())
//                    .method(original.method(),original.body())
//                    .build();
//            return chain.proceed(request);
//        });
//
//        OkHttpClient okHttpClient = httpClient
//                .connectTimeout(30, TimeUnit.SECONDS)
//                .readTimeout(100,TimeUnit.SECONDS)
//                .writeTimeout(100,TimeUnit.SECONDS)
//                .build();

        return new Retrofit.Builder()
                .baseUrl(url)
//                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
}
