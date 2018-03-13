package com.example.naumi.userregisteration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newActivity(View view){

        CheckBox opt =(CheckBox)findViewById(R.id.agree);
        if(opt.isChecked()){


            RadioButton lbtn =(RadioButton)findViewById(R.id.female);
            lbtn.setError(null);
            EditText usernameEditText = (EditText) findViewById(R.id.name);
            String username = usernameEditText.getText().toString();
            EditText fnameEditText = (EditText) findViewById(R.id.fname);
            String fname = fnameEditText.getText().toString();
            EditText phnoEditText = (EditText) findViewById(R.id.phno);
            String phoneno = phnoEditText.getText().toString();
            EditText emailEditText = (EditText) findViewById(R.id.email);
            String email = emailEditText.getText().toString();
            EditText addressEditText = (EditText) findViewById(R.id.address);
            String address = addressEditText.getText().toString();
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            EditText ageEditText = (EditText) findViewById(R.id.age);
            String age = ageEditText.getText().toString();
            Spinner dayspin= (Spinner)findViewById(R.id.day);
            String day = dayspin.getSelectedItem().toString();
            Spinner monthspin= (Spinner)findViewById(R.id.month);
            String month = monthspin.getSelectedItem().toString();
            Spinner yearspin= (Spinner)findViewById(R.id.year);
            String year = yearspin.getSelectedItem().toString();
            if (username.matches("") || fname.matches("") || phoneno.matches("") || email.matches("") || address.matches("") || selectedId==-1 || age.matches("")) {
                // Show Error on edittext
                if (username.matches("")) {
                    usernameEditText.setError("Empty");
                }
                if (fname.matches("")) {
                    fnameEditText.setError("Empty");
                }
                if (phoneno.matches("")) {
                    phnoEditText.setError("Empty");
                }
                if (email.matches("")) {
                    emailEditText.setError("Empty");
                }
                if (address.matches("")) {
                    addressEditText.setError("Empty");
                }
                if(selectedId==-1){
                    lbtn.setError("Not Checked!");
                }
                if (age.matches("")) {
                    ageEditText.setError("Empty");
                }

            }else{
                Intent i = new Intent(MainActivity.this,UserData.class);
                i.putExtra("name",username);
                i.putExtra("fname",fname);
                i.putExtra("phone",phoneno);
                i.putExtra("email",email);
                i.putExtra("address",address);
                i.putExtra("gender",radioButton.getText().toString());
                i.putExtra("age",age);
                i.putExtra("day",day);
                i.putExtra("month",month);
                i.putExtra("year",year);
                startActivity(i);
            }

        }
    }
}
