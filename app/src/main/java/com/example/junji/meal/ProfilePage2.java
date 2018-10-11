package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfilePage2 extends AppCompatActivity {
    private Button Weight;
    private Button Home ;
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
    }
    public void OpenCaloriePage(){
        Intent intent = new Intent(this,ProfilePage1.class);
        startActivity(intent);
    }
    public void OpenHomePage(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
}
