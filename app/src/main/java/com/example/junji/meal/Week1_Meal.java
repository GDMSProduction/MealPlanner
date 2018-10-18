package com.example.junji.meal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Week1_Meal extends AppCompatActivity {

    public String week1items = "Breakfast: " +
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
            "\n-Baked Salmon South Western veggie tacos" +
            "\n OR" +
            "\n-Stir Fried Veggies";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week1__meal);

        TextView week1 = findViewById(R.id.week1List);
        week1.setText(week1items);

    }
}
