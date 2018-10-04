package com.example.marcf.mealprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class LoginPage extends AppCompatActivity {

private Button loggingInBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loggingInBut = (Button) findViewById(R.id.LoginPageBut);
        loggingInBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCalenderTab();

            }
        });

    }

      public void openCalenderTab(){

        Intent intentz = new Intent(this, CalendarTab.class );
        startActivity(intentz);


      }


}
