package com.example.marcf.mealprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartApp extends AppCompatActivity {

    private Button logbut;
    private Button signbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);


        logbut = (Button) findViewById(R.id.LoginButton);
        logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginPage();
            }
        });


        signbut = (Button) findViewById(R.id.SignUpButton);
        signbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                openSignUpPage();
            }
        });


    }

    public void openLoginPage()
    {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }

    public void openSignUpPage()
    {
        Intent intents = new Intent(this, SignUpPage.class);
        startActivity(intents);
    }

}
