package com.example.user.boyolalismartcity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfoPengging extends AppCompatActivity {

    ImageView iv_pano_pengging;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pengging);
        getSupportActionBar().hide();

        iv_pano_pengging= (ImageView)findViewById(R.id.iv_pano_pengging);

        iv_pano_pengging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoPengging.this, Pengging.class));
            }
        });
    }
}
