package com.example.geekplanszowy;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class Rodzinne extends AppCompatActivity {
    Button b_sort;

    ArrayList<String> listaGatunkow = new ArrayList<>();
    ArrayAdapter<String> listViewAdapter;

    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rodzinne);

        ListView listView = findViewById(R.id.listview2);
        utworzListeGatunkow();

        listViewAdapter = new ArrayAdapter<String>(Rodzinne.this, R.layout.listlayout, listaGatunkow);
        listView.setAdapter(listViewAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                otworzGatunek(position);
            }
        });
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.sortmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.sort1){
            Toast.makeText(Rodzinne.this, "Sortowanie A-Z", Toast.LENGTH_SHORT).show();
            Collections.sort(listaGatunkow, Collator.getInstance(new Locale("pl", "PL")));
            listViewAdapter.notifyDataSetChanged();
        }
        if(id == R.id.sort2){
            Toast.makeText(Rodzinne.this, "Sortowanie Z-A", Toast.LENGTH_SHORT).show();
            Collections.reverse(listaGatunkow);
            listViewAdapter.notifyDataSetChanged();
        }
        return super.onOptionsItemSelected(item);
    }


    public void utworzListeGatunkow(){
        listaGatunkow.clear();
        listaGatunkow.add("Catan");
        listaGatunkow.add("Cluedo");
        listaGatunkow.add("Splendor");
        listaGatunkow.add("7 Cudów Świata");
        listaGatunkow.add("Tokenako");
        listaGatunkow.add("Kupcy z osaki");
        listaGatunkow.add("Carcassonne");
    }

    public void otworzGatunek(int pozycja){
        String position = listaGatunkow.get(pozycja);
        if (position.equals("Catan")) {
            Intent intent = new Intent(Rodzinne.this,Catan.class);
            startActivity(intent);
        }
        else if (position.equals("Cluedo")) {
            Intent intent = new Intent(Rodzinne.this,Cluedo.class);
            startActivity(intent);
        }
        else if (position.equals("Splendor")) {
            Intent intent = new Intent(Rodzinne.this,E_splendor.class);
            startActivity(intent);
        }
        else if (position.equals("7 Cudów Świata")) {
            Intent intent = new Intent(Rodzinne.this,E_7Cudow_swiata.class);
            startActivity(intent);
        }
        else if (position.equals("Tokenako")) {
            Intent intent = new Intent(Rodzinne.this,E_Takenoko.class);
            startActivity(intent);
        }
        else if (position.equals("Kupcy z osaki")) {
            Intent intent = new Intent(Rodzinne.this,E_Kupcy_z_osaki.class);
            startActivity(intent);
        }
        else if (position.equals("Carcassonne")) {
            Intent intent = new Intent(Rodzinne.this,E_Carcassonne.class);
            startActivity(intent);
        }
    }
}



