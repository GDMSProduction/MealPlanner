package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextClock;
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
    private ImageButton recipeview;
    private ImageButton recipeview2;
    private ImageButton recipeview3;
    private ImageButton recipeview4;
    public int screen =1;
    public TextView item1;
    public TextView item2;
    public TextView item3;
    public TextView item4;

    public int MealType = 1; // 1 = breakfast, 2 = Lunch, 3 = Snack, 4 = Dinner
    public int ItemNum;

    public static final String MEAL_TYPE = "com.example.application.example.MEAL_TYPE";
    public static final String MEAL_NUMBER = "com.example.application.example.MEAL_NUMBER";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);

        recipeview = (ImageButton) findViewById(R.id.foodNum1Pic);
        recipeview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ItemNum = 1;
                GotoItemsRecipe();
            }
        });

        recipeview2 = (ImageButton) findViewById(R.id.foodNum2Pic);
        recipeview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ItemNum = 2;
                GotoItemsRecipe();
            }
        });

        recipeview3 = (ImageButton) findViewById(R.id.foodNum3Pic);
        recipeview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ItemNum = 3;
                GotoItemsRecipe();
            }
        });

        recipeview4 = (ImageButton) findViewById(R.id.foodNum4Pic);
        recipeview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ItemNum = 4;
                GotoItemsRecipe();
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

        breakfast.setBackgroundColor(0xffffffff);

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

        item1 = findViewById(R.id.ItemNum1);
        item2 = findViewById(R.id.ItemNum2);
        item3 = findViewById(R.id.ItemNum3);
        item4 = findViewById(R.id.ItemNum4);

    }

    public void Snack(){

        breakfast.setBackgroundColor(0xdd4b92c4);
        Dinner.setBackgroundColor(0xdd4b92c4);
        lunch.setBackgroundColor(0xdd4b92c4);
        snack.setBackgroundColor(0xffffffff);
        screen = 3;
        MealType = 3;
        ChangeScreen();

    }
    public void Lunch(){
        breakfast.setBackgroundColor(0xdd4b92c4);
        Dinner.setBackgroundColor(0xdd4b92c4);
        lunch.setBackgroundColor(0xffffffff);
        snack.setBackgroundColor(0xdd4b92c4);
        screen = 2;
        MealType = 2;
        ChangeScreen();
    }
    public  void dinner(){
        breakfast.setBackgroundColor(0xdd4b92c4);
        Dinner.setBackgroundColor(0xffffffff);
        lunch.setBackgroundColor(0xdd4b92c4);
        snack.setBackgroundColor(0xdd4b92c4);
        screen = 4;
        MealType = 4;
        ChangeScreen();
    }
    public  void Breakfast(){
        breakfast.setBackgroundColor(0xffffffff);
        Dinner.setBackgroundColor(0xdd4b92c4);
        lunch.setBackgroundColor(0xdd4b92c4);
        snack.setBackgroundColor(0xdd4b92c4);
        screen = 1;
        MealType = 1;
        ChangeScreen();
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
    public void ChangeScreen(){
        if (screen == 1)
        {
            item1.setText("1 Toast with 2 scrambled Eggs");
            item2.setText("Fresh Fruit Plate");
            item3.setText("Farina with walnuts and apples");
            item4.setText("Oatmeal with blueberries");
        }
        else if (screen == 2)
        {
            item1.setText("Jicama-Avocado Salad");
            item2.setText("Sweet Potato % Roasted red Pepper Bisque");
            item3.setText("Zucchini Cashew Soup");
            item4.setText("Microgreen Salad");
        }
        else if (screen == 3)
        {
            item1.setText("1 Hard-Boiled Egg");
            item2.setText("Cup of Fruit");
            item3.setText("3 Celery Stalks with Almond Butter");
            item4.setText("1/2 cup cooked Quinoa with Avocado");
        }
        else if (screen == 4)
        {
            item1.setText("Asian Stir Fry");
            item2.setText("Southwestern Veggie Taco");
            item3.setText("Baked Tempeh");
            item4.setText("Baked Sweet Potato");
        }

    }
    public void GotoItemsRecipe(){
        Intent intent = new Intent(this,RecipeView.class);
        TextView mealtype = findViewById(R.id.mealTypeNum);
        mealtype.setText("" + MealType);

        TextView mealnum = findViewById(R.id.foodItemNum);
        mealnum.setText("" + ItemNum);

        MealType = Integer.parseInt(mealtype.getText().toString());
        ItemNum = Integer.parseInt(mealnum.getText().toString());

        intent.putExtra(MEAL_TYPE,MealType);
        intent.putExtra(MEAL_NUMBER,ItemNum);

        startActivity(intent);
    }
}
