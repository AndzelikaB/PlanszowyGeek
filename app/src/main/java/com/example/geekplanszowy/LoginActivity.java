package com.example.geekplanszowy;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button btnlogin;
    DBHelper DB;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsignin1);
        DB = new DBHelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("") || pass.equals(""))
                    Toast.makeText(LoginActivity.this,"Uzupełnij wszystkie pola!", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true){
                        Toast.makeText(LoginActivity.this,"Zalogowano!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplication(), HomeActivity.class);

                       // Intent intent = new Intent(getApplication(),HomeActivity.class);
                        // Intent intent = new Intent(getApplicationContext(),HomeActivity.class);

                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity.this,"Niepoprawne dane!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }



}