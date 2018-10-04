package com.example.marcf.mealprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarTab extends AppCompatActivity {

    private Button infoBut;

    private Button signOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_tab);

        infoBut = (Button) findViewById(R.id.CalendarPageInflBut);
        infoBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfoPage();
            }
        });

       signOut = (Button) findViewById(R.id.CalendarSignOut);
       signOut.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openStartPagefromCalendar();
           }
       });

    }

     public void openStartPagefromCalendar()
     {
         Intent intentzzz = new Intent(this, StartApp.class);
         startActivity(intentzzz);
     }

    public void openInfoPage()
    {
        Intent intentsss = new Intent(this, InfoPage.class);
        startActivity(intentsss);
    }


}
