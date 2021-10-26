package com.example.studentregform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    char ch='\n';
    EditText name,clg,mail,phno,pin,vlg;
   RadioButton r1,r2;
    TextView res; CheckBox ch1,ch2,ch3;
//TextView res;
    Spinner sp,sp_d,ystd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.submit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder str=new StringBuilder();
                name =findViewById(R.id.sname);
                ch1=findViewById(R.id.ch_tel);
                ch2=findViewById(R.id.ch_eng);
                ch3=findViewById(R.id.ch_hin);
                res=findViewById(R.id.resText);
                r1=findViewById(R.id.male);
                r2.findViewById(R.id.female);
                sp=findViewById(R.id.sp_branches);
                sp_d=findViewById(R.id.sp_districts);
                clg=findViewById(R.id.clgname);
                mail=findViewById(R.id.stdmail);
                phno=findViewById(R.id.stdnumber);
                vlg=findViewById(R.id.stdvlg);
                pin=findViewById(R.id.pcode);
                ystd=findViewById(R.id.stdyears);
                String n=name.getText().toString(),cl=clg.getText().toString(),
                         em=mail.getText().toString(),vv=vlg.getText().toString(),
                         ph=phno.getText().toString(),pincode=pin.getText().toString(),
                        yrstd=ystd.getSelectedItem().toString(),
                        dist=sp_d.getSelectedItem().toString(),branch=sp.getSelectedItem().toString();
                String gen="";
                if(r1.isChecked())
                    gen="Male";
                else if(r2.isChecked())
                     gen="female";
                else
                    gen="NONE";


                res.setText(str);

            }
        });
    }

}