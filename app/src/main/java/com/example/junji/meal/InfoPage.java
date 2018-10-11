package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoPage extends AppCompatActivity {

    private Button signout;
    private Button home;
    private Button calender;
    private Button recipe;
    private Button backArr;
    private Button nextArr;
    private TextView tab1;
    private TextView tab2;
    public int tabNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
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


        recipe = (Button) findViewById(R.id.recipebutton);
        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRecipePage();
            }
        });

        backArr = (Button) findViewById(R.id.backArrow);
        backArr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChangeInfoTab();
            }
        });
        nextArr = (Button) findViewById(R.id.nextArrow);
        nextArr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChangeInfoTab();
            }
        });

        tab1 = (TextView) findViewById(R.id.InfoTab1);
        tab2 = (TextView) findViewById(R.id.InfoTab2);



    }
    public  void OpenMainPage(){
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
     public void OpenHomePage(){
         Intent intent = new Intent(this,HomePage.class);
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
    public void ChangeInfoTab(){
        if (tabNum  == 1)
        {
            tab1.setVisibility(View.INVISIBLE);
            tab2.setVisibility(View.VISIBLE);
            tabNum = 2;
        }
        else if (tabNum == 2)
        {
            tab1.setVisibility(View.VISIBLE);
            tab2.setVisibility(View.INVISIBLE);
            tabNum = 1;
        }


    }
}
