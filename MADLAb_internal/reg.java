package com.example.aluminiportal;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class reg extends AppCompatActivity {
ActionBarDrawerToggle ab;
DrawerLayout dl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        dl = (DrawerLayout) findViewById(R.id.dl);
        ab = new ActionBarDrawerToggle(this, dl, R.string.nav_open, R.string.nav_close);
        dl.addDrawerListener(ab);
        ab.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = ((EditText) findViewById(R.id.fn)).getText().toString();
                String lname = ((EditText) findViewById(R.id.ln)).getText().toString();
                String job = ((EditText) findViewById(R.id.job)).getText().toString();
                String pyear = ((EditText) findViewById(R.id.pas)).getText().toString();
                String cname = ((EditText) findViewById(R.id.cn)).getText().toString();
                if (fname.equals("") || lname.equals("") || job.equals("") || pyear.equals("") || cname.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter all details", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "All Details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(ab.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}