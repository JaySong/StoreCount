package com.cj.storecount;

import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created on 2016/1/14
 *
 * @author JaySeng
 * @version 1.0.0
 */
public class TencentStorePresenter implements StorePresenter{
    private static final String BUYER_URL = "http://android.myapp.com/myapp/detail.htm?apkName=com.lz.lswbuyer";
    private static final String TAG = TencentStorePresenter.class.getSimpleName();
    private final RequestQueue requestQueue;

    public TencentStorePresenter() {
        requestQueue = Volley.newRequestQueue(StoreApp.getApplication());
    }

    public void getBuyer() {

        StringRequest stringRequest = new StringRequest(BUYER_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, response);
                String buyerCount = MatcherUtil.getTencentBuyerCount(response);

                Log.d(TAG, buyerCount);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, error.getMessage(), error);
            }
        });

        requestQueue.add(stringRequest);
    }

    @Override
    public void getSeller() {

    }


}
