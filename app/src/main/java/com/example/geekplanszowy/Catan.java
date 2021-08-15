package com.example.geekplanszowy;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Catan extends AppCompatActivity implements View.OnClickListener{

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "CatanUlubione";

    private boolean ulubione22;
    Button ulubione;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catan);
        ulubione = (Button) findViewById(R.id.ulubione);
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.ulubione) {
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            ulubione22 = sharedPreferences.getBoolean(TEXT, false);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            if(ulubione22) {
                editor.putBoolean(TEXT, false);
                Toast.makeText(this, "Usunięto", Toast.LENGTH_SHORT).show();
               //ulubione.setBackgroundResource(R.drawable.button_circle_red);

            }
            else {
                editor.putBoolean(TEXT, true);
                Toast.makeText(this, "Dodano ❤", Toast.LENGTH_SHORT).show();
                //ulubione.setVisibility(View.INVISIBLE);
            }
            editor.apply();
        }
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        if(sharedPreferences.getBoolean(TEXT, false) == true){
            ulubione.setBackgroundResource(R.drawable.button_circle);
          //  ulubione.setDrawable(R.drawable.favorite);
        }
        else{
            ulubione.setBackgroundResource(R.drawable.button_circle_red);

        }
    }
}