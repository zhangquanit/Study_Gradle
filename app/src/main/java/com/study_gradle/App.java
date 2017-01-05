package com.study_gradle;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * @author 张全
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
