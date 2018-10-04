package com.example.marcf.mealprep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpPage extends AppCompatActivity {
  private Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        backbutton = (Button) findViewById(R.id.SignUptoStartbut);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStartApp();
            }
        });
    }

        public void openStartApp()
        {
            Intent intent = new Intent(this, StartApp.class);
            startActivity(intent);
        }

}
