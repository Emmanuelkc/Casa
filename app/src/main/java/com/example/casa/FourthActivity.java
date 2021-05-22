package com.example.casa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    Button button;
    TextView textView1;
    TextView textView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        textView1 =(TextView)findViewById(R.id.textviewforgottenpassword);
        textView2 = (TextView)findViewById(R.id.textviewregister);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });



        button = (Button)findViewById(R.id.buttonlogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthActivity.this,Homepage.class);
                startActivity(intent);
            }
        });







    }
}
