package com.example.basemvvm.service;

import retrofit2.Retrofit;

import static com.example.basemvvm.utils.Constants.BASE_URL;

public class ApiRepository {
    private static ApiRepository sInstance = null;
//    private String url;

    public ApiRepository() {
    }

    public static ApiRepository getInstance() {
        if (sInstance == null){
            synchronized (ApiRepository.class){
                sInstance = new ApiRepository();
            }
        }
            return sInstance;
    }

//    public ApiRepository setUrl(String url){
//        this.url = url;
//        return this;
//    }

    public Retrofit createRetrofit(){
        return RetrofitService.createService(BASE_URL);
    }
}
