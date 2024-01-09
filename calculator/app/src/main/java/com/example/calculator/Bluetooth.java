package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button onbutton,offbutton;
    BluetoothAdapter myBluetoothAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        onbutton=findViewById(R.id.onbutton);
        offbutton=findViewById(R.id.offbutton);
        myBluetoothAdaptor=BluetoothAdapter.checkBluetoothAddress();
        Bluetoothonfunction(){

        }

    }

    private void Bluetoothonfunction() {
        onbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myBluetoothAdaptor==null){
                    Toast.makeText(getApplicationContext(),"Bluetooth not found")
                }
                else
                {
                    if(!myBluetoothAdaptor.isEnabled())
                    {
                        startActivityForResult();
                    }
                }
            }
        });
    }
}