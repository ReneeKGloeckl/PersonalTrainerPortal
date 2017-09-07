package com.bignerdranch.android.personaltrainerportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        UserFragment portalFragment = new UserFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, portalFragment).commit();
    }
}
