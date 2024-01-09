package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ManueActivity extends AppCompatActivity {
    ImageView density,force,power,weight,pressure,ke,freq,dtof,voltage,velocity,btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manue);
        density=findViewById(R.id.density);
        force=findViewById(R.id.force);
        power =findViewById(R.id.power);
        weight=findViewById(R.id.weight);
        pressure=findViewById(R.id.pressure);
        ke=findViewById(R.id.ke);
        freq=findViewById(R.id.freq);
        dtof=findViewById(R.id.dtof);
        voltage=findViewById(R.id.voltage);
        velocity=findViewById(R.id.velosity);
        btn_next=findViewById(R.id.btn_next);

        density.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dens();
            }
        });
        force.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forc ();
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pow ();
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wight ();
            }
        });
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presure ();
            }
        });
        ke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ken();
            }
        });
        dtof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dtofr ();
            }
        });
        voltage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volt ();
            }
        });
        velocity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vel ();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //data = inputtext.getText().toString();
                activity2();

            }
        });

    }
    public void dens()
    {
        Intent intent=new Intent(this, Density.class);
        startActivity(intent);
    }
    public void forc()
    {
        Intent intent=new Intent(this, Force.class);
        startActivity(intent);
    }
    public void pow()
    {
        Intent intent=new Intent(this, Power.class);
        startActivity(intent);
    }
    public void wight()
    {
        Intent intent=new Intent(this, Weight.class);
        startActivity(intent);
    }
    public void presure()
    {
        Intent intent=new Intent(this, Pressure.class);
        startActivity(intent);
    }
    public void ken()
    {
        Intent intent=new Intent(this, KineticEnergy.class);
        startActivity(intent);
    }
    public void dtofr()
    {
        Intent intent=new Intent(this, DegreetoF.class);
        startActivity(intent);
    }
    public void volt()
    {
        Intent intent=new Intent(this, Voltage.class);
        startActivity(intent);
    }
    public void vel()
    {
        Intent intent=new Intent(this, Velocity.class);
        startActivity(intent);
    }
    public void activity2()
    {
        Intent intent=new Intent(this, Calculator.class);
        startActivity(intent);
    }
}