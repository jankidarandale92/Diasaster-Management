package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        ImageView emailIcon1 = findViewById(R.id.email_icon1);
        emailIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:jankidarandale92@gmail.com"));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });
        ImageView contactIcon1 = findViewById(R.id.contact_icon1);
        contactIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "8766660665";
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(dialIntent);
            }
        });
        ImageView emailIcon2 = findViewById(R.id.email_icon2);
        emailIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:shravanilokhande45@gmail.com"));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });
        ImageView contactIcon2 = findViewById(R.id.contact_icon2);
        contactIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "7020085704";
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(dialIntent);
            }
        });
        ImageView emailIcon3 = findViewById(R.id.email_icon3);
        emailIcon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:devkidarandale01@gmail.com"));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });
        ImageView contactIcon3 = findViewById(R.id.contact_icon3);
        contactIcon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "8999825189";
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(dialIntent);
            }
        });


    }
}