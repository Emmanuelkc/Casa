package com.example.casa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button = (Button)findViewById(R.id.buttonregister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "you clicked Register", Toast.LENGTH_SHORT);
                Intent intent = new Intent(ThirdActivity.this,Homepage.class);
                startActivity(intent);
            }
        });

        textView = (TextView)findViewById(R.id.textviewlogin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "you clicked Login", Toast.LENGTH_SHORT);
                Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
