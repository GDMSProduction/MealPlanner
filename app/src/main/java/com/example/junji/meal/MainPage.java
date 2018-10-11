package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    private Button loginbutton;
    private Button signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        loginbutton = (Button) findViewById(R.id.LogInButton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenLogIn();
            }
        });
        signupbutton = (Button) findViewById(R.id.SignUpButton);
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSignUp();
            }
        });

    }
    public void OpenLogIn(){
        Intent intent = new Intent(this,LogInPage.class);
        startActivity(intent);
    }
    public void OpenSignUp(){
        Intent intent = new Intent(this,SignUpPage.class);
        startActivity(intent);
    }

}
