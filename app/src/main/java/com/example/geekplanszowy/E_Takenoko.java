package com.example.geekplanszowy;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class E_Takenoko extends AppCompatActivity implements View.OnClickListener{

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "TakenokoUlubione";

    private boolean ulubione2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e__takenoko);
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.ulubione2) {
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            ulubione2 = sharedPreferences.getBoolean(TEXT, false);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            if(ulubione2) {
                editor.putBoolean(TEXT, false);
                Toast.makeText(this, "Usunięto", Toast.LENGTH_SHORT).show();
                //  ulubione.setBackgroundResource(R.drawable.button_circle);

            }
            else {
                editor.putBoolean(TEXT, true);
                Toast.makeText(this, "Dodano ❤", Toast.LENGTH_SHORT).show();

            }
            editor.apply();
        }
    }
}