package com.example.geekplanszowy;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

    public class Wojnaopierscien_a extends AppCompatActivity implements View.OnClickListener {

        public static final String SHARED_PREFS = "sharedPrefs";
        public static final String TEXTW = "WojnaopierscienUlubione";

        private boolean ulubioneWojnaopierscien;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_wojnaopierscien_a);
        }

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.ulubioneWojnaopierscien) {
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                ulubioneWojnaopierscien = sharedPreferences.getBoolean(TEXTW, false);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if (ulubioneWojnaopierscien) {
                    editor.putBoolean(TEXTW, false);
                } else
                    editor.putBoolean(TEXTW, true);
                editor.apply();
                Toast.makeText(this, "Dodano ❤", Toast.LENGTH_SHORT).show();
            }
        }
    }
