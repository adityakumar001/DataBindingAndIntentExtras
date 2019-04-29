package com.emptyfruits.com.intentextras;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.emptyfruits.com.intentextras.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    public static final String NAME_KEY = "name", EMAIL_KEY = "email", PHONE_KEY = "phone",
            AGE_KEY = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(NAME_KEY, mainBinding.name.getText().toString());
        intent.putExtra(EMAIL_KEY, mainBinding.email.getText().toString());
        intent.putExtra(AGE_KEY, mainBinding.age.getText().toString());
        intent.putExtra(PHONE_KEY, mainBinding.phone.getText().toString());
        startActivity(intent);
    }
}
