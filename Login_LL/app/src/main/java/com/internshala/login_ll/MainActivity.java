package com.internshala.login_ll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button LOGIN;
    Button BACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LOGIN= findViewById(R.id.button);
        BACK= findViewById(R.id.button1);


        LOGIN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();

                    }
                });

        BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"No Content",Toast.LENGTH_LONG).show();
            }
        });
    }
}
