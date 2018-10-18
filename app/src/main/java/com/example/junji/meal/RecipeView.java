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
                Recipe.setText("eggs" +
                        "\n\n Ingredients \n" +
                        "1 piece of whole grain bread\n" +
                        "2 eggs\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Put piece of bread in toaster and cook to your liking\n" +
                        "2. crack both eggs into bowl and stir them \n" +
                        "3. Turn stove on between medium and high heat and insert eggs\n" +
                        "4. flip eggs to cook on both sides for around 2-3 minutes or until cooked to your liking");
            }
            else if (itemNum == 2)
            {
                Recipe.setText("Fresh Fruit Plate" +
                "\n\n Recipe/Ingredients\n\n" +
                "1. Get any fruit and slice them up into medium bowl");
            }
            else if (itemNum == 3)
            {
                Recipe.setText("Farina with walnuts and apples, and maple syrup" +
                        "\n\n Ingredients \n" +
                        "1/4 cup of water\n" +
                        "3 Tbsp. farina cereal\n" +
                        "1/3 medium green apple, diced\n" +
                        "3 Tbsp. chopped walnuts\n" +
                        "1 Tbsp. pure maple syrup\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Boil water in medium pot on medium heat\n" +
                        "2. Add farina and cook/ stir for 4 to 5 minutes \n" +
                        "3. Remove from heat\n" +
                        "4. Put faina in small bowl and top with apple, walnuts, and maple syrup");
            }
            else if (itemNum == 4)
            {
                Recipe.setText("Oatmeal with blueberries" +
                        "\n\n Ingredients \n" +
                        "1 cup of water\n" +
                        "1 pinch of himalayan salt\n" +
                        "1/2 cup old-fashioned rolled oats\n" +
                        "1 cup of fresh blueberries\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Bring water and salt to boil in medium pot on medium heat\n" +
                        "2. Add oats, cook and stir frequently for 5 minutes\n" +
                        "3. Remove from heat\n" +
                        "4. Place oatmeal in small boat and top with blueberries"
                );


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
                Recipe.setText("Sweet Potato % Roasted red Pepper Bisque ( 1 serving )\n" +
                                "\n\n Ingredients \n" +
                    "1 cup of water\n" +
                    "1 medium sweet potato\n" +
                    "1/4 medium red bell pepper\n" +
                    "1 & 1/2 tsp. extra virgin olive oil\n" +
                    "1 tsp. finely grated ginger root\n" +
                    "2 Tsp. miso paste, .ixed with 2 Tbsp. hot water\n" +
                    "1 cup vegetable broth (or water) Bragg Liquid Aminos \n" +
                    "Herbal seasoning blend\n" +
                    "\n" +
                    "Recipe\n" +
                    "1. Combine salt, maple syrup, lime juice and oil in a small bowl\n" +
                    "2. Combine Avocado, jicama and cilantro in another bowl (medium sized)\n" +
                    "3. Drizzle dressing and toss lightly\n" +
                    "4. Cover tightly and let marinate in fridge for 1 hour or longer before eating"
                        );
            }
            else if (itemNum == 3)
            {
                Recipe.setText("Zucchini Cashew Soup ( 1 serving )" +
                        "\n\n Ingredients \n" +
                        "1 oz raw cashews (18 cashews)\n" +
                        "1 & 1/2 cups of water\n" +
                        "1 & 1/2 medium zucchini, cut into chunks\n" +
                        "Himalayan salt\n" +
                        "Herbal seasoningBlend\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Soak cashews in 1/2 cup of water for 1 hour\n" +
                        "2. While cashews are soaking, use remaining 1 cup of water to boil in small saucepan while on medium heat\n" +
                        "3. Add zucchini and cook for 4 to 5 minutes and then drain and set aside\n" +
                        "4. Place cashews, zucchini, salt, and seasoning blend in a blender or food processor in two to more batches if needed and blend until smooth" +
                        "5. Heat soup in medium saucepan on medium heat whole stirring for 4 to 5 minutes ( Do not boil and soup can be served cold)"
                );
            }
            else if (itemNum == 4)
            {
                Recipe.setText("Microgreen Salad" +
                        "\n\n Ingredients \n" +
                        "3 cups of baby salad green\n" +
                        "1/4 of medium carrotm shredded\n" +
                        "1/2 medium cucumber, chopped\n" +
                        "1/2 medium red bell pepper, sliced\n" +
                        "1/4 cup sprouts (radish,alfalfa, or broccoli)\n" +
                        "1/2 medium tomato, chopped\n" +
                        "1/4 cup chopped jicama\n" +
                        "1 Tbsp, fresh chopped cilantro\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Combine all items in a large bowl and toss to blend \n" +
                        "2. Ready to eat"
                );
            }
        }
        else if (meal == 3) //snack
        {
            if (itemNum == 1)
            {
                Recipe.setText("1 Hard-Boiled Egg" +
                "\n\n Ingredients\n\n" +
                "\n1 cup of water\n"+
                "1 egg\n\n" +
                "Recipe\n" +
                "1. boil 1 cup of water in small pot on high heat\n" +
                "2. put egg inside pot for 10-15 minutes after water boils\n" +
                "3. Remove pot from to stove and then remove egg from pot and peel hard shell from egg (rinse egg with cold water, shell will be hot)");
            }
            else if (itemNum == 2)
            {

                Recipe.setText("Cup of Fruit \n\n" +
                        "Recipe/Ingredients \n\n" +
                        "1. Pick any fruit you would like and chop them into pieces \n"+
                        "2. Take a cup worth of fruit and put in container (that is the snack)"
                );


            }
            else if (itemNum == 3)
            {
                Recipe.setText("3 Celery Stalks with Almond Butter"+
                        "\n\n Ingredients \n" +
                        "3 stalks of celery\n" +
                        "container of almond butter\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Make sure to wash celery in water\n" +
                        "2. Fill container with 1/4 almond butter\n" +
                        "3. Dip celery into butter and eat\n");

            }
            else if (itemNum == 4)
            {
                Recipe.setText("1/2 cup cooked Quinoa with Avocado (4 servings)" +
                        "\n\n Ingredients \n" +
                        "1 cup dry quinoa\n" +
                        "2 cups of cold water\n" +
                        "1/4 of an avocado\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Rinse quinoa and then combine the quinoa with the water in small pot and place on stove with high heat until boil\n" +
                        "2. Reduce heat and keep it boiling gently\n" +
                        "3. cook while pot is covered with lid for 20 to 25 minutes, or until the water is absorbed\n" +
                        "2. Take off of stove and let it sit while still covered for 10 minutes without removing the lid\n" +
                        "2. Fluff with for then serve\n"
                );
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
                Recipe.setText("Baked Tempeh (1 serving)" +
                        "\n\n Ingredients \n" +
                        "2 Tbsp. apple cider vinegar\n" +
                        "2 Tbsp. Bragg Liquid Aminos\n" +
                        "1 & 1/2 tsp. sesame oil \n" +
                        "1 & 1/4 tsp. pure maple syrup\n" +
                        "1/2 clove garlic, chopped\n" +
                        "4 oz. tempeh, cut into 1/2 inch strips\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Combine vinegar, Bragg Liquid Aminos, oil, maple syrup and garlic into small bowl and mix\n" +
                        "2. Place tempeh in a shallow dish, and poor marinade over tempeh\n" +
                        "3. Marinate in fridge for 1 hour, flipping once to get both sides \n" +
                        "4. Preheat oven to 350 degrees Fahrenheit \n" +
                        "5. Bake for 10 to 15 minutes on each side");
            }
            else if (itemNum == 4)
            {
                Recipe.setText("Baked Sweet Potato (1 serving)" +
                        "\n\n Ingredients \n" +
                        "1 medium sweet potato\n" +
                        "1 tsp. olive oil\n" +
                        "1/4 tsp. Himalayan salt \n" +
                        "Herbal seasoning blend (Or if you want you can uses spices of your choice to taste)\n" +
                        "\n" +
                        "Recipe\n" +
                        "1. Preheat oven ot 450 degrees Fahrenheit\n" +
                        "2. Scrub the sweet potato; stab lighly several time with fork to create holes\n" +
                        "3. Place on the center of the tray and bake for 35 to 45 minutes\n" +
                        "4. Remove from oven and cut a 1 & 1/2 inch cross in the center of potato\n" +
                        "5. Season with oil and salt (seasoning blend also, if you want to)\n");
            }

        }

    }
}
