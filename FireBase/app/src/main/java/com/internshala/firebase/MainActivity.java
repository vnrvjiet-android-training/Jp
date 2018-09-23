package com.internshala.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;
    private TextView userRegistration;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnButton);
        userRegistration = (TextView)findViewById(R.id.tvRegister);

        Info.setText("No of Attempts Remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
        userRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "register called", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this,RegistrationActivity.class));
            }
        });
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("Admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this,"Login Success", Toast.LENGTH_SHORT).show();


        } else {
            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));
            Toast.makeText(MainActivity.this,"Login Failed", Toast.LENGTH_SHORT).show();


            if (counter == 0) {
                Login.setEnabled(false);
            }
        }
    }
}

