package com.example.addlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;


import java.security.Provider;

public class MainActivity extends AppCompatActivity {
    private Button Btn1,Btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn1 = (Button) findViewById(R.id.btnplay);
        Btn2 = (Button) findViewById(R.id.btnstop);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this,MyServices.class));

            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,MyServices.class));
            }
        });


    }


}
