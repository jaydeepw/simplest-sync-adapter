package com.github.jaydeepw.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.jaydeepw.myapp.sync.SyncUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SyncUtils.createSyncAccount(this);

        findViewById(R.id.textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SyncUtils.forceRefreshAll(MainActivity.this);
                Toast.makeText(MainActivity.this, "Now check logcat", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
