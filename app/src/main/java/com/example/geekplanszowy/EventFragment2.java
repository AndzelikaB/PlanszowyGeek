package com.example.geekplanszowy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class EventFragment2 extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_event_fragment2,container,false);

        String[] titleNames = {
                "Kiermasz gier planszowych \nLudiversum, ul. Św Jana 20 \n30 Maj 2021, Katowice",
                "Pionek \nHala, ul. kwiatków 20 \n02 Sierpień 2021, Zabrze",
                "Planszówki w spodku \nSpodek, ul. drzewek 32 \n05 Wrzesień 2021, Katowice",
                "Terraforming Mars Champions\nMałopolskie, Warszawa\n 30 Grudzień 2021 "
        };

        ListView listView = (ListView) view.findViewById(R.id.listview);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getActivity(), R.layout.locationlayout, titleNames);

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), KiermaszGier.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Pionek.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Planszowkiwspodku.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getActivity(), ChampionsCup.class);
                    startActivity(intent);
                }

            }
        });
        return view;
    }

}