package com.example.marcf.mealprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecipePage extends AppCompatActivity {

    private Button signOut;

    private Button calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);

        signOut = (Button) findViewById(R.id.RecipeSignOutBut);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotoStartPage();

            }
        });

        calendar = (Button) findViewById(R.id.RecipeCalendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToCalendar();

            }
        });

    }

    public void GotoStartPage(){
        Intent intent = new Intent(this, StartApp.class);
        startActivity(intent);
    }

    public void ToCalendar(){
        Intent intent = new Intent(this, CalendarTab.class);
        startActivity(intent);
    }

}
