package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalenderPage extends AppCompatActivity {

    private Button signout;
    private Button home;
    private Button info;
    private Button recipe;
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
        setContentView(R.layout.activity_calender_page);
        TextView Textscroll = findViewById(R.id.Textscroll) ;
        Textscroll.setMovementMethod(new ScrollingMovementMethod());


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

        info = (Button) findViewById(R.id.infobutton);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenInfoPage();
            }
        });


        recipe = (Button) findViewById(R.id.recipebutton);
        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRecipePage();
            }
        });

        TextView calendarList = findViewById(R.id.Textscroll);
        calendarList.setText(week1);

    }
    public  void OpenMainPage(){
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
    public void OpenHomePage(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
    public void OpenInfoPage(){
        Intent intent = new Intent(this,InfoPage.class);
        startActivity(intent);
    }
    public void OpenRecipePage(){
        Intent intent = new Intent(this,RecipePage.class);
        startActivity(intent);
    }

    public void gotoprofile(View view) {
        Intent intent = new Intent(this,ProfilePage1.class);
        startActivity(intent);
    }
}
