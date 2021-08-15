package com.example.geekplanszowy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EventFragment extends Fragment {
    ImageView kiermasz, pionek, spodek, turniej;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_location, container, false);

       kiermasz = view.findViewById(R.id.kiermasz);
       pionek = view.findViewById(R.id.pionek);
       spodek = view.findViewById(R.id.spodek);
       turniej = view.findViewById(R.id.turniej);

        kiermasz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), KiermaszGier.class);
                startActivity(intent);
            }
        });

        pionek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Pionek.class);
                startActivity(intent);
            }
        });

        spodek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planszowkiwspodku.class);
                startActivity(intent);
            }
        });
        turniej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChampionsCup.class);
                startActivity(intent);
            }
        });

        return view;
    }

}