package com.example.geekplanszowy;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Cluedo extends AppCompatActivity implements View.OnClickListener{

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXTT = "CluedoUlubione";

    private boolean ulubioneCluedo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluedo);
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.ulubioneCluedo) {
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            ulubioneCluedo = sharedPreferences.getBoolean(TEXTT, false);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            if(ulubioneCluedo) {
                editor.putBoolean(TEXTT, false);
            }
            else
                editor.putBoolean(TEXTT, true);
            editor.apply();
            Toast.makeText(this, "Dodano ❤", Toast.LENGTH_SHORT).show();
        }
    }
}