package com.example.rohit.myfirstsql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username,userpass;
    String un ,up;
    Button register,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= (EditText) findViewById(R.id.username);
        userpass= (EditText) findViewById(R.id.userpass);
        register= (Button) findViewById(R.id.register);
        login= (Button) findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                un=username.getText().toString();
                up=userpass.getText().toString();
                String method="login";
                BackgroundTask backgroundTask=new BackgroundTask(getApplicationContext());
                backgroundTask.execute(method,un,up);
            }
        });
    }
}
