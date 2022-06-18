package com.example.studentmarksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        TextView t1=(TextView) findViewById(R.id.t1);
        TextView t2=(TextView) findViewById(R.id.t2);
        TextView t3=(TextView) findViewById(R.id.t3);

        Button but=(Button) findViewById(R.id.but);

        Intent in=getIntent();
        String p =in.getStringExtra("NAME");
        String q=in.getStringExtra("ROLL");
        String r=in.getStringExtra("SEC");

        t1.setText("Hey!!Welcome " +p);
        t2.setText("ROLL:" +q);
        t3.setText("Section: "+r);

        Toast.makeText(getApplicationContext(),"Welcome "+p,Toast.LENGTH_LONG).show();

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this,CalculationActivity.class);
                startActivity(intent);
            }
        });
    }
}