package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Donate extends AppCompatActivity {
    EditText edit1, edit2,edit5;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit5 = findViewById(R.id.edit5);

        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput1 = edit1.getText().toString().trim();
                String userInput2 = edit2.getText().toString().trim();
                String userInput5 = edit5.getText().toString().trim();


                if (userInput1.isEmpty()) {
                    // Show toast when EditText is empty
                    Toast.makeText(Donate.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                } else if(userInput2.isEmpty()) {
                    Toast.makeText(Donate.this, "Please enter account no.", Toast.LENGTH_SHORT).show();
                }
                else if(userInput5.isEmpty()) {
                    Toast.makeText(Donate.this, "Please enter ammount ", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent Donate1 = new Intent(Donate.this,Donate2.class);
                    startActivity(Donate1);
                }


            }

        });
    }
}