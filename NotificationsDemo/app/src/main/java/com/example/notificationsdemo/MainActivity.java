package com.example.notificationsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationManager manager;
    NotificationCompat.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){

                    NotificationChannel channel=new NotificationChannel("ssvp","Android",NotificationManager.IMPORTANCE_DEFAULT);
                    manager.createNotificationChannel(channel);

                }

                Intent intent =new Intent(getApplicationContext(),MainActivity.class);

                PendingIntent pi=PendingIntent.getActivity(MainActivity.this,
                        1,intent,PendingIntent.FLAG_UPDATE_CURRENT);

                builder = new NotificationCompat.Builder(MainActivity.this,"ssvp");
                builder.setContentTitle("SVEC College");
                builder.setContentText("department of CSE");
                builder.setDefaults(NotificationCompat.DEFAULT_ALL);

                builder.setAutoCancel(true);

                builder.setPriority(NotificationCompat.PRIORITY_MAX);

                builder.setSmallIcon(R.drawable.notification);

                builder.setContentIntent(pi);
                builder.addAction(R.drawable.reply,"reply",pi);


                manager.notify(1,builder.build());

            }
        });
    }
}