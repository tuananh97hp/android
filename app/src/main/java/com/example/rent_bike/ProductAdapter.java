package com.example.rent_bike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rent_bike.model.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Product> productArrayList;

    public ProductAdapter(Context context, int layout, ArrayList<Product> productArrayList) {
        this.context = context;
        this.layout = layout;
        this.productArrayList = productArrayList;
    }

    @Override
    public int getCount() {
        return productArrayList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        TextView name = convertView.findViewById(R.id.nameProduct);
        TextView desc = convertView.findViewById(R.id.desc);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        Product product = productArrayList.get(position);

        name.setText(product.getName());
        desc.setText(product.getDesc());
        Picasso.get().load(product.getImage()).into(imageView);

        return null;
    }
}
