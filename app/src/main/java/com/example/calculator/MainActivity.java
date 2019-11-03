package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String editTedtInput = "";
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        et = findViewById(R.id.et);
        Button id1 = findViewById(R.id.id1);
        Button id2 = findViewById(R.id.id2);
        Button id3 = findViewById(R.id.id3);
        Button id4 = findViewById(R.id.id4);
        Button id5 = findViewById(R.id.id5);
        Button id6 = findViewById(R.id.id6);
        Button id7 = findViewById(R.id.id7);
        Button id8 = findViewById(R.id.id8);
        Button id9 = findViewById(R.id.id9);
        Button id0 = findViewById(R.id.id0);
        Button divide = findViewById(R.id.divide);
        Button multiply = findViewById(R.id.multiply);
        Button sub = findViewById(R.id.sub);
        Button add = findViewById(R.id.add);
        Button point = findViewById(R.id.point);
        Button equals = findViewById(R.id.equals);

        Button clear = findViewById(R.id.c);
        id0.setOnClickListener(this);
        id1.setOnClickListener(this);
        id2.setOnClickListener(this);
        id3.setOnClickListener(this);
        id4.setOnClickListener(this);
        id5.setOnClickListener(this);
        id6.setOnClickListener(this);
        id7.setOnClickListener(this);
        id8.setOnClickListener(this);
        id9.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);
        point.setOnClickListener(this);
        equals.setOnClickListener(this);
        clear.setOnClickListener(this);

    }

    //long long int  a,b;
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.id0:
                Button button = (Button) view;
                editTedtInput = editTedtInput + button.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id1:
                Button button1 = (Button) view;
                editTedtInput = editTedtInput + button1.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id2:
                Button button2 = (Button) view;
                editTedtInput = editTedtInput + button2.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id3:
                Button button3 = (Button) view;
                editTedtInput = editTedtInput + button3.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id4:
                Button button4 = (Button) view;
                editTedtInput = editTedtInput + button4.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id5:
                Button button5 = (Button) view;
                editTedtInput = editTedtInput + button5.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id6:
                Button button6 = (Button) view;
                editTedtInput = editTedtInput + button6.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id7:
                Button button7 = (Button) view;
                editTedtInput = editTedtInput + button7.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id8:
                Button button8 = (Button) view;
                editTedtInput = editTedtInput + button8.getText();
                et.setText(editTedtInput);
                break;
            case R.id.id9:
                Button button9 = (Button) view;
                editTedtInput = editTedtInput + button9.getText();
                et.setText(editTedtInput);
                break;
            case R.id.divide:
                
                Button buttondivide = (Button) view;
                editTedtInput = editTedtInput + buttondivide.getText();
                et.setText(editTedtInput);
                break;
            case R.id.sub:
                Button buttonsub = (Button) view;
                editTedtInput = editTedtInput + buttonsub.getText();
                et.setText(editTedtInput);
                break;
            case R.id.multiply:
                Button buttonmultiply = (Button) view;
                editTedtInput = editTedtInput + buttonmultiply.getText();
                et.setText(editTedtInput);
                break;
            case R.id.add:
                Button buttonadd = (Button) view;
                editTedtInput = editTedtInput + buttonadd.getText();
                et.setText(editTedtInput);
                break;
            case R.id.point:
                Button buttonpoint = (Button) view;
                editTedtInput = editTedtInput + buttonpoint.getText();
                et.setText(editTedtInput);
                break;
            case R.id.equals:


                // editTedtInput = editTedtInput + butt.getText();
                et.setText(evaluate(et.getText().toString()));
                break;
            case R.id.c:
                editTedtInput="";
                et.getText().clear();
                break;
        }

    }

    String evaluate(String exp) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("rhino");

        try {
            double result = (double)scriptEngine.eval(exp);
            return String.valueOf(result);
        }catch (Exception e) {
        }
        return "";
    }
}
