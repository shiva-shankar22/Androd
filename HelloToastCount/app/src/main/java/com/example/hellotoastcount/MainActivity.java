package com.example.hellotoastcount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=findViewById(R.id.button);
        Button bt=findViewById(R.id.bt2);
        TextView t=findViewById(R.id.txt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"ssvp",Toast.LENGTH_SHORT).show();
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(String.valueOf(++cnt));
            }
        });

        if(savedInstanceState!=null && savedInstanceState.containsKey("key")) {
            cnt = savedInstanceState.getInt("key");
            t.setText(String.valueOf(cnt));
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("key",cnt);
    }
}