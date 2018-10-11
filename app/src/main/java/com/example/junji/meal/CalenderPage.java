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
