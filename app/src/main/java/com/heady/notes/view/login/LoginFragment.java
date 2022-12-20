package com.heady.notes.view.login;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.heady.notes.MainActivity;
import com.heady.notes.R;
import com.heady.notes.databinding.FragmentHomeBinding;
import com.heady.notes.databinding.FragmentLoginBinding;
import com.heady.notes.view.home.HomeViewModel;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;
    private Button btnLogin;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LoginViewModel loginViewModel =
                new ViewModelProvider(this).get(LoginViewModel.class);

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView notifyText = binding.textLogin;
        final TextView forgotText = binding.forgotText;
        loginViewModel.getNotifyText().observe(getViewLifecycleOwner(), notifyText::setText);
        loginViewModel.getForgotText().observe(getViewLifecycleOwner(), forgotText::setText);
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnLogin.setText(R.string.login);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}