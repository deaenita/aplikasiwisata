package com.example.user.boyolalismartcity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class InfoMerbabu extends AppCompatActivity {

    ImageView iv_pano_merbabu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_merbabu);
        getSupportActionBar().hide();

        iv_pano_merbabu = (ImageView)findViewById(R.id.iv_pano_merbabu);

        iv_pano_merbabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoMerbabu.this, TrackingMerbabu.class));
            }
        });
    }
}
