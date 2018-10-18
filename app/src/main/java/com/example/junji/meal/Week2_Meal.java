package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Week2_Meal extends AppCompatActivity {

    private Button backToCalendar;
    public String week2items =
            "Week 2" +
            "\n\nBreakfast: " +
            "\n-Oatmeal with apples" +
            "\n OR" +
            "\n-Fresh Fruit Plate" +
            "\n\nLunch: " +
            "\n-Zucchini cashew soup" +
            "\n OR" +
            "\n-Microgreen salad" +
            "\n\nSnack: " +
            "\n-cup of blueberries with a green apple" +
            "\n OR" +
            "\n-3 celery stalks with almond butter" +
            "\n\nDinner: " +
            "\n-Baked Tempeh" +
            "\n OR" +
            "\n-Baked Sweet Potato";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week2__meal);

        backToCalendar = (Button) findViewById(R.id.week2BackBut);
        backToCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BacktoCalendar();
            }
        });

        TextView week2 = findViewById(R.id.week2List);
        week2.setText(week2items);

    }
    public void BacktoCalendar(){
        Intent intent = new Intent(this, CalenderPage.class);
        startActivity(intent);
    }
}
