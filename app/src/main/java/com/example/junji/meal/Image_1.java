package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Image_1 extends AppCompatActivity {

    private Button Back ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_1);
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
        startActivity(intent);    }
}
