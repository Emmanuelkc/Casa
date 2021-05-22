package com.example.casa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        button = (Button)findViewById(R.id.buttonsend);
        button.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(FifthActivity.this,Homepage.class);
                startActivity(intent);
            }
        },3500);





    }
}
