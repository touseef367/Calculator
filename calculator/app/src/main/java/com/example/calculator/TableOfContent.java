package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TableOfContent extends AppCompatActivity {
    Button btncal,btnformulae,speech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_content);
        btncal=findViewById(R.id.btncal);
        btnformulae=findViewById(R.id.btnformula);
        speech=findViewById(R.id.speech);



        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal();
            }
        });
        btnformulae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulae ();
            }
        });


        speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speechtext();
            }
        });
        btnformulae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulae ();
            }
        });


    }
    public void cal()
    {
        Intent intent=new Intent(this, Calculator.class);
        startActivity(intent);
    }
    public void formulae()
    {
        Intent intent=new Intent(this, ManueActivity.class);
        startActivity(intent);
    }
    public void speechtext()
    {
        Intent intent=new Intent(this, SpeechToText.class);
        startActivity(intent);
    }


}