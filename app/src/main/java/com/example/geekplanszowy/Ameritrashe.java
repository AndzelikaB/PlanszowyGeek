package com.example.geekplanszowy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Ameritrashe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ameritrashe);


        String[] titleNames = {
                "Wojna o pierścień",
                "Horror w arkham",
                "Dracula trzecia edycja",
                "Warhammer 40000 Zakazane gwiazdy",
                "Robinson Crusoe",
                "Talisman magia i miecze",
                "Posiadłość szaleństwa",
                "Runebound",
                "1989: Jesień narodów",
                "Battlestar galactica",
                "Martwa zima",
                "Alchemicy",
                "Terraformacja Marsa"
        };

        ListView listView = findViewById(R.id.listview2);
        ListAdapter myadapter = new ArrayAdapter<>(this, R.layout.listlayout, titleNames); // ?
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(Ameritrashe.this,Wojnaopierscien_a.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(Ameritrashe.this,Cluedo.class);
                    startActivity(intent);
                }

            }
        });
    }
}