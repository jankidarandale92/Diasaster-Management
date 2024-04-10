package com.example.disastermanagement;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Donate2 extends AppCompatActivity {

    EditText edit1, edit2, edit5;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate2);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit5 = findViewById(R.id.edit5);
        b2 = findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput1 = edit1.getText().toString().trim();
                String userInput2 = edit2.getText().toString().trim();
                String userInput5 = edit5.getText().toString().trim();

                if (userInput1.isEmpty() || userInput2.isEmpty() || userInput5.isEmpty()) {
                    Toast.makeText(Donate2.this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Launch Paytm using implicit intent
                    Intent Donate2 = new Intent(Donate2.this,Donate3.class);
                    startActivity(Donate2);
                }
            }
        });
    }
}
