package com.nutech.authapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.nutech.authapp.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        setSupportActionBar(binding.toolbar);
        onClick();
    }

    private void onClick(){
        binding.buttonSave.setOnClickListener(v->{
            String nameInStr = binding.editTextName.getText().toString();
            String emailInStr = binding.editTextTextEmail.getText().toString();
            String passwordInStr = binding.editTextTextPassword.getText().toString();
            Log.d("faizan nameInStr",nameInStr);
            Log.d("faizan emailInStr",emailInStr);
            Log.d("faizan passwordInStr",passwordInStr);
        });
    }
}