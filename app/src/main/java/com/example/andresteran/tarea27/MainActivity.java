package com.example.andresteran.tarea27;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            }
    public void onCreateView(View view){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

}
