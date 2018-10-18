package com.example.junji.meal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Week2_Meal extends AppCompatActivity {

    public String week2items = "Breakfast: " +
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

        TextView week2 = findViewById(R.id.week2List);
        week2.setText(week2items);

    }
}
