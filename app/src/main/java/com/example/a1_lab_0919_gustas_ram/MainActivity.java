package com.example.a1_lab_0919_gustas_ram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.btnTextChange);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText("Mygtukas yra paspaustas");
            }
        });
    }
}