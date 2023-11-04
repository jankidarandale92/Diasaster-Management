package com.example.disastermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.disastermanagement.Earth_effects;
import com.example.disastermanagement.Earth_history;
import com.example.disastermanagement.Earth_recent;
import com.example.disastermanagement.R;
import com.google.android.material.navigation.NavigationView;

public class D_Articles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darticles);

        TextView E_history, E_recent, E_effects;

        E_history=findViewById(R.id.E_history);
        E_recent=findViewById(R.id.E_recent);
        E_effects=findViewById(R.id.E_effects);


        E_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent37=new Intent(D_Articles.this, Earth_history.class);
                startActivity(intent37);
            }
        });

        E_recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent38=new Intent(D_Articles.this, Earth_recent.class);
                startActivity(intent38);
            }
        });
        E_effects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent39=new Intent(D_Articles.this, Earth_effects.class);
                startActivity(intent39);
            }
        });


    }
}