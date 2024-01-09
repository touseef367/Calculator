package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pressure extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button button;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pressure);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        button=(Button)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double force=Integer.parseInt(num1.getText().toString());
                double area=Integer.parseInt(num2.getText().toString());
                double pressure=force/area;
                result.setText("pressure=:  "+ String.valueOf(pressure)+" pascal");



            }
        });
    }
}