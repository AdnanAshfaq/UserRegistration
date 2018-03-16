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

            User obj= new User();
            RadioButton lbtn =(RadioButton)findViewById(R.id.female);
            lbtn.setError(null);
            EditText usernameEditText = (EditText) findViewById(R.id.name);
            String username = usernameEditText.getText().toString();
            obj.setUserName(username);
            EditText fnameEditText = (EditText) findViewById(R.id.fname);
            String fname = fnameEditText.getText().toString();
            obj.setfName(fname);
            EditText phnoEditText = (EditText) findViewById(R.id.phno);
            String phoneno = phnoEditText.getText().toString();
            obj.setPhone(phoneno);
            EditText emailEditText = (EditText) findViewById(R.id.email);
            String email = emailEditText.getText().toString();
            obj.setEmail(email);
            EditText addressEditText = (EditText) findViewById(R.id.address);
            String address = addressEditText.getText().toString();
            obj.setAddress(address);
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            obj.setGender(radioButton.getText().toString());
            EditText ageEditText = (EditText) findViewById(R.id.age);
            String age = ageEditText.getText().toString();
            obj.setAge(age);
            Spinner dayspin= (Spinner)findViewById(R.id.day);
            String day = dayspin.getSelectedItem().toString();
            obj.setDay(day);
            Spinner monthspin= (Spinner)findViewById(R.id.month);
            String month = monthspin.getSelectedItem().toString();
            obj.setMonth(month);
            Spinner yearspin= (Spinner)findViewById(R.id.year);
            String year = yearspin.getSelectedItem().toString();
            obj.setYear(year);
            if (obj.getUserName().matches("") || obj.getfName().matches("") || obj.getPhone().matches("") || obj.getEmail().matches("") || obj.getAddress().matches("") || selectedId==-1 || obj.getAge().matches("")) {
                // Show Error on edittext
                if (obj.getUserName().matches("")) {
                    usernameEditText.setError("Empty");
                }
                if (obj.getfName().matches("")) {
                    fnameEditText.setError("Empty");
                }
                if (obj.getPhone().matches("")) {
                    phnoEditText.setError("Empty");
                }
                if (obj.getEmail().matches("")) {
                    emailEditText.setError("Empty");
                }
                if (obj.getAddress().matches("")) {
                    addressEditText.setError("Empty");
                }
                if(selectedId==-1){
                    lbtn.setError("Not Checked!");
                }
                if (obj.getAge().matches("")) {
                    ageEditText.setError("Empty");
                }

            }else{
                Intent i = new Intent(MainActivity.this,UserDetailActivity.class);
                i.putExtra("user",obj);

                startActivity(i);
            }

        }
    }
}
