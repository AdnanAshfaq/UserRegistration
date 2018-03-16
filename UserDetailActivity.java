package com.example.naumi.userregisteration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserDetailActivity extends AppCompatActivity {
    private String name,fname,phone,email,address,gender,age,day,month,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        Intent i = getIntent();
        User obj = (User)i.getSerializableExtra("user");
        TextView textout = (TextView) findViewById(R.id.mytext);

        String strText=obj.getUserName()+"\n\n"+obj.getfName()+"\n\n"+obj.getPhone()+"\n\n"+obj.getEmail()+"\n\n"+obj.getAddress()+"\n\n"+obj.getGender()+"\n\n"+obj.getAge()+"\n\n"+obj.getDay()+"-"+obj.getMonth()+"-"+obj.getYear();
        textout.setText(strText);

    }
}