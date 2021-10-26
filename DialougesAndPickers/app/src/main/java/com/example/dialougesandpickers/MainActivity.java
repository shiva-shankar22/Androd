package com.example.dialougesandpickers;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {


    int dd,mm,yy;
    int mn,hr,sec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("this is alert");
                builder.setMessage("exit app??");
                builder.setIcon(R.drawable.alertt);
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      finish();
                    }
                });

                builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();

                    }
                });
                builder.show();
            }
        });

        findViewById(R.id.dtbtn).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                Calendar c= Calendar.getInstance();

                yy=c.get(Calendar.YEAR);
                mm=c.get(Calendar.MONTH);
                dd=c.get(Calendar.DATE);

               DatePickerDialog dp=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                       Toast.makeText(MainActivity.this,i+" "+i1+" "+i2,Toast.LENGTH_SHORT).show();
                   }
               },dd,mm,yy);
               dp.show();
            }
        });

        findViewById(R.id.tmbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Calendar c=Calendar.getInstance();
              hr=c.get(Calendar.HOUR);
              mn=c.get(Calendar.MINUTE);
              sec=c.get(Calendar.SECOND);
                TimePickerDialog tp=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {

                        Toast.makeText(MainActivity.this,"time is \n    "+i+":"+ +i1,Toast.LENGTH_SHORT).show();
                    }
                },hr,mn,true);
                tp.show();
            }
        });

    }


}