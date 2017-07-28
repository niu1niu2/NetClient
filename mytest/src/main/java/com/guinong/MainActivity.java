package com.guinong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.guinong.login.LoginTest;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    LoginTest test = new LoginTest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.test, R.id.test1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.test:
                test.login();
                break;
            case R.id.test1:
                test.getShopCartData();
                break;
        }
    }
}
