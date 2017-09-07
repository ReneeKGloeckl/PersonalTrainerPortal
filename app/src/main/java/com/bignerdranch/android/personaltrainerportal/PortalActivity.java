package com.bignerdranch.android.personaltrainerportal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PortalActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

        UserFragment portalFragment = new UserFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, portalFragment).commit();
        }
    }

