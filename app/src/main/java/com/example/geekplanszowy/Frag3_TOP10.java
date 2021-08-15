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
public class Frag3_TOP10 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag3, container, false);

        String[] titleNames = {
                "1. Divinity",
                "2. Phoenix Point",
                "3. Kroniki zbrodni",
                "4. Cyberpunk 2077",
                "5. Baldur’s Gate III",
                "6. Posiadłości Szaleństwa",
                "7. Alchemicy",
                "8. Detektyw",
                "9. Civilization VI",
                "10. Imperium",
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