package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoDontActivity extends AppCompatActivity {

    TextView textView;
    TextView d1;
    TextView d2;
    TextView d3;
    TextView d4;
    TextView d5;
    TextView d6;
    TextView d7;
    TextView d8;
    TextView d9;
    TextView d10;
    TextView d11;
    TextView d12;
    TextView d13;
    TextView d14;
    TextView d15;
    TextView d16;
    TextView d17;
    TextView d18;
    TextView d19;
    TextView d20;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_dont2);

        textView=findViewById(R.id.textView);
        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d4=findViewById(R.id.d4);
        d5=findViewById(R.id.d5);
        d6=findViewById(R.id.d6);
        d7=findViewById(R.id.d7);
        d8=findViewById(R.id.d8);
        d9=findViewById(R.id.d9);
        d10=findViewById(R.id.d10);
        d11=findViewById(R.id.d11);
        d12=findViewById(R.id.d12);
        d13=findViewById(R.id.d13);
        d14=findViewById(R.id.d14);
        d15=findViewById(R.id.d15);
        d16=findViewById(R.id.d16);
        d17=findViewById(R.id.d17);
        d18=findViewById(R.id.d18);
        d19=findViewById(R.id.d19);
        d20=findViewById(R.id.d20);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(DoDontActivity.this, Earthquake.class);
                startActivity(intent1);
            }
        });


        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(DoDontActivity.this, Tsumani.class);
                startActivity(intent2);
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(DoDontActivity.this, Cyclone.class);
                startActivity(intent3);
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(DoDontActivity.this, famine.class);
                startActivity(intent4);
            }
        });

        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(DoDontActivity.this, Forestfire.class);
                startActivity(intent5);
            }
        });

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(DoDontActivity.this, Flood.class);
                startActivity(intent6);
            }
        });

        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(DoDontActivity.this, Landslide.class);
                startActivity(intent7);
            }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(DoDontActivity.this, Hailstorm.class);
                startActivity(intent8);
            }
        });

        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(DoDontActivity.this, Volcano.class);
                startActivity(intent9);
            }
        });

        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(DoDontActivity.this, Drought.class);
                startActivity(intent10);
            }
        });

        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11=new Intent(DoDontActivity.this, Hurricane.class);
                startActivity(intent11);
            }
        });

        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12=new Intent(DoDontActivity.this, Sansstorm.class);
                startActivity(intent12);
            }
        });

        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(DoDontActivity.this, Snowstorm.class);
                startActivity(intent13);
            }
        });

        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14=new Intent(DoDontActivity.this, Tornado.class);
                startActivity(intent14);
            }
        });

        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15=new Intent(DoDontActivity.this, Bomb.class);
                startActivity(intent15);
            }
        });

        d16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16=new Intent(DoDontActivity.this, Buidcollapse.class);
                startActivity(intent16);
            }
        });

        d17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17=new Intent(DoDontActivity.this, Chemical.class);
                startActivity(intent17);
            }
        });

        d18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18=new Intent(DoDontActivity.this, Fire.class);
                startActivity(intent18);
            }
        });

        d19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19=new Intent(DoDontActivity.this, Nuclear.class);
                startActivity(intent19);
            }
        });

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent20=new Intent(DoDontActivity.this, Terrorist.class);
                startActivity(intent20);
            }
        });
    }
}