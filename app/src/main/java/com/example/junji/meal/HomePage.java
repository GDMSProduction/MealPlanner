package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HomePage extends AppCompatActivity {

    private  Button signout;
    private Button info;
    private Button calender;
    private Button recipe;
    public int dayNum;
    public String week1 = "Breakfast: " +
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

    public String week2 = "Breakfast: " +
            "\n-Oatmeal with blueberries" +
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

    public String week3 = "Breakfast: " +
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

        String date_d = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date());
        TextView theDate = findViewById(R.id.HomeDate);
        theDate.setText(date_d);

        dayNum = 1;
        TextView dayOfPlan = findViewById(R.id.DayOfPlan);
        dayOfPlan.setText("Day of Plan: " + dayNum);

        TextView todayFood = findViewById(R.id.TodaysFoodList);


        if (dayNum > 0 && dayNum <= 7){
            todayFood.setText(week1);
        }
        else if (dayNum >= 8 && dayNum <= 14){
            todayFood.setText(week2);
        }
        else if (dayNum >= 15 && dayNum <= 21){
            todayFood.setText(week3);
        }


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
    public  void  openProfile(View view){
        Intent intent = new Intent(this,ProfilePage1.class);
        startActivity(intent);
    }

}
