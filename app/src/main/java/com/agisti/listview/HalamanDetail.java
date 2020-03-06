package com.agisti.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class HalamanDetail extends AppCompatActivity {
    public static String FOTO = "foto" ;
    public static String MAKANAN = "makanan";
    public static String DETAIL = "detail";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_detail);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(getIntent().getStringExtra(MAKANAN));
        }

        TextView makanan = findViewById(R.id.tv_makanan);
        TextView detail = findViewById(R.id.tv_detail);
        ImageView foto = findViewById(R.id.img_item_photo);


        Glide.with(this)
                .load(getIntent().getStringExtra(FOTO))
                .into(foto);
        makanan.setText(getIntent().getStringExtra(MAKANAN));
        detail.setText(getIntent().getStringExtra(DETAIL));

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

}


