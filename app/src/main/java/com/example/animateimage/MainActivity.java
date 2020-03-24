package com.example.animateimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imageClicked(View view) {

        ImageView dog1 = findViewById(R.id.dog1);
        ImageView dog2 = findViewById(R.id.dog2);
        Log.i("viewid", "clicked id " + view.getId() + ", id2 " + R.id.dog2);
        if (view.getId() == R.id.dog1) {
            dog1.animate().alpha(0f).setDuration(3000);
            dog2.animate().alpha(1f).setDuration(3000);
        } else {
            dog2.animate().alpha(0f).setDuration(3000);
            dog1.animate().alpha(1f).setDuration(3000);
        }

    }
}
