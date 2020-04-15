package com.example.basemvvm.ui.base;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.fragment.app.Fragment;

import com.example.basemvvm.viewmodel.base.BaseFragmentViewModel;

import static androidx.core.content.ContextCompat.getSystemService;

public class BaseFragment<T extends BaseFragmentViewModel> extends Fragment {
    protected T mViewModel;
}
