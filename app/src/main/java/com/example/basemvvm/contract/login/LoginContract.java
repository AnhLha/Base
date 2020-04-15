package com.example.basemvvm.contract.login;

import com.example.basemvvm.contract.base.BaseInterfaceView;
import com.example.basemvvm.contract.base.BaseInterfaceViewModel;
import com.example.basemvvm.ui.login.LoginActivity;

public class LoginContract {
    public interface LoginInterfaceViewModel extends BaseInterfaceViewModel<LoginActivity>{
        void doLogin(String email, String password);
    }
    public interface LoginInterfaceView extends BaseInterfaceView{
        void loginFailded();

        void loginSuccess();
    }
}
