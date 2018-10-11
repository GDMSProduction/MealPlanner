package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private  Button signout;
    private Button info;
    private Button calender;
    private Button recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        signout = (Button) findViewById(R.id.SignOutButton);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMainPage();
            }
        });

        info = (Button) findViewById(R.id.infobutton);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenInfoPage();
            }
        });


        calender = (Button) findViewById(R.id.calenderbutton);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCalenderPage();
            }
        });


        recipe = (Button) findViewById(R.id.recipebutton);
        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRecipePage();
            }
        });
    }
    public void OpenMainPage(){
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
    public void OpenInfoPage(){
        Intent intent = new Intent(this,InfoPage.class);
        startActivity(intent);
    }
    public void OpenCalenderPage(){
        Intent intent = new Intent(this,CalenderPage.class);
        startActivity(intent);
    }
    public void OpenRecipePage(){
        Intent intent = new Intent(this,RecipePage.class);
        startActivity(intent);
    }

}
