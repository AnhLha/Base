package com.example.basemvvm.ui.base;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basemvvm.viewmodel.base.BaseActivityViewModel;

public abstract class BaseActivity<T extends BaseActivityViewModel> extends AppCompatActivity {
    protected T mViewModel;
    public void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
