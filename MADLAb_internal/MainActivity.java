package com.example.aluminiportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr=((EditText) findViewById(R.id.user)).getText().toString();
                String pass=((EditText) findViewById(R.id.pass)).getText().toString();
                if(usr.equals("admin") && pass.equals("admin")){
                    Intent i = new Intent(getApplicationContext(),reg.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}