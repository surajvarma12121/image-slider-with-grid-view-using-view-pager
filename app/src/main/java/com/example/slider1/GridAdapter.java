package com.example.slider1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    private Context mcontext1;
    public int[] imageArray={R.drawable.a,R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};

    public GridAdapter(Context mcontext1) {
        this.mcontext1 = mcontext1;
    }

    @Override
    public int getCount() {

        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView=new ImageView(mcontext1);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));
        return imageView;
    }
}
