package com.cj.storecount;

import android.app.Application;

/**
 * Created on 2016/1/14
 *
 * @author JaySeng
 * @version 1.0.0
 */
public class StoreApp extends Application {

    private static StoreApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static StoreApp getApplication() {
        return instance;
    }
}
