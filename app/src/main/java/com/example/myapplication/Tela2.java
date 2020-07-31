package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        ImageView img = findViewById(R.id.img);
        Glide.with(this).load("https://i.pinimg.com/originals/c5/d6/c0/c5d6c0eae34ae8bb69533bc7872308ad.jpg").centerCrop().into(img);
    }
}