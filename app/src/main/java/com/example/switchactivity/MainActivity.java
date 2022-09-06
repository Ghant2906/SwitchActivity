package com.example.switchactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_pana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_pana = (Button) findViewById(R.id.button);
        btn_pana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent panama = new Intent(MainActivity.this, panamera.class);
                startActivity(panama);
            }
        });
    }
}