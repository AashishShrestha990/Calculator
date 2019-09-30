package com.asis.classroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorWgui extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btnadd, btnsub, btndiv,
            btnmul, btnpoint, btnequals;
    EditText display;

    int mValueOne, mValueTwo;

    boolean Add, Sub, Mul, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_wgui);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnpoint = findViewById(R.id.btnpoint);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnequals = findViewById(R.id.btnequals);

        display = findViewById(R.id.display);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValueOne = Integer.parseInt(display.getText() + "");
                    Add = true;
                    display.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValueOne = Integer.parseInt(display.getText() + "");
                    Sub = true;
                    display.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValueOne = Integer.parseInt(display.getText() + "");
                    Mul = true;
                    display.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValueOne = Integer.parseInt(display.getText() + "");
                    Div = true;
                    display.setText(null);
                }
            }
        });


        btnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Integer.parseInt(display.getText() + "");

                if (Add == true) {
                    display.setText(mValueOne + mValueTwo + "");
                    Add = false;
                }

                if (Sub == true) {
                    display.setText(mValueOne - mValueTwo + "");
                    Sub = false;
                }

                if (Mul == true) {
                    display.setText(mValueOne * mValueTwo + "");
                    Mul = false;
                }

                if (Div == true) {
                    display.setText(mValueOne / mValueTwo + "");
                    Div = false;
                }
            }
        });


    }
}

