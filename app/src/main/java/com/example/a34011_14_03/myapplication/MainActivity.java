package com.example.a34011_14_03.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View v)
    {
        {
            EditText username = (EditText) findViewById(R.id.Login);
            EditText password = (EditText) findViewById(R.id.Mdp);
            if (username.getText().toString().equals("") && password.getText().toString().equals("")) {
                Toast.makeText(this, "Welcome here !", Toast.LENGTH_SHORT).show();//correct password
                Intent intent = new Intent(this, MenuPrincipal.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "You shall not pass !", Toast.LENGTH_SHORT).show();//incorrect password

            }
        }
    }
}

