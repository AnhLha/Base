package com.example.basemvvm.utils;


import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;

import java.io.File;

//helper as convert date, get resource to uri, load image...
public class Helpers {
    public static String parseDateToddMMyyyy(){
        String str = null;
        return str;
    }

    public static Uri resourceIdtoUri(Context context, int resourceId){
        String ANDROID_RESOURCE = "android.resource://";
        String FOREWARD_SLASH="/";
        return Uri.parse(ANDROID_RESOURCE + context.getPackageName() + FOREWARD_SLASH + resourceId);
    }

    public static void loadImageFromUrl(Activity activity, String url, final View container){
        Glide.with(activity).load(url).into(new CustomTarget<Drawable>() {
            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                container.setBackground(resource);
            }

            @Override
            public void onLoadCleared(@Nullable Drawable placeholder) {

            }
        });
    }

    public static void loadImageFromFile(Activity activity,String path,final View container){
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),path);
        Glide.with(activity).load(file).into(new CustomTarget<Drawable>() {
            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                container.setBackground(resource);
            }

            @Override
            public void onLoadCleared(@Nullable Drawable placeholder) {

            }
        });
    }
}
