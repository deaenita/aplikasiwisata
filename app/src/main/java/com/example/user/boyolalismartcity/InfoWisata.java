package com.example.user.boyolalismartcity;

import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfoWisata extends AppCompatActivity {

    ImageView iv_Tracking_Merbabu;
    ImageView iv_Tracking_Merapi;
    ImageView iv_Gancik;
    ImageView iv_Tlatar;
    ImageView iv_Pengging;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__wisata);
        getSupportActionBar().hide();

        iv_Tracking_Merbabu = (ImageView) findViewById(R.id.iv_TrackingMerbabu);
        iv_Tracking_Merapi = (ImageView) findViewById(R.id.iv_TrackingMerapi);
        iv_Gancik = (ImageView) findViewById(R.id.iv_Gancik);
        iv_Tlatar = (ImageView) findViewById(R.id.iv_Tlatar);
        iv_Pengging = (ImageView) findViewById(R.id.iv_Pengging);

        iv_Tracking_Merbabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoWisata.this, InfoMerbabu.class));
            }
        });
        iv_Tracking_Merapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoWisata.this, InfoMerapi.class));
            }
        });
        iv_Gancik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoWisata.this, InfoGancik.class));
            }
        });
        iv_Tlatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoWisata.this, InfoTlatar.class));
            }
        });
        iv_Pengging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoWisata.this, InfoPengging.class));
            }
        });

    }
}
