package com.example.geekplanszowy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pionek extends AppCompatActivity implements View.OnClickListener{
    private Button launch_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pionek);

    }
    String lokalizacja1 = "google.navigation:q=MOSiR,+ul.+Jana+Matejki+6+Zabrze,+Polska&mode=d";

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Trasa!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(lokalizacja1));
        intent.setPackage("com.google.android.apps.maps");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void Kalendarz(View view) {
        Toast.makeText(this, "Kalendarz!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplication(), Kalendarz.class);
        startActivity(intent);
    }

}
