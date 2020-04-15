package com.example.basemvvm.contract.base;

import com.example.basemvvm.ui.base.BaseActivity;

public interface BaseInterfaceViewModel<T extends BaseActivity> {
    void setView(T view);
}
