package com.example.studentmarksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculationActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

         et1 =(EditText) findViewById(R.id.edit1);
         et2 =(EditText) findViewById(R.id.edit2);
         et3 =(EditText) findViewById(R.id.edit3);
         et4 =(EditText) findViewById(R.id.edit4);
         et5 =(EditText) findViewById(R.id.edit5);

         et7 =(EditText) findViewById(R.id.edit7);

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                markscalculate();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });



    }

    public void markscalculate() {

        int mid,quiz,fnl,ttl;
        double avg;
        String grade;

        mid = Integer.parseInt(et2.getText().toString());
        quiz = Integer.parseInt(et3.getText().toString());
        fnl = Integer.parseInt(et4.getText().toString());

        ttl= mid+quiz+fnl;

        et5.setText(String.valueOf(ttl));

       if(ttl >= 80)
       {
           et7.setText("A+");
           Toast.makeText(getApplicationContext(),"Outstanding",Toast.LENGTH_LONG).show();
       }
       else if(ttl>=75)
       {
           et7.setText("A");
           Toast.makeText(getApplicationContext(),"Excellent",Toast.LENGTH_LONG).show();

       }
       else if(ttl>=70)
       {
           et7.setText("A-");
           Toast.makeText(getApplicationContext(),"Very Good",Toast.LENGTH_LONG).show();

       }
       else if(ttl>=65)
       {
           et7.setText("B+");
           Toast.makeText(getApplicationContext(),"Good",Toast.LENGTH_LONG).show();

       }
       else if(ttl>=60)
       {
           et7.setText("B");
           Toast.makeText(getApplicationContext(),"Satisfactory",Toast.LENGTH_LONG).show();

       }
       else if(ttl>=55)
       {
           et7.setText("B-");
           Toast.makeText(getApplicationContext(),"Above Average",Toast.LENGTH_LONG).show();

       }
       else if(ttl>=50)

       {
           et7.setText("C+");
           Toast.makeText(getApplicationContext(),"Average",Toast.LENGTH_LONG).show();

       }
       else if(ttl>=45)
       {
           et7.setText("C");
           Toast.makeText(getApplicationContext(),"Below Average",Toast.LENGTH_LONG).show();

       }
       else if(ttl>=40)

       {
           et7.setText("D");
           Toast.makeText(getApplicationContext(),"Pass",Toast.LENGTH_LONG).show();

       }
       else
       {
           et7.setText("F");
           Toast.makeText(getApplicationContext(),"Fail",Toast.LENGTH_LONG).show();

       }




    }

    public  void clear()
    {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
        et7.setText("");

        et1.requestFocus();

    }
}