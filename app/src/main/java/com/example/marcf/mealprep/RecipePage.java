package com.example.marcf.mealprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecipePage extends AppCompatActivity {

    private Button signOut;

    private Button calendar;

    private Button infoBut;

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

        infoBut = (Button) findViewById(R.id.RecipeInfo);
        infoBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotoInfoPage();
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

    public void GotoInfoPage(){
        Intent intent = new Intent(this, InfoPage.class);
        startActivity(intent);
    }

}
