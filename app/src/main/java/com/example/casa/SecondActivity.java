package com.example.casa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    ViewPager viewPager;
    Integer[] images = {R.drawable.bedroomai,R.drawable.bedroomak,R.drawable.bedroomal,R.drawable.bedroomb,R.drawable.bedroomc,R.drawable.bedroomd,R.drawable.bedroome,R.drawable.bedroomf};

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        viewPager = (ViewPager)findViewById(R.id.myviewpager);

        viewpagerAdapter viewpagerAdapter = new viewpagerAdapter(this);

        viewPager.setAdapter(viewpagerAdapter);

        button = (Button)findViewById(R.id.buttongetstarted);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });


    }


}
