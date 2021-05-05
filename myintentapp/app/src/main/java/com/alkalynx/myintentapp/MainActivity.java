package com.alkalynx.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCal, btnWeb, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCal = (Button) findViewById(R.id.btnCal);
        btnWeb = (Button) findViewById(R.id.btnWeb);
        btnProfile = (Button) findViewById(R.id.btnProfile);

        btnCal.setOnClickListener(this);
        btnWeb.setOnClickListener(this);
        btnProfile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnCal:
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 0838383290060"));
                startActivity(call);
                break;
            case R.id.btnWeb:
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kominfo.go.id/"));
                startActivity(web);
                break;
            case R.id.btnProfile:
                Intent profile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profile);
                break;
        }
    }
}