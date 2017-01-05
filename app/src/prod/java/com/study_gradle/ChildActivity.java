package com.study_gradle;

import android.app.Activity;
import android.os.Bundle;

import com.prod.ProdClass;

/**
 * @author 张全
 */

public class ChildActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prod);
        new ProdClass().test();
    }
}
