package com.example.slider1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.example.slider1.R.*;

public class MainActivity extends AppCompatActivity {
    ViewPager viewpager ;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent p=getIntent();

        position=p.getExtras().getInt("id");
        GridAdapter gridAdapter=new GridAdapter(this);
        List<ImageView> images = new ArrayList<ImageView>();
        for (int i = 0; i < gridAdapter.getCount(); i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(gridAdapter.imageArray[i]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            images.add(imageView);
        }
        final ImageAdapter pageradapter = new ImageAdapter(images);
        viewpager = findViewById(R.id.viewPager);
        viewpager.setAdapter(pageradapter);
        viewpager.setCurrentItem(position);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.custom:
                startActivity(new Intent(MainActivity.this, Grid_View.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}

