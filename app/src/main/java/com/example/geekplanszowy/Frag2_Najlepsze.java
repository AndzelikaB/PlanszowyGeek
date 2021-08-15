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
import android.widget.ListView;

public class Frag2_Najlepsze extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        String[] titleNames = {
                "Wojna o pierścień",
                "Horror w arkham",
                "Dracula trzecia edycja",
                "Warhammer 40000",
                "Robinson Crusoe",
                "Talisman magia i miecze",
                "Posiadłość szaleństwa",
                "Runebound",
                "Kakao",
                "Pogoda",
                "Drako"
        };

        ListView listView = (ListView) view.findViewById(R.id.listview);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getActivity(), R.layout.toplista, titleNames);

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), KiermaszGier.class);

                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getActivity(), KiermaszGier.class);
                    startActivity(intent);
                }

            }
        });
        return view;
    }
}