package com.lib_uikit;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author 张全
 */

public class OneActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
        System.out.println("BuildConfig.DEBUG"+BuildConfig.DEBUG);
    }
}
