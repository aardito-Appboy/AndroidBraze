package com.braze.adamardito.adamandroidbrazeintegration;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.appboy.Appboy;
import com.appboy.AppboyLifecycleCallbackListener;
import com.appboy.support.AppboyLogger;

public class MainApplication extends Application {

    public void onCreate() {

        final Context applicationContext = getApplicationContext();

        super.onCreate();
        AppboyLogger.setLogLevel(Log.VERBOSE);
        registerActivityLifecycleCallbacks(new AppboyLifecycleCallbackListener());
        Appboy.getInstance(applicationContext).changeUser("adam");

    }
}
