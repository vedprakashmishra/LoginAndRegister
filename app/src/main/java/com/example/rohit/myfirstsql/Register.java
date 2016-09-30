package com.example.rohit.myfirstsql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText name,username,userpass;
    String n,un,up;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name= (EditText) findViewById(R.id.name);
        username= (EditText) findViewById(R.id.username);
        userpass= (EditText) findViewById(R.id.userpass);
        reg= (Button) findViewById(R.id.register);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=name.getText().toString();
                un=username.getText().toString();
                up=userpass.getText().toString();
                String method="register";
                BackgroundTask backgroundTask=new BackgroundTask(getApplicationContext());
                backgroundTask.execute(method,n,un,up);
                finish();
            }
        });

    }
}
