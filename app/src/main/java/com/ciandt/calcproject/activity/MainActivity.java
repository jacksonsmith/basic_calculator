package com.ciandt.calcproject.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ciandt.calcproject.R;
import com.ciandt.calcproject.method.Algebric;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){

        screen = (TextView) findViewById(R.id.screen);
        Button erraser;
        Button number7;
        Button number8;
        Button number9;
        Button operatorSplit;
        Button number4;
        Button number5;
        Button number6;
        Button operatorMutiply;
        Button number1;
        Button number2;
        Button number3;
        Button operatorMinus;
        Button operatorDot;
        Button number0;
        Button operatorEquals;
        Button operatorSum;

        erraser = (Button) findViewById(R.id.erraser);
        number7 = (Button) findViewById(R.id.number7);
        number8 = (Button) findViewById(R.id.number8);
        number9 = (Button) findViewById(R.id.number9);
        operatorSplit = (Button) findViewById(R.id.operatorSplit);
        number4 = (Button) findViewById(R.id.number4);
        number5 = (Button) findViewById(R.id.number5);
        number6 = (Button) findViewById(R.id.number6);
        operatorMutiply = (Button) findViewById(R.id.operatorMutiply);
        number1 = (Button) findViewById(R.id.number1);
        number2 = (Button) findViewById(R.id.number2);
        number3 = (Button) findViewById(R.id.number3);
        operatorMinus = (Button) findViewById(R.id.operatorMinus);
        operatorDot = (Button) findViewById(R.id.operatorDot);
        number0 = (Button) findViewById(R.id.number0);
        operatorEquals = (Button) findViewById(R.id.operatorEquals);
        operatorSum = (Button) findViewById(R.id.operatorSum);

        erraser.setOnClickListener(this);
        number7.setOnClickListener(this);
        number8.setOnClickListener(this);
        number9.setOnClickListener(this);
        operatorSplit.setOnClickListener(this);
        number4.setOnClickListener(this);
        number5.setOnClickListener(this);
        number6.setOnClickListener(this);
        operatorMutiply.setOnClickListener(this);
        number1.setOnClickListener(this);
        number2.setOnClickListener(this);
        number3.setOnClickListener(this);
        operatorMinus.setOnClickListener(this);
        operatorDot.setOnClickListener(this);
        number0.setOnClickListener(this);
        operatorEquals.setOnClickListener(this);
        number0.setOnClickListener(this);
        operatorSum.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch(id){

           case R.id.number0 : writeOnScreen(view);
               break;
            case R.id.number1 : writeOnScreen(view);
                break;
            case R.id.number2 : writeOnScreen(view);
                break;
            case R.id.number3 : writeOnScreen(view);
                break;
            case R.id.number4 : writeOnScreen(view);
                break;
            case R.id.number5 : writeOnScreen(view);
                break;
            case R.id.number6 : writeOnScreen(view);
                break;
            case R.id.number7 : writeOnScreen(view);
                break;
            case R.id.number8 : writeOnScreen(view);
                break;
            case R.id.number9 : writeOnScreen(view);
                break;
            case R.id.operatorSum : writeOnScreen(view);
                break;
            case R.id.operatorMinus : writeOnScreen(view);
                break;
            case R.id.operatorSplit : writeOnScreen(view);
                break;
            case R.id.operatorMutiply : writeOnScreen(view);
                break;
            case R.id.erraser : erraserScreen();
                break;
            case R.id.operatorEquals : calculate();
                break;

       }

    }

    public void writeOnScreen(View view){

        String oldText = screen.getText().toString();

        switch (view.getId()){

            case R.id.number0 : screen.setText(String.format(oldText+"%s",0));
                break;
            case R.id.number1 :  screen.setText(String.format(oldText+"%s",1));
                break;
            case R.id.number2 :  screen.setText(String.format(oldText+"%s",2));
                break;
            case R.id.number3 :  screen.setText(String.format(oldText+"%s",3));
                break;
            case R.id.number4 :  screen.setText(String.format(oldText+"%s",4));
                break;
            case R.id.number5 :  screen.setText(String.format(oldText+"%s",5));
                break;
            case R.id.number6 :  screen.setText(String.format(oldText+"%s",6));
                break;
            case R.id.number7 :  screen.setText(String.format(oldText+"%s",7));
                break;
            case R.id.number8 :  screen.setText(String.format(oldText+"%s",8));
                break;
            case R.id.number9 :  screen.setText(String.format(oldText+"%s",9));
                break;
            case R.id.operatorSum : screen.setText(String.format(oldText+"%s",'+'));
                break;
            case R.id.operatorMinus : screen.setText(String.format(oldText+"%s",'-'));
                break;
            case R.id.operatorMutiply : screen.setText(String.format(oldText+"%s",'*'));
                break;
            case R.id.operatorSplit : screen.setText(String.format(oldText+"%s",'/'));
                break;
            case R.id.operatorDot : screen.setText(String.format(oldText+"%s",'.'));
                break;
        }

    }

    public void erraserScreen(){

        String text = screen.getText().toString();

        if(text.length() > 0)
        text = text.substring(0,text.length() - 1);

        screen.setText(text);

    }

    public void calculate(){
        String text = screen.getText().toString();

        Algebric algebric = new Algebric();

        screen.setText(algebric.expressionCalculation(text));
    }
}
