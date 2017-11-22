package com.example.user.boyolalismartcity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfoGancik extends AppCompatActivity {

    ImageView iv_pano_gancik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_gancik);
        getSupportActionBar().hide();

        iv_pano_gancik = (ImageView)findViewById(R.id.iv_pano_gancik);

        iv_pano_gancik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoGancik.this, Gancik.class));
            }
        });
    }
}
