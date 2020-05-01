package com.example.hello_xjtu.Account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hello_xjtu.R;

/**
 * 登录界面可以删除本空页面，新创建Login界面，但UI需要修改，可自行选择
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
