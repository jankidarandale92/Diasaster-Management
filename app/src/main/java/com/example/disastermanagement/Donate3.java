package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Donate3 extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate3);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                String selectedPaymentMethod = radioButton.getText().toString();

                // Handle selection using if ladder
                if (selectedPaymentMethod.equals("Paytm")) {
                    // Perform actions for Paytm
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=net.one97.paytm")) ;
                    startActivity(intent) ;
                } else if (selectedPaymentMethod.equals("Google Pay")) {
                    // Perform actions for Google Pay
                    Intent googlePayIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.nbu.paisa.user"));
                    startActivity(googlePayIntent);
                } else if (selectedPaymentMethod.equals("PhonePe")) {
                    // Perform actions for PhonePe
                    Intent phonePeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.phonepe.app"));
                    startActivity(phonePeIntent);
                } else if (selectedPaymentMethod.equals("BHIM")) {
                    // Perform actions for BHIM
                    Intent bhimIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=in.org.npci.upiapp"));
                    startActivity(bhimIntent);                }
            }
        });
    }
}