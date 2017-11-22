package com.example.user.boyolalismartcity;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;

public class InfoMerapi extends AppCompatActivity {

    ImageView iv_pano_merapi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_merapi);
        getSupportActionBar().hide();

        iv_pano_merapi = (ImageView)findViewById(R.id.iv_pano_merapi);

        iv_pano_merapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoMerapi.this, TrackingMerapi.class));
            }
        });
    }
}
