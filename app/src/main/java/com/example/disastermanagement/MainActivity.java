package com.example.disastermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.disastermanagement.Aboutus;
import com.example.disastermanagement.Alert;
import com.example.disastermanagement.D_Articles;
import com.example.disastermanagement.EmergencyCall;
import com.example.disastermanagement.Helpline;
import com.example.disastermanagement.Location;
import com.example.disastermanagement.R;
import com.example.disastermanagement.SOS;
import com.example.disastermanagement.Share;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity  {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView t1,t2,t3,t4,t5,t6;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView= findViewById(R.id.bottom_nav_view);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationview);
        toolbar=findViewById(R.id.toolbar);

//Dashboard
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id==R.id.b_nav_home){
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(0,0);
                } else if (id==R.id.b_nav_Aboutus) {
                    startActivity(new Intent(getApplicationContext(), Aboutus.class));
                    overridePendingTransition(0,0);

                } else if (id==R.id.b_nav_sos) {
                    startActivity(new Intent(getApplicationContext(), SOS.class));
                    overridePendingTransition(0,0);

                } else if (id==R.id.b_nav_helpline) {
                    startActivity(new Intent(getApplicationContext(), Helpline.class));
                    overridePendingTransition(0,0);

                }
                return false;
            }
        });



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id==R.id.dhome){

                    Intent intent7=new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent7);
                } else if (id==R.id.dlocation) {
                    Intent intent8=new Intent(MainActivity.this, Location.class);
                    startActivity(intent8);

                } else if (id==R.id.dalert) {
                    Intent intent9=new Intent(MainActivity.this, Alert.class);
                    startActivity(intent9);


                } else if (id==R.id.dshare) {
                    Intent intent10=new Intent(MainActivity.this, Share.class);
                    startActivity(intent10);
                }
                else if (id==R.id.daboutUs) {
                    Intent intent10=new Intent(MainActivity.this, Aboutus.class);
                    startActivity(intent10);
                }

                return true;
            }
        });
        drawerLayout.closeDrawer(GravityCompat.START);



//Dashboard intents
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, D_Articles.class);
                startActivity(Dash2);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, D_Articles.class);
                startActivity(Dash2);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, SafetyTipActivity.class);
                startActivity(Dash2);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, DoDontActivity.class);
                startActivity(Dash2);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, EmergencyCall.class);
                startActivity(Dash2);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, D_Articles.class);
                startActivity(Dash2);
            }
        });
    }

    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag)
            ft.add(R.id.container, fragment);
        else
            ft.replace(R.id.container,fragment);
        ft.commit();
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No",null)
                    .show();
            //  super.onBackPressed();
        }


    }





}