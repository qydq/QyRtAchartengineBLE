package com.lyue.qyrtachartengineble;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

    private static String TAG = MainActivity.class.getSimpleName();
    CardioChart cardioChart = new CardioChart();
    private static int method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, cardioChart).commit();
        }
    }

}
