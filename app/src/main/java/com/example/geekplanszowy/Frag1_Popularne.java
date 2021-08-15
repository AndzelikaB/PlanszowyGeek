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


public class Frag1_Popularne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag1,container,false);

        String[] titleNames = {
                "Splendor",
                "Carcassonne",
                "7 Cudów Świata",
                "Takenoko",
                "Kupcy z osaki",
                "Catan",
                "Wsiąść do Pociągu",
                "Patchwork",
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
                    Intent intent = new Intent(getActivity(),E_splendor.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getActivity(),E_Carcassonne.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getActivity(),E_7Cudow_swiata.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getActivity(),E_Takenoko.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getActivity(),E_Kupcy_z_osaki.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getActivity(),Catan.class);
                    startActivity(intent);
                }
            
            }
        });
        return view;
    }

}