package com.example.naumi.userregisteration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class UserData extends AppCompatActivity {
    private String name,fname,phone,email,address,gender,age,day,month,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);
        name=getIntent().getStringExtra("name");
        fname=getIntent().getStringExtra("fname");
        phone=getIntent().getStringExtra("phone");
        email=getIntent().getStringExtra("email");
        address=getIntent().getStringExtra("address");
        gender=getIntent().getStringExtra("gender");
        age=getIntent().getStringExtra("age");
        day=getIntent().getStringExtra("day");
        month=getIntent().getStringExtra("month");
        year=getIntent().getStringExtra("year");

        TextView textout = (TextView) findViewById(R.id.mytext);

        String strText=name+"\n\n"+fname+"\n\n"+phone+"\n\n"+email+"\n\n"+address+"\n\n"+gender+"\n\n"+age+"\n\n"+day+"-"+month+"-"+year;
        textout.setText(strText);

    }
}
//