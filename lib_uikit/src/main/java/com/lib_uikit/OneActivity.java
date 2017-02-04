package com.lib_uikit;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
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

        BroadcastReceiver receiver = new BroadcastReceiver() {

            @Override
            public void onReceive(Context context, Intent intent) {
                
                abortBroadcast();
            }
        };

    }
}
