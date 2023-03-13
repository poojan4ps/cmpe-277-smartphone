package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    protected void onRestart() {
        super.onRestart();
        MainActivity.threadCounter += 1;}

    public void onFinishActivityB(View view) {
        finish();
    }
}
