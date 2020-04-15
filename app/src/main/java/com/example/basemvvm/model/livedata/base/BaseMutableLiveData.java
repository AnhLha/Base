package com.example.basemvvm.model.livedata.base;

import androidx.lifecycle.MutableLiveData;

import com.example.basemvvm.model.data.base.BaseData;

public class BaseMutableLiveData<T extends BaseData> {
    protected MutableLiveData<T> mList;
}
