package com.asis.classroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.asis.classroom.arithematic.Arithematic;

public class SimpleInterest extends AppCompatActivity implements View.OnClickListener {

    EditText principal, rate, time;
    Button calculate;
    int p, t, r, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        principal = findViewById(R.id.principal);
        rate = findViewById(R.id.rate);
        time = findViewById(R.id.time);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(this);

//        calculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                p = Integer.parseInt(principal.getText().toString());
//                t = Integer.parseInt(time.getText().toString());
//                r = Integer.parseInt(rate.getText().toString());
//
//                result = (p * t * r) / 100;
//
//                Toast.makeText(SimpleInterest.this, "Simple Interest is " + result, Toast.LENGTH_LONG).show();
//
//            }
//        });

    }

    @Override
    public void onClick(View v) {

//        if(TextUtils.isEmpty())

        p = Integer.parseInt(principal.getText().toString());
        t = Integer.parseInt(time.getText().toString());
        r = Integer.parseInt(rate.getText().toString());
        switch (v.getId()) {
            case R.id.calculate:
                Arithematic arithematic = new Arithematic(p, t, r);
                result = arithematic.si();
                Toast.makeText(this, "The result is" + result, Toast.LENGTH_LONG).show();

                break;
        }
    }
}
