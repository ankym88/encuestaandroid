package com.example.dell.cuestionarioandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    public void cargar2 (View view) {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
