package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfilePage2 extends AppCompatActivity {
    private Button Weight;
    private Button Home ;
    private Button click;

    private int result;
    private TextView week1;
    private TextView week2;
    private TextView week3;
    private TextView total;
    public int cal1;
    public  int cal2;
    public int cal3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page2);
        Weight = findViewById(R.id.WeightButton);
        Weight.setOnClickListener(new View.OnClickListener() {
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
        click = findViewById(R.id.Weightresultclick2);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultss();
            }
        });

        total = findViewById(R.id.WeightResult);

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

        cal1 = Integer.parseInt( week1.getText().toString());
        cal2 = Integer.parseInt( week2.getText().toString());
        cal3 = Integer.parseInt( week3.getText().toString());


        result = cal1 + cal2 + cal3;

        total.setText("Cal Consumed: "+ 0);
    }
    public void OpenCaloriePage(){
        Intent intent = new Intent(this,ProfilePage1.class);
        startActivity(intent);
    }
    public void OpenHomePage(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
    public void Resultss(){
        cal1 = Integer.parseInt( week1.getText().toString());
        cal2 = Integer.parseInt( week2.getText().toString());
        cal3 = Integer.parseInt( week3.getText().toString());


        result = cal1 + cal2 + cal3;

        total.setText("Cal Consumed: "+ result);
    }

}
