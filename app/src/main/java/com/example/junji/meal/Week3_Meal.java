package com.example.junji.meal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Week3_Meal extends AppCompatActivity {

    public String week3items = "Breakfast: " +
            "\n-Farina with walnuts and an apple" +
            "\n OR" +
            "\n-Fresh Fruit Plate" +
            "\n\nLunch: " +
            "\n-Jicama-Avocado salad" +
            "\n OR" +
            "\n-sweet potato & roasted red pepper bisque" +
            "\n\nSnack: " +
            "\n-boiled egg with whole grain crackers" +
            "\n OR" +
            "\n-1/2 cup cooked quinoa with avocado" +
            "\n\nDinner: " +
            "\n-Asian stir fry" +
            "\n OR" +
            "\n-Southwestern veggie taco";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3__meal);

        TextView week1 = findViewById(R.id.week3List);
        week1.setText(week3items);

    }
}
