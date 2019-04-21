package com.example.rent_bike.API;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class requestAPI {
    private String url;
    private int method;
    private Context context;
    private OnEventListener callback;

    public requestAPI(String url, int method, Context context, OnEventListener callback) {
        this.url = url;
        this.method = method;
        this.context = context;
        this.callback = callback;
    }

    public void requestAPI(int method, String url, Context context,OnEventListener callback){
        RequestQueue requestQueue = Volley.newRequestQueue(context);

    }
}
