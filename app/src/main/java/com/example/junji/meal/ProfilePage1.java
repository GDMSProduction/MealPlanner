package com.example.junji.meal;

import android.content.Intent;
import android.database.CursorJoiner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class ProfilePage1 extends AppCompatActivity {

    private Button Calorie;
    private Button Home ;
    private Button click;
    private int result;
   private TextView week1;
    private TextView week2;
    private TextView week3;
    private TextView LastWeight;
    public int x;
    public int y;
    public int z;
    public int a;
    public int b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page1);
        Calorie = findViewById(R.id.CalorieButton);
        Calorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCaloriePage();
            }
        });
        Home = findViewById(R.id.home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenHomePage();
            }
        });
        LastWeight = findViewById(R.id.WeightResult);

        click = findViewById(R.id.Weightresultclick);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result();
            }
        });

        week1 = findViewById(R.id.WeightWeek1);
        week2 = findViewById(R.id.WeightWeek2);
        week3 = findViewById(R.id.WeightWeek3);
        if(week1.getText().toString().isEmpty()){
            week1.setText("0");
        }
        if(week2.getText().toString().isEmpty()){
            week2.setText("0");
        }
        if(week3.getText().toString().isEmpty()){
            week3.setText("0");
        }

        x = Integer.parseInt( week1.getText().toString());
         y = Integer.parseInt( week2.getText().toString());
         z = Integer.parseInt( week3.getText().toString());


             a = x - y;
             b =  y - z;
             result = a+b;

             LastWeight.setText("Weight Lost: "+ result);



    }
    public void OpenCaloriePage(){
        Intent intent = new Intent(this,ProfilePage2.class);
        startActivity(intent);
    }
    public void OpenHomePage(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }

    public void Result(){
        x = Integer.parseInt( week1.getText().toString());
        y = Integer.parseInt( week2.getText().toString());
        z = Integer.parseInt( week3.getText().toString());

        a = x - y;
        b =  y - z;
        result = a+b;

        LastWeight.setText("Weight Lost: "+ result);
    }
}
