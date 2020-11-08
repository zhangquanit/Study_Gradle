package com.study_gradle;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author 张全
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView = (TextView) findViewById(R.id.text);
        PackageManager pm = getPackageManager();
        int versionCode = 0;
        String versionName = null;
        String appName = null;
        try {
            ApplicationInfo appInfo = pm
                    .getApplicationInfo(getPackageName(), 0);
            appName = pm.getApplicationLabel(appInfo).toString();
            PackageInfo packInfo = pm.getPackageInfo(getPackageName(), 0);

            if (packInfo != null) {
                versionName = packInfo.versionName;
                versionCode = packInfo.versionCode;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuffer data = new StringBuffer();
        data.append("appName=" + appName).append("\n")
                .append("versionCode=" + versionCode).append("\n")
                .append("versionName=" + versionName).append("\n")
                .append("pkgName=" + getPackageName()).append("\n")
                .append("BuildConfig.DEBUG=" + BuildConfig.DEBUG).append("\n");

        textView.setText(data.toString());


        //打开
//        startActivity(new Intent(this,ChildActivity.class));


//        new OneClass().test();
    }

    private void aarTest() {
    }
}
