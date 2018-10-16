package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecipePage extends AppCompatActivity {

    private Button signout;
    private Button home;
    private Button calender;
    private Button info;
    private Button Dinner ;
    private Button lunch ;
    private Button breakfast;
    private Button snack ;
    private Button recipeview;
    private Button recipeview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);

        recipeview = (Button) findViewById(R.id.View);
        recipeview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenView();
            }
        });
        recipeview2 = (Button) findViewById(R.id.View2);
        recipeview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenView2();
            }
        });
        Dinner = (Button) findViewById(R.id.dinner);
        Dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dinner();
            }
        });


        lunch = (Button) findViewById(R.id.lunch);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lunch();
            }
        });

        breakfast  = findViewById(R.id.breakfast);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Breakfast();
            }
        });

        snack = findViewById(R.id.snack);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snack();
            }
        });


        signout = (Button) findViewById(R.id.SignOutButton);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMainPage();
            }
        });
        home = (Button) findViewById(R.id.homebutton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenHomePage();
            }
        });



        calender = (Button) findViewById(R.id.calenderbutton);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCalenderPage();
            }
        });


        info = (Button) findViewById(R.id.infobutton);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenInfoPage();
            }
        });

    }

    public void Snack(){

        breakfast.setBackgroundColor(0xdd4b92c4);
        Dinner.setBackgroundColor(0xdd4b92c4);
        lunch.setBackgroundColor(0xdd4b92c4);
        snack.setBackgroundColor(0xffffffff);

    }
    public void Lunch(){
        breakfast.setBackgroundColor(0xdd4b92c4);
        Dinner.setBackgroundColor(0xdd4b92c4);
        lunch.setBackgroundColor(0xffffffff);
        snack.setBackgroundColor(0xdd4b92c4);
    }
    public  void dinner(){
        breakfast.setBackgroundColor(0xdd4b92c4);
        Dinner.setBackgroundColor(0xffffffff);
        lunch.setBackgroundColor(0xdd4b92c4);
        snack.setBackgroundColor(0xdd4b92c4);
    }
    public  void Breakfast(){
        breakfast.setBackgroundColor(0xffffffff);
        Dinner.setBackgroundColor(0xdd4b92c4);
        lunch.setBackgroundColor(0xdd4b92c4);
        snack.setBackgroundColor(0xdd4b92c4);
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
    public void OpenHomePage(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
    public void gotoprofile(View view) {
        Intent intent = new Intent(this,ProfilePage1.class);
        startActivity(intent);
    }
    public void OpenView(){
        Intent intent = new Intent(this,RecipeView.class);
        startActivity(intent);
    }
    public void OpenView2(){
        Intent intent = new Intent(this,Image_1.class);
        startActivity(intent);
    }
}
