package com.example.studentmarksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Studentinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentinfo);
        EditText et1 =(EditText) findViewById(R.id.et1);
        EditText et2 =(EditText) findViewById(R.id.et2);
        EditText et3 =(EditText) findViewById(R.id.et3);
        EditText et4 =(EditText) findViewById(R.id.et4);


        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv3=(TextView) findViewById(R.id.tv3);
                Intent in =getIntent();
                tv3.setText("Press Next to Continue");


                Toast.makeText(getApplicationContext(),"SuccessFul",Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=et1.getText().toString();
                String b=et2.getText().toString();
                String c=et4.getText().toString();
                Intent intent=new Intent(Studentinfo.this,FourthActivity.class);
                intent.putExtra("NAME",a);
                intent.putExtra("ROLL",b);
                intent.putExtra("SEC",c);

                startActivity(intent);
            }
        });


    }
}