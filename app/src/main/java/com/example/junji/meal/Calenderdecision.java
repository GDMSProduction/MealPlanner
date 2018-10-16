package com.example.junji.meal;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class Calenderdecision extends AppCompatActivity {

    private Button Back ;
    //CalendarView calendar;
   // TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calenderdecision);
        Back = (Button) findViewById(R.id.BackToCalender);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              BacktoView();
         }
        });
        //calendar= findViewById(R.id.calendarView);
    ///    textView = findViewById(R.id.dateText);

       // calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
          //  @Override
           // public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
//
             //   String date = month +"/"+dayOfMonth+"/"+year;
               // textView.setText(date);
          //  }
       // });
    }

    public void BacktoView(){
        Intent intent = new Intent(this,CalenderPage.class);
        startActivity(intent);
    }

    public void GotoImage1(View view){
            Intent intent = new Intent(this,Image_1.class);
            startActivity(intent);
    }

    public void GotoImage2(View view){
        Intent intent = new Intent(this,RecipeView.class);
        startActivity(intent);
    }
}
