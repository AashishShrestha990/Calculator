package com.asis.classroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.asis.classroom.arithematic.Arithematic;
import com.asis.classroom.arithematic.Percent;

public class Percentage extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    EditText num1;
    EditText num2;
    EditText num3;
    Button calculate;
    TextView display;
    int x, y, z, result;
    String name1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);

        name = findViewById(R.id.name);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        EditText edt = findViewById(R.id.name);
        EditText edt1 = findViewById(R.id.num1);
        EditText edt2 = findViewById(R.id.num2);
        EditText edt3 = findViewById(R.id.num3);
        TextView txt= findViewById(R.id.display);

        name1 = name.getText().toString();

        x = Integer.parseInt(num1.getText().toString());
        y = Integer.parseInt(num2.getText().toString());
        z = Integer.parseInt(num3.getText().toString());
        switch (v.getId()) {
            case R.id.calculate:
                Percent percent = new Percent(x, y, z);
                result = percent.P();
                txt.append("   Name: " + name1+"      Percent: "+result+"\n");
                edt.setText("");
                edt1.setText("");
                edt2.setText("");
                edt3.setText("");
                break;
        }
    }
}
