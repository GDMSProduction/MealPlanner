package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Week1_Meal extends AppCompatActivity {

    private Button backToCalendar;
    public String week1items =
            "Week 1" +
            "\n\nBreakfast: " +
            "\n-1 toast and 2 scrambled eggs" +
            "\n OR" +
            "\n-Fruit Plate" +
            "\n\nLunch: " +
            "\n-Miso Soup" +
            "\n OR" +
            "\n-Greek Salad" +
            "\n\nSnack: " +
            "\n-1 Boiled Egg" +
            "\n OR" +
            "\n-Cup of Fruit" +
            "\n\nDinner: " +
            "\n-Baked Salmon " +
            "\n OR" +
            "\n-Stir Fried Veggies";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week1__meal);

        backToCalendar = (Button) findViewById(R.id.week1BackBut);
        backToCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BacktoCalendar();
            }
        });

        TextView week1 = findViewById(R.id.week1List);
        week1.setText(week1items);

    }
    public void BacktoCalendar(){
        Intent intent = new Intent(this, CalenderPage.class);
        startActivity(intent);
    }
}
