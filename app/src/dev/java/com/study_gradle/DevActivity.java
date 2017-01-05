package com.study_gradle;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author 张全
 */

public class DevActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dev);
       TextView textView= (TextView) findViewById(R.id.textview);
        textView.setText("DevActivity");
        textView.setTextColor(Color.RED);
    }
}
