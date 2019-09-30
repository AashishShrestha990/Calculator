package com.asis.classroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    EditText first, second;
    Button add, sub;
    int firstnum, secondnum, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        first = findViewById(R.id.num1);
        second = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Integer.parseInt(first.getText().toString());
                secondnum = Integer.parseInt(second.getText().toString());

                result = firstnum + secondnum;

                Toast.makeText(Calculator.this, "Sum is " + result, Toast.LENGTH_LONG).show();

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Integer.parseInt(first.getText().toString());
                secondnum = Integer.parseInt(second.getText().toString());

                result = firstnum - secondnum;

                Toast.makeText(Calculator.this, "difference is " + result, Toast.LENGTH_LONG).show();

            }
        });

    }
}
