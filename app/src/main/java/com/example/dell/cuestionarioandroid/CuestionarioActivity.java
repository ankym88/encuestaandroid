package com.example.dell.cuestionarioandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CuestionarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);



    }

    public void volverprincipal (View view) {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}
