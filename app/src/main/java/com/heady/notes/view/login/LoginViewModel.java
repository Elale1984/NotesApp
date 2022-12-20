package com.heady.notes.view.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private final MutableLiveData<String> notifyText;
    private  final MutableLiveData<String> forgotText;
    public LoginViewModel() {
        notifyText = new MutableLiveData<>();
        notifyText.setValue("Notify");
        forgotText = new MutableLiveData<>();
        forgotText.setValue("Forgot Password?");
    }

    public LiveData<String> getNotifyText() {
        return notifyText;
    }
    public LiveData<String> getForgotText() { return forgotText; }
}