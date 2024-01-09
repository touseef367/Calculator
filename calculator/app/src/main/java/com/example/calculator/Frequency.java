package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Frequency extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button button;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frequency);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        button=(Button)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double velocity=Integer.parseInt(num1.getText().toString());
                double wavelength=Integer.parseInt(num2.getText().toString());
                double frequency=velocity/wavelength;
                result.setText("Frequency=:  "+ String.valueOf(frequency)+" Hz");



            }
        });
    }
}