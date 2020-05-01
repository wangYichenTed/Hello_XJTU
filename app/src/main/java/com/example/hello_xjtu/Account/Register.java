package com.example.hello_xjtu.Account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hello_xjtu.R;

/**
 * 注册界面（由于是四个界面的问题，可以选择用fragment或Activity实现，具体可自行添加Activity）
 */

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
