package com.example.user.boyolalismartcity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfoTlatar extends AppCompatActivity {

    ImageView iv_pano_tlatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tlatar);
        getSupportActionBar().hide();

        iv_pano_tlatar= (ImageView)findViewById(R.id.iv_pano_tlatar);

        iv_pano_tlatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoTlatar.this, Tlatar.class));
            }
        });
    }
}
