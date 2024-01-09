package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class Calculator extends AppCompatActivity {
    ImageView btn_one, btn_two, btn_three, btn_four, btn_five, btn_six;
    ImageView btn_seven, btn_eight, btn_nine, btn_ten;
    ImageView btn_plus, btn_minus, btn_multiply, btn_divide, btn_equal;
    ImageView btn_rp, btn_lp, btn_dot, btn_ac, btn_zero, btn_next;
    TextView inputtext, output;
    String data;
    float input1=0,input2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        inputtext = findViewById(R.id.inputtext);
        output = findViewById(R.id.output);

        btn_zero = findViewById(R.id.btn_zero);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);

        btn_equal = findViewById(R.id.btn_equal);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_rp = findViewById(R.id.btn_rp);
        btn_lp = findViewById(R.id.btn_lp);
        btn_dot = findViewById(R.id.btn_dot);
        btn_ac = findViewById(R.id.btn_ac);
        btn_next = findViewById(R.id.btn_next);

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "0");


            }

        });
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "1");


            }

        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "2");


            }

        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "3");


            }

        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "4");


            }

        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "5");


            }

        });
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "6");


            }

        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "7");


            }

        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "8");


            }

        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "9");


            }

        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                input1 = Float.parseFloat(inputtext.getText() + "");
                inputtext.setText(data + "+");

                //  btn_plus=true;
            }

        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                input1 = Float.parseFloat(inputtext.getText() + "");
                inputtext.setText(data + "-");
                //  btn_minus=true;

            }

        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                input1 = Float.parseFloat(inputtext.getText() + "");
                inputtext.setText(data + "x");
                //   btn_multiply=true;

            }

        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                input1 = Float.parseFloat(inputtext.getText() + "");
                inputtext.setText(data + "/");
                //  btn_divide=true;

            }

        });

        btn_rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + ")");


            }

        });
        btn_lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data + "(");


            }

        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText("");
                output.setText("");
            }

        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                inputtext.setText(data+".");

            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputtext.getText().toString();
                Toast.makeText(Calculator.this, ""+data, Toast.LENGTH_SHORT).show();
                data=data.replaceAll("x","*");
                data = data.replaceAll("%", "(?/100)*?");
                Context rhino=Context.enter();

                rhino.setOptimizationLevel(-1);
                String finalresult="";
                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalresult = rhino.evaluateString(scriptable, data, "Javssccript", 1, null).toString();
                }catch (Exception e) {
                    finalresult="Error";
                }

                output.setText(finalresult);


            }
        });}

}