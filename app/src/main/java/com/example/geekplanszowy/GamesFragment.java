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

public class GamesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String[] genreNames = {
                "Eurogry",
                "Ameritrashe",
                "Hybrydy",
                "Gry dla Dzieci",
                "Gry Imprezowe",
                "Gry Ekonomiczne",
                "Gry Kooperacyjne",
                "Gry Rodzinne",
                "Gry Wojenne",
                "Gry Strategiczne"
        };
        View view = inflater.inflate(R.layout.fragment_games, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listview);
        ListAdapter myadapter = new ArrayAdapter<String>(
                getContext(),
                R.layout.listlayout,
                genreNames
        ); // ?
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Eurogry.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Ameritrashe.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Hybrydy.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getActivity(), GryDlaDzieci.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Imprezowe.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Ekonomiczne.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Kooperacyjne.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Rodzinne.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Wojenne.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getActivity(), Strategiczne.class);
                    startActivity(intent);
                }

            }
        });
        return view;
    }
}


