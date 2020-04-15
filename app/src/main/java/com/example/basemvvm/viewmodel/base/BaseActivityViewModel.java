package com.example.basemvvm.viewmodel.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.basemvvm.ui.base.BaseActivity;

public abstract class BaseActivityViewModel<T extends BaseActivity> extends ViewModel {
    protected MutableLiveData mLiveData;
    protected T mView;
}
