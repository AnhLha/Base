package com.example.basemvvm.viewmodel.login;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.basemvvm.contract.login.LoginContract;
import com.example.basemvvm.model.data.login.LoginResponse;
import com.example.basemvvm.model.remote.login.LoginApi;
import com.example.basemvvm.service.ApiRepository;
import com.example.basemvvm.ui.login.LoginActivity;
import com.example.basemvvm.viewmodel.base.BaseActivityViewModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class LoginActivityViewModel extends BaseActivityViewModel<LoginActivity> implements LoginContract.LoginInterfaceViewModel {

    private static String TAG = "LOGIN_ACTIVITY";

    @Override
    public void doLogin(String email, String password) {
        Log.d(TAG,"doLogin: start");
        ApiRepository.getInstance()
                .createRetrofit()
                .create(LoginApi.class)
                .login(new LoginResponse(email, password))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(loginResponse -> {
                    Log.d(TAG,"doLogin: success");
                    mView.loginSuccess();
                }, throwable -> {
                    mView.loginFailded();
                    Log.d(TAG,"doLogin fail: " + throwable.toString());
                });
    }

    @Override
    public void setView(LoginActivity view) {
        mView = view;
        mView.bindView();
        mView.observeLifeCycle();
    }
}
