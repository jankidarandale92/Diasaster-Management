package com.example.disastermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    //91d45e5d267f6305064d0fe8d2fbc06b
    ImageView i1;
    Button Db;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    //Button cLanguage;
    Spinner spinner;
    FloatingActionButton bottom_appbar;

    BottomNavigationView bottomNavigationView;
    CardView card1, card2, card3, card4, card5, card6;
    public static final String[] languages = {"Select language", "English", "Marathi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottom_nav_view);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);

//Dashboard

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        //  spinner = findViewById(R.id.spinner);
        Db=findViewById(R.id.Db);
        i1=findViewById(R.id.i1);

        Db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, Alert.class);
                startActivity(Dash2);
            }
        });
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //Language change
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languages);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setSelection(0);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String selectedLang = parent.getItemAtPosition(position).toString();
//                if (selectedLang.equals("English")) {
//                    setLocal(MainActivity.this, "en");
//                    finish();
//                    startActivity(getIntent());
//
//                } else if (selectedLang.equals("Marathi")) {
//                    setLocal(MainActivity.this, "mr");
//                    finish();
//                    startActivity(getIntent());
//
//                }
//            }

//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.b_nav_home) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(0, 0);
                } else if (id == R.id.b_nav_Aboutus) {
                    startActivity(new Intent(getApplicationContext(), Aboutus.class));
                    overridePendingTransition(0, 0);

                } else if (id == R.id.bottom_appbar) {
                    startActivity(new Intent(getApplicationContext(), Donate.class));
                    overridePendingTransition(0, 0);

                }
                // else if (id==R.id.b_nav_sos) {
                // startActivity(new Intent(getApplicationContext(), SOS.class));
                // overridePendingTransition(0,0);

                //} else if (id==R.id.b_nav_helpline) {
                //  startActivity(new Intent(getApplicationContext(), Helpline.class));
                // overridePendingTransition(0,0);

                //}
                return false;
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.dhome) {

                    Intent intent7 = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent7);
                } else if (id == R.id.dlocation) {
                    Intent intent8 = new Intent(MainActivity.this, Location.class);
                    startActivity(intent8);


                } else if (id == R.id.dshare) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String Body = "Download this app";
                    String Sub = "Application link here";
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_TEXT, Body);
                    intent.putExtra(Intent.EXTRA_TEXT, Sub);
                    startActivity(Intent.createChooser(intent, "share via"));
                }  else if (id == R.id.drateUs) {
                    Intent intent11 = new Intent(MainActivity.this, RateUs.class);
                    startActivity(intent11);
                } else if (id == R.id.dlogout) {
                    drawerLayout.isDrawerOpen(GravityCompat.START);
                    drawerLayout.closeDrawer(GravityCompat.START);

                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("Are you sure you want to exit")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            })
                            .setNegativeButton("No", null)
                            .show();
                    //  super.onBackPressed();
                }

                return true;
            }
        });
        drawerLayout.closeDrawer(GravityCompat.START);

//Dashboard intents
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMobileDataEnabled()) {

                    Intent Dash2 = new Intent(MainActivity.this, WeatherAppActivity.class);
                    startActivity(Dash2);
                } else {
                    Toast.makeText(MainActivity.this, "Make sure your network connection is ON", Toast.LENGTH_SHORT).show();
                }

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, D_Articles.class);
                startActivity(Dash2);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, SafetyTipActivity.class);
                startActivity(Dash2);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, DoDontActivity.class);
                startActivity(Dash2);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, EmergencyCall.class);
                startActivity(Dash2);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dash2 = new Intent(MainActivity.this, Alert.class);
                startActivity(Dash2);
            }
        });
    }

    //public void loadFrag(Fragment fragment, boolean flag){
    // FragmentManager fm = getSupportFragmentManager();
    // FragmentTransaction ft = fm.beginTransaction();
    //if(flag)
    // ft.add(R.id.container, fragment);
    // else
    // ft.replace(R.id.container,fragment);
    //ft.commit();
    //}
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
            //  super.onBackPressed();
        }


    }
    private boolean isMobileDataEnabled() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    //Language change
//    public void setLocal(Activity activity, String langcode) {
//        Locale locale = new Locale(langcode);
//        locale.setDefault(locale);
//        Resources resources = activity.getResources();
//        Configuration config = resources.getConfiguration();
//        config.setLocale(locale);
//        resources.updateConfiguration(config, resources.getDisplayMetrics());



}