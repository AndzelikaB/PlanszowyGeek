package com.example.geekplanszowy;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;

public class Hybrydy extends AppCompatActivity {

    Button b_sort;

    ArrayAdapter myadapter;
    private String[] titleNames= new String[]{ "Catan",
            "Cluedo",
            "Splendor",
            "7 Cudów Świata",
            "Takenoko",
            "Kupcy z osaki",
            "Carcassonne",
            "Wsiąść do Pociągu",
            "Patchwork",
            "Kakao",
            "Pogoda",
            "Drako"};


    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hybrydy);

        ListView listView = findViewById(R.id.listview2);

        myadapter = new ArrayAdapter<String>(this, R.layout.listlayout, titleNames);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(Hybrydy.this,Catan.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(Hybrydy.this,Cluedo.class);
                    startActivity(intent);
                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.sortmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.sort1){
            Arrays.sort(titleNames);
            myadapter.notifyDataSetChanged();
        }else if (id == R.id.sort2){
            Arrays.sort(titleNames, Collections.reverseOrder());
            myadapter.notifyDataSetChanged();
        }
        return true;
    }

}