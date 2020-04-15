package com.example.basemvvm.viewmodel.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.basemvvm.ui.base.BaseFragment;

public abstract class BaseFragmentViewModel<T extends BaseFragment> extends ViewModel {
    protected MutableLiveData mLiveData;
    protected T mView;
}
