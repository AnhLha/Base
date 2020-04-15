package com.example.basemvvm.model.remote.login;

import com.example.basemvvm.model.data.base.BaseReponse;
import com.example.basemvvm.model.data.login.LoginResponse;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {
    @POST("user/login")
    Single<BaseReponse<LoginResponse>> login(@Body LoginResponse loginResponse);

    @POST("user/register")
    Single<BaseReponse<LoginResponse>> register(@Body LoginResponse loginResponse);

}
