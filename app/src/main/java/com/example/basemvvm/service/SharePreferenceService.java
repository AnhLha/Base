package com.example.basemvvm.service;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.basemvvm.BaseApplication;

import static com.example.basemvvm.utils.Constants.ACCESS_TOKEN;
import static com.example.basemvvm.utils.Constants.PREFERENCES;

public class SharePreferenceService {
    private static volatile SharePreferenceService sInstance = null;
    private SharedPreferences mSharePerferences;

    public SharePreferenceService(Context context) {
//        mSharePerferences = BaseApplication.self().getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
        mSharePerferences = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
    }

//    public static SharePreferenceService getInstance() {
//        if (sInstance == null) {
//            synchronized (SharePreferenceService.class) {
//                sInstance = new SharePreferenceService();
//            }
//        }
//        return sInstance;
//    }

    //put
    public <T> void put(String key, T data) {
        SharedPreferences.Editor editor = mSharePerferences.edit();

        if (data instanceof String) {
            editor.putString(key, (String) data);
        } else if (data instanceof Boolean) {
            editor.putBoolean(key, (Boolean) data);
        } else if (data instanceof Float) {
            editor.putFloat(key, (Float) data);
        } else if (data instanceof Integer) {
            editor.putInt(key, (Integer) data);
        } else if (data instanceof Long) {
            editor.putLong(key, (Long) data);
        }
        editor.apply();
    }

    //get
    public <T> T get(String key, Class<T> neededData) {
        if (neededData == String.class) {
            return (T) mSharePerferences.getString(key, "");
        } else if (neededData == Boolean.class) {
            return (T) Boolean.valueOf(mSharePerferences.getBoolean(key, false));
        } else if (neededData == Float.class) {
            return (T) Float.valueOf(mSharePerferences.getFloat(key, 0));
        } else if (neededData == Integer.class) {
            return (T) Integer.valueOf(mSharePerferences.getInt(key, 0));
        } else if (neededData == Long.class) {
            return (T) Long.valueOf(mSharePerferences.getLong(key, 0));
        } else
            return (T) mSharePerferences.getString(key, "");
    }

    public String getAccessToken(){
        return mSharePerferences.getString(ACCESS_TOKEN,"");
    }
}
