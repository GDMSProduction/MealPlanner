package com.example.junji.meal;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalenderPage extends AppCompatActivity {

    private Button signout;
    private Button home;
    private Button info;
    private Button recipe;
    private CalendarView mcalendarView;

    public String Date;
    public String StartDay = "0";
    private TextView Currentday;

    private TextView startday;
    private int Maxday;
    private int week1day1;
    private int week1day2;

    private int Dateday;
    private int Datemonth;
    private int Dateyear;
    public String week1 = "Breakfast: " +
            "\n-1 toast and 2 scrambled eggs" +
            "\n OR" +
            "\n-Fruit Plate" +
            "\n\nLunch: " +
            "\n-Miso Soup" +
            "\n OR" +
            "\n-Greek Salad" +
            "\n\nSnack: " +
            "\n-1 Boiled Egg" +
            "\n OR" +
            "\n-Cup of Fruit" +
            "\n\nDinner: " +
            "\n-Baked Salmon South Western veggie tacos" +
            "\n OR" +
            "\n-Stir Fried Veggies";

    public String week2 = "Breakfast: " +
            "\n-Oatmeal with apples" +
            "\n OR" +
            "\n-Fresh Fruit Plate" +
            "\n\nLunch: " +
            "\n-Zucchini cashew soup" +
            "\n OR" +
            "\n-Microgreen salad" +
            "\n\nSnack: " +
            "\n-cup of blueberries with a green apple" +
            "\n OR" +
            "\n-3 celery stalks with almond butter" +
            "\n\nDinner: " +
            "\n-Baked Tempeh" +
            "\n OR" +
            "\n-Baked Sweet Potato";

    public String week3 = "Breakfast: " +
            "\n-Farina with walnuts and an apple" +
            "\n OR" +
            "\n-Fresh Fruit Plate" +
            "\n\nLunch: " +
            "\n-Jicama-Avocado salad" +
            "\n OR" +
            "\n-sweet potato & roasted red pepper bisque" +
            "\n\nSnack: " +
            "\n-boiled egg with whole grain crackers" +
            "\n OR" +
            "\n-1/2 cup cooked quinoa with avocado" +
            "\n\nDinner: " +
            "\n-Asian stir fry" +
            "\n OR" +
            "\n-Southwestern veggie taco";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_page);
        //TextView Textscroll = findViewById(R.id.Textscroll) ;
        //Textscroll.setMovementMethod(new ScrollingMovementMethod());


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

        startday = findViewById(R.id.starttext);
        Currentday = findViewById(R.id.Currentday);
        StartDay =2018+"/"+10+"/"+8;
        startday.setText("Start Day: "+StartDay);
        mcalendarView = (CalendarView) findViewById(R.id.calendarView);
        mcalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView calendarView, int year, int month, int dayOfMonth) {
                month = month+1;
                Date = year+"/"+month+"/"+dayOfMonth;
                if(StartDay =="2018/10/8"){
                    Dateyear = 2018;
                    Datemonth = 10;
                    Dateday = 8;
                    StartDay =Dateyear+"/"+Datemonth+"/"+Dateday;
                    Calendar calendar = Calendar.getInstance();
                    int lastDate = calendar.getActualMaximum(Calendar.DATE);
                    Maxday = lastDate;
                  //  Maxday = calendar.getMaximum(calendar.DAY_OF_MONTH);
                    startday.setText("Start Day: "+StartDay);

                }
                 if(month == Datemonth){
                    if(dayOfMonth - Dateday <=6 && dayOfMonth - Dateday >=0){
                        OpenWeek1();;
                    }

                    if(dayOfMonth - Dateday <=13 && dayOfMonth - Dateday >=7){
                        OpenWeek2();;
                    }
                    if(dayOfMonth - Dateday <=20 && dayOfMonth - Dateday >=14){
                        OpenWeek3();;
                    }

                }
                 if(month  == Datemonth+1){


                    if((Maxday+dayOfMonth) - Dateday <=6 && (Maxday+dayOfMonth) - Dateday >=0){
                            OpenWeek1();;
                    }

                    if((Maxday+dayOfMonth )- Dateday <=13 && (Maxday+dayOfMonth )- Dateday >=7){
                        OpenWeek2();;
                    }
                    if((Maxday+dayOfMonth) - Dateday <=20 && (Maxday+dayOfMonth) - Dateday >=14){
                        OpenWeek3();;
                    }
                }



               // System.out.println("First Day Of Month : " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
               // System.out.println("Last Day of Month  : " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

              // startdaytext.setText("Last Day of Month  : " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
                //  startdaytext.setText("Start day:" + Date);

               // if()
            }
        });


        String date_d = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date());

        Currentday.setText("Current day:"+date_d);

        //TextView calendarList = findViewById(R.id.Textscroll);
        //calendarList.setText(week1);

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
    public void OpenCalender(){
        Intent intent = new Intent(this,Calenderdecision.class);
        startActivity(intent);
    }

    public  void OpenWeek1(){
        Intent intent = new Intent(this,Week1_Meal.class);
        startActivity(intent);
    }
    public  void OpenWeek2(){
        Intent intent = new Intent(this,Week2_Meal.class);
        startActivity(intent);
    }
    public  void OpenWeek3(){
        Intent intent = new Intent(this,Week3_Meal.class);
        startActivity(intent);
    }

}
