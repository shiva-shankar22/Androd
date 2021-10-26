package com.example.toast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final  Button b=(Button) findViewById(R.id.button);
   //   final Toast t;
       final EditText et=(EditText) findViewById(R.id.et);
       final TextView tv=(TextView) findViewById(R.id.textView);
       final TextView tv2=(TextView) findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


             Toast.makeText(getApplicationContext(),"clicked " +String.valueOf(++cnt),Toast.LENGTH_SHORT).show();
            String str= et.getText().toString();
            tv.setText(str);
            tv2.setText("work done "+cnt);
          }
      });
    }
}