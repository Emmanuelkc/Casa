package com.example.casa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Homepage extends AppCompatActivity {

    LinearLayout linearLayout;

    ImageView imageView;

    GridView gridView;
    Integer[] images = {R.drawable.bedroomai,R.drawable.bedroomak,R.drawable.bedroomal,R.drawable.bedroomb,R.drawable.bedroomc,R.drawable.bedroomd,R.drawable.bedroome,R.drawable.bedroomf};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        linearLayout = (LinearLayout)findViewById(R.id.linearlayoutbedroom);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,bedroomfullpic.class);
                startActivity(intent);
            }
        });


        imageView = (ImageView)findViewById(R.id.imageviewcart);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,cartpage.class);
                startActivity(intent);
            }
        });




        gridView = (GridView)findViewById(R.id.mygridview);
        gridView.setAdapter(new ImageAdapterGridview(this));

    }

    private class ImageAdapterGridview extends BaseAdapter {

        private Context mContext;

        public ImageAdapterGridview(Context context) {
            mContext = context;


        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView==null){
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(250,250));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(16,16,16,16);



            }else {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(images[position]);
            return imageView;
        }


    }



    }

