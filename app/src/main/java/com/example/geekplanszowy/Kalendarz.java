package com.example.geekplanszowy;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Kalendarz extends AppCompatActivity {
    EditText title;
    EditText location;
    EditText description;
    Button addEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendarz);
        title = findViewById(R.id.etTitle);
        location = findViewById(R.id.etLocation);
        description = findViewById(R.id.etDescription);
        addEvent = findViewById(R.id.btnAdd);

        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!title.getText().toString().isEmpty() && !location.getText().toString().isEmpty() && !description.getText().toString().isEmpty()) {
                    Intent intent = new Intent(Intent.ACTION_INSERT);
                    intent.setData(CalendarContract.Events.CONTENT_URI);
                    intent.putExtra(CalendarContract.Events.TITLE, title.getText().toString());
                    intent.putExtra(CalendarContract.Events.EVENT_LOCATION, location.getText().toString());
                    intent.putExtra(CalendarContract.Events.DESCRIPTION, description.getText().toString());
                    intent.putExtra(CalendarContract.Events.ALL_DAY, true);
                    intent.putExtra(Intent.EXTRA_EMAIL, "ala@gmail.com, ola@gmail.com, inga@yahoo.com");

                    if(intent.resolveActivity(getPackageManager()) != null){
                        startActivity(intent);
                    }else{
                        Toast.makeText(Kalendarz.this, "Upss..coś poszło nie tak", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(Kalendarz.this, "Uzupełnij wszystkie pola",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}