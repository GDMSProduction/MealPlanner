package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecipeView extends AppCompatActivity {

    private Button Back ;
    public TextView Recipe;

    int meal = 1;
    int itemNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_view);

        //writeRecipe();

        Recipe = findViewById(R.id.RecipeForItem);


        Intent intent = getIntent();
        meal = intent.getIntExtra(RecipePage.MEAL_TYPE,1);
        itemNum = intent.getIntExtra(RecipePage.MEAL_NUMBER, 1);

        writeRecipe();


        Back = (Button) findViewById(R.id.BackToView2);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BacktoView();
            }
        });


    }

    public void BacktoView(){
        Intent intent = new Intent(this,RecipePage.class);
        startActivity(intent);
    }
    public void writeRecipe(){
        if (meal == 1) //breakfast
        {
            if (itemNum == 1)
            {
                Recipe.setText("eggs");
            }
            else if (itemNum == 2)
            {

            }
            else if (itemNum == 3)
            {

            }
            else if (itemNum == 4)
            {

            }
        }
        else if (meal == 2) //lunch
        {
            if (itemNum == 1)
            {
                Recipe.setText("Jicama-Avocado Salad (1 serving)" +
                        "\n\n Ingredients \n" +
                        "1/2 tsp. Himalayan Salt\n" +
                        "1 Tbsp. pure maple syrup\n" +
                        "2 Tbsp. fresh lime juice\n" +
                        "1 & 1/2 tsp. extra virgin olive oil\n" +
                        "1/2 medium jicame, peeled, cut intomatchstick-sized pieces\n" +
                        "2 Tbsp. chopped fresh cilantro\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Combine salt, maple syrup, lime juice and oil in a small bowl\n" +
                        "2. Combine Avocado, jicama and cilantro in another bowl (medium sized)\n" +
                        "3. Drizzle dressing and toss lightly\n" +
                        "4. Cover tightly and let marinate in fridge for 1 hour or longer before eating"
                        );
            }
            else if (itemNum == 2)
            {

            }
            else if (itemNum == 3)
            {

            }
            else if (itemNum == 4)
            {

            }
        }
        else if (meal == 3) //snack
        {
            if (itemNum == 1)
            {
                Recipe.setText("eggs");
            }
            else if (itemNum == 2)
            {

            }
            else if (itemNum == 3)
            {

            }
            else if (itemNum == 4)
            {

            }
        }
        else if (meal == 4) //dinner
        {
            if (itemNum == 1)
            {
                Recipe.setText("Asian Stir Fry (1 serving)" +
                        "\n\n Ingredients \n" +
                        "1 Tbsp. extra-virgin coconut oil\n" +
                        "2 cloves of garlic, chopped\n" +
                        "1 Tbsp. rated fresh ginger \n" +
                        "1/2 medium carrot, cut into thin diagonal slices\n" +
                        "1/2 cup broccoli florets\n" +
                        "1/4 medium red bell pepper, sliced\n" +
                        "1 small head bok choy, chopped into bite sized chunks\n" +
                        "1 & 1/2 tsp. sesame oil\n" +
                        "1 Tbsp. Bragg liquid aminos\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Heat cocnut oil in large skillet or wok, high heat\n" +
                        "2. Add garlic ginger, and a carrot, cook and stir for 1 minute\n" +
                        "3. add broccoli stir for 5 minutes frequently\n" +
                        "4. ADD bell pepper and bok choy and reduce the heat to medium\n" +
                        "5. cook for about 3 minutes until is tender/crisp \n" +
                        "6.turn heat off and then mix in sesame oil and braggs liquid aminos (mix well)");
            }
            else if (itemNum == 2)
            {
                Recipe.setText("Southwestern Veggie Taco (1 serving)" +
                        "\n\n Ingredients \n" +
                        "1/4 medium avocado, mashed\n" +
                        "2 Tbsp. fresh pico de gallo (salsa)\n" +
                        "1 & 1/4 cup black beans and rice \n" +
                        "1/4 cup of cooked corn kernels\n" +
                        "1(6-inch) corn tortilla\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Combine mashed avocado and fresh salsa in bowl and mix\n" +
                        "2. Place black beans and rice and corn one half of tortilla and then fold\n" +
                        "3. Serve with the mixture of salsa and avocado \n");

            }
            else if (itemNum == 3)
            {

            }
            else if (itemNum == 4)
            {

            }

        }

    }
}
