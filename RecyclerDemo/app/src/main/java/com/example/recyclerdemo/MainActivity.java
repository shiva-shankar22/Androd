package com.example.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.Settings;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int [] images={R.drawable.a1,R.drawable.bommarillu,
            R.drawable.chandhramukhi,R.drawable.d_for_dopidi,
            R.drawable.ee_nagaraniki_em_ayindhi,R.drawable.faf9,
            R.drawable.g_gallanthayindhe,R.drawable.husharu,
    R.drawable.ishq,R.drawable.jalsa};

    String[] names={"Hero","Siddhartha","Rajini","Sandeep Kishan","hero2","Vin disel",
                    "nithin","PS PK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.rec);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

         recyclerView.setAdapter(new MyAdapter(this,images,names));
    }
}