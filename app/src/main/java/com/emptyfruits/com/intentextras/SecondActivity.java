package com.emptyfruits.com.intentextras;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.emptyfruits.com.intentextras.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding secondBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        secondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        if (extras == null) throw new AssertionError();
        secondBinding.name.setText((extras.getString(MainActivity.NAME_KEY)));
        secondBinding.phone.setText(extras.getString(MainActivity.PHONE_KEY));
        secondBinding.email.setText(extras.getString(MainActivity.EMAIL_KEY));
        secondBinding.age.setText(extras.getString(MainActivity.AGE_KEY));
    }
}
