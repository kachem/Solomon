package com.gallery.camera.privacy.solomon;

import android.app.Application;
import android.content.Context;

/**
 * Created by kachem on 2016/3/26.
 */
public class SolomonApplication extends Application{
    private static SolomonApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static SolomonApplication getInstance(){
        return application;
    }
}
