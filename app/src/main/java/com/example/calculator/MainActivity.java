package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       bt1=(Button) findViewById(R.id.add);
       bt2=(Button) findViewById(R.id.sub);
       bt3=(Button) findViewById(R.id.mul);
       bt4=(Button) findViewById(R.id.div);


       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent ob=new Intent(getApplicationContext(),Addition.class);
               startActivity(ob);
           }
       });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob=new Intent(getApplicationContext(),Subtraction.class);
                startActivity(ob);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob=new Intent(getApplicationContext(),Multiplication.class);
                startActivity(ob);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob=new Intent(getApplicationContext(),Multiplication.class);
                startActivity(ob);
            }
        });

    }
}