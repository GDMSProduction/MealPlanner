package com.example.marcf.mealprep;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoPage extends AppCompatActivity {

private Button calendar;
private Button SignOutInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        calendar = (Button) findViewById(R.id.infoPageCalendarBut);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalendarPagefromInfo();

            }
        });

        SignOutInfo = (Button) findViewById(R.id.InfoSignOut);
        SignOutInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfotoStart();
            }
        });


    }

    public void openCalendarPagefromInfo()
    {
        Intent intenz = new Intent(this, CalendarTab.class);
        startActivity(intenz);
    }

    public void InfotoStart()
    {
        Intent intens = new Intent(this, StartApp.class);
        startActivity(intens);
    }


}
