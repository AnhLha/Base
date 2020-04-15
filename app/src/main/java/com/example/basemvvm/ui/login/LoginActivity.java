package com.example.basemvvm.ui.login;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.example.basemvvm.R;
import com.example.basemvvm.contract.login.LoginContract;
import com.example.basemvvm.service.SharePreferenceService;
import com.example.basemvvm.ui.base.BaseActivity;
import com.example.basemvvm.ui.roomexam.RoomExamActivity;
import com.example.basemvvm.viewmodel.login.LoginActivityViewModel;

public class LoginActivity extends BaseActivity<LoginActivityViewModel> implements LoginContract.LoginInterfaceView {

    private static String TAG = "LOGIN_ACTIVITY";
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SharePreferenceService sharePreferenceService = new SharePreferenceService(this);

        if(!sharePreferenceService.getAccessToken().isEmpty()){

            finish();
            return;
        }
        mViewModel = ViewModelProviders.of(this).get(LoginActivityViewModel.class);
        mViewModel.setView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // oncreate > onstart > onresume > onpause > onstop > ondestroy
        // onpause > onresume: activity khac che di 1 phan or all, user quay ve lai activity cu
        // onstop > onrestart > onstart: su hien thi cua activity A lam activity B khong con nhin thay nua > onstop (VD: press Home ve main)
        // activity roi vao onpause & onstop de bi he thong thu hoi > ondestroy
    }


    @Override
    public void loginFailded() {

    }

    @Override
    public void loginSuccess() {
        Intent intent = new Intent(this,RoomExamActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void observeLifeCycle() {

    }

    @Override
    public void bindView() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            Log.d(TAG,"email: " + edtEmail.getText().toString());
            Log.d(TAG,"pass: " + edtPassword.getText().toString());
            hideKeyboard();
            mViewModel.doLogin(edtEmail.getText().toString(),edtPassword.getText().toString());
        });
    }
}
