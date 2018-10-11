package com.example.junji.meal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainPage extends AppCompatActivity {


    private Button loginbutton;
    private Button signupbutton;

    private  static ImageView imageview;  // picture
    private  static ImageButton upbutton; // up button
    private static  ImageButton downbutton; // down button
    private int currentimage = 0; // current image number
    int[] images = {R.drawable.foodprepideas,R.drawable.image1,R.drawable.image3}; // different image

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        loginbutton = (Button) findViewById(R.id.LogInButton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenLogIn();
            }
        });
        signupbutton = (Button) findViewById(R.id.SignUpButton);
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSignUp();
            }
        });

        buttonclick();

    }
    public void buttonclick()
    {
        imageview = findViewById(R.id.ChangeImage);
        upbutton = findViewById(R.id.UpImage);
        downbutton = findViewById(R.id.DownImage);
        upbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentimage++;
                currentimage = currentimage% images.length;
                imageview.setImageResource(images[currentimage]);
            }
        });
        downbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentimage--;
                if(currentimage < 0){
                    currentimage = images.length-1;
                }
                else{
                    currentimage = currentimage% images.length;
                }

                imageview.setImageResource(images[currentimage]);
            }
        });

    }

    public void OpenLogIn(){
        Intent intent = new Intent(this,LogInPage.class);
        startActivity(intent);
    }
    public void OpenSignUp(){
        Intent intent = new Intent(this,SignUpPage.class);
        startActivity(intent);
    }

}
