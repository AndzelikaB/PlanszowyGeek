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
import android.widget.ListView;

import static android.content.Context.MODE_PRIVATE;

public class FavouriteFragment extends Fragment {

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "CatanUlubione";
    public static final String TEXTT = "CluedoUlubione";
    public static final String TEXTW = "WojnaopierscienUlubione";
    public static final String TEXT7 = "SplendorUlubione";
    public static final String TEXT1 = "7CudowSwiataUlubione";
    public static final String TEXT2 = "TakenokoUlubione";
    public static final String TEXT3 = "Kupcy_z_osakiUlubione";
    public static final String TEXT4 = "CarcassonneUlubione";


    private boolean UlubioneCatan, UlubioneCluedo, UlubioneWojnaopierscien, UlubioneSplendor, Ulubione7CudowSwiata, UlubioneTakenoko, UlubioneKupcy_z_osaki, UlubioneCarcassonne;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_favourite,container,false);

        String[] ulubioneGry = new String [10];
        int i = 0;

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        UlubioneCatan = sharedPreferences.getBoolean(TEXT, false);
        UlubioneCluedo = sharedPreferences.getBoolean(TEXTT, false);
        UlubioneWojnaopierscien = sharedPreferences.getBoolean(TEXTW, false);
        UlubioneSplendor = sharedPreferences.getBoolean(TEXT7, false);
        Ulubione7CudowSwiata = sharedPreferences.getBoolean(TEXT1, false);
        UlubioneTakenoko = sharedPreferences.getBoolean(TEXT2, false);
        UlubioneKupcy_z_osaki = sharedPreferences.getBoolean(TEXT3, false);
        UlubioneCarcassonne = sharedPreferences.getBoolean(TEXT4, false);


        ulubioneGry[0] = "Brak ulubionych gier";
        ulubioneGry[1] = " ";
        ulubioneGry[2] = " ";
        ulubioneGry[3] = " ";
        ulubioneGry[4] = " ";
        ulubioneGry[5] = " ";
        ulubioneGry[6] = " ";
        ulubioneGry[7] = " ";
        ulubioneGry[8] = " ";
        ulubioneGry[9] = " ";

        if(UlubioneCatan){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier") {
                    ulubioneGry[i] = "Catan";
                    i = 0;
                    break;
                }
                i++;
            }
        }
        if(UlubioneCluedo){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier") {
                    ulubioneGry[i] = "Cluedo";
                    i = 0;
                    break;
                }
                i++;
            }
        }
        if(UlubioneWojnaopierscien){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier") {
                    ulubioneGry[i] = "Wojna o pierścień";
                    i = 0;
                    break;
                }
                i++;
            }
        }
        if(UlubioneSplendor){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier") {
                    ulubioneGry[i] = "Splendor";
                    i = 0;
                    break;
                }
                i++;
            }
        }
        if(Ulubione7CudowSwiata){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier" ) {
                    ulubioneGry[i] = "7 Cudów Świata";
                    i = 0;
                    break;
                }
                i++;
            }
        }
        if(UlubioneTakenoko){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier") {
                    ulubioneGry[i] = "Takenoko";
                    i = 0;
                    break;
                }
                i++;
            }
        }if(UlubioneKupcy_z_osaki){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier" ) {
                    ulubioneGry[i] = "Kupcy z osaki";
                    i = 0;
                    break;
                }
                i++;
            }
        }
        if(UlubioneCarcassonne){
            while(i < 10){
                if(ulubioneGry[i] == " " || ulubioneGry[i] == "Brak ulubionych gier") {
                    ulubioneGry[i] = "Carcassonne";
                    i = 0;
                    break;
                }
                i++;
            }
        }



        ListView listView = (ListView) view.findViewById(R.id.listView3);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(getActivity(), R.layout.favlayout, ulubioneGry);

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    Intent intent;
                    if(ulubioneGry[0] == "Catan"){
                        intent = new Intent(getActivity(), Catan.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "Cluedo"){
                        intent = new Intent(getActivity(), Cluedo.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "Wojna o pierścień"){
                        intent = new Intent(getActivity(), Wojnaopierscien_a.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "7 Cudów Świata"){
                        intent = new Intent(getActivity(), E_7Cudow_swiata.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "Splendor"){
                        intent = new Intent(getActivity(), E_splendor.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "7 Cudów Świata"){
                        intent = new Intent(getActivity(), E_7Cudow_swiata.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "Takenoko"){
                        intent = new Intent(getActivity(), E_Takenoko.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "Kupcy z osaki"){
                        intent = new Intent(getActivity(), E_Kupcy_z_osaki.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[0] == "Carcassonne"){
                        intent = new Intent(getActivity(), E_Carcassonne.class);
                        startActivity(intent);
                    }
                }
                if(position == 1){
                    Intent intent;
                    if(ulubioneGry[1] == "Catan"){
                        intent = new Intent(getActivity(), Catan.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[1] == "Cluedo"){
                        intent = new Intent(getActivity(), Cluedo.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[1] == "Wojna o pierścień"){
                        intent = new Intent(getActivity(), Wojnaopierscien_a.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[1] == "Splendor"){
                        intent = new Intent(getActivity(), E_splendor.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[1] == "7 Cudów Świata"){
                        intent = new Intent(getActivity(), E_7Cudow_swiata.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[1] == "Takenoko"){
                        intent = new Intent(getActivity(), E_Takenoko.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[1] == "Kupcy z osaki"){
                        intent = new Intent(getActivity(), E_Kupcy_z_osaki.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[1] == "Carcassonne"){
                        intent = new Intent(getActivity(), E_Carcassonne.class);
                        startActivity(intent);
                    }
                }
                if(position == 2){
                    Intent intent;
                    if(ulubioneGry[2] == "Catan"){
                        intent = new Intent(getActivity(), Catan.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[2] == "Cluedo"){
                        intent = new Intent(getActivity(), Cluedo.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[2] == "Wojna o pierścień"){
                        intent = new Intent(getActivity(), Wojnaopierscien_a.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[2] == "Splendor"){
                        intent = new Intent(getActivity(), E_splendor.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[2] == "7 Cudów Świata"){
                        intent = new Intent(getActivity(), E_7Cudow_swiata.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[2] == "Takenoko"){
                        intent = new Intent(getActivity(), E_Takenoko.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[2] == "Kupcy z osaki"){
                        intent = new Intent(getActivity(), E_Kupcy_z_osaki.class);
                        startActivity(intent);
                    }
                    else if(ulubioneGry[2] == "Carcassonne"){
                        intent = new Intent(getActivity(), E_Carcassonne.class);
                        startActivity(intent);
                    }
                }

            }
        });

        return view;

    }
}
