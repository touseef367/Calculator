package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Density extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button button;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.density);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        button=(Button)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mass=Integer.parseInt(num1.getText().toString());
                int volume=Integer.parseInt(num2.getText().toString());
                int density=mass+volume;
                result.setText("Density=:  "+ String.valueOf(density)+" kg/m^3");



            }
        });
    }
}