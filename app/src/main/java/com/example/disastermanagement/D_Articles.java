package com.example.disastermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.disastermanagement.Earth_effects;
import com.example.disastermanagement.Earth_history;
import com.example.disastermanagement.Earth_recent;
import com.example.disastermanagement.R;
import com.google.android.material.navigation.NavigationView;

public class D_Articles extends AppCompatActivity {
    VideoView videoView,videoView2,videoView3,videoView4,videoView5,videoView6,videoView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darticles);
        CardView card1a,card1b,card1c,card2a,card2b,card2c,card3a,card3b,card3c,card4a,card4b,card4c,card5a,card5b,card5c,
                card6a,card6b,card6c,card7a,card7b,card7c;

        card1a=findViewById(R.id.card1a);
        card1b=findViewById(R.id.card1b);
        card1c=findViewById(R.id.card1c);
        card2a=findViewById(R.id.card2a);
        card2b=findViewById(R.id.card2b);
        card2c=findViewById(R.id.card2c);
        card3a=findViewById(R.id.card3a);
        card3b=findViewById(R.id.card3b);
        card3c=findViewById(R.id.card3c);
        card4a=findViewById(R.id.card4a);
        card4b=findViewById(R.id.card4b);
        card4c=findViewById(R.id.card4c);
        card5a=findViewById(R.id.card5a);
        card5b=findViewById(R.id.card5b);
        card5c=findViewById(R.id.card5c);
        card6a=findViewById(R.id.card6a);
        card6b=findViewById(R.id.card6b);
        card6c=findViewById(R.id.card6c);
        card7a=findViewById(R.id.card7a);
        card7b=findViewById(R.id.card7b);
        card7c=findViewById(R.id.card7c);




        card1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent37=new Intent(D_Articles.this, Earth_history.class);
                startActivity(intent37);
            }
        });

        card1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent38=new Intent(D_Articles.this, Earth_recent.class);
                startActivity(intent38);
            }
        });
        card1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent39=new Intent(D_Articles.this, Earth_effects.class);
                startActivity(intent39);
            }
        });
        card2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent40=new Intent(D_Articles.this, Tsunami_history.class);
                startActivity(intent40);
            }
        });

        card2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent41=new Intent(D_Articles.this, Tsunami_recent.class);
                startActivity(intent41);
            }
        });
        card2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent42=new Intent(D_Articles.this, Tsunami_effects.class);
                startActivity(intent42);
            }
        });
        card3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent43=new Intent(D_Articles.this,Cyclone_history.class);
                startActivity(intent43);
            }
        });

        card3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent44=new Intent(D_Articles.this, Cyclone_recent.class);
                startActivity(intent44);
            }
        });
        card3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent45=new Intent(D_Articles.this,Cyclone_effect.class);
                startActivity(intent45);
            }
        });
        card4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent46=new Intent(D_Articles.this,Landslide_history.class);
                startActivity(intent46);
            }
        });

        card4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent47=new Intent(D_Articles.this, Landslide_recent.class);
                startActivity(intent47);
            }
        });
        card4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent48=new Intent(D_Articles.this,Landslide_effect.class);
                startActivity(intent48);
            }
        });
        card5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent49=new Intent(D_Articles.this,Flood_history.class);
                startActivity(intent49);
            }
        });

        card5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent50=new Intent(D_Articles.this, Flood_recent.class);
                startActivity(intent50);
            }
        });
        card5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent51=new Intent(D_Articles.this,Flood_effect.class);
                startActivity(intent51);
            }
        });
        card6a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent52=new Intent(D_Articles.this,Flood_history.class);
                startActivity(intent52);
            }
        });

        card6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent53=new Intent(D_Articles.this,Flood_recent.class);
                startActivity(intent53);
            }
        });
        card6c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent54=new Intent(D_Articles.this,Flood_effect.class);
                startActivity(intent54);
            }
        });
        card6a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent52=new Intent(D_Articles.this,Volcano_history.class);
                startActivity(intent52);
            }
        });

        card6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent53=new Intent(D_Articles.this, Volcano_recent.class);
                startActivity(intent53);
            }
        });
        card6c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent54=new Intent(D_Articles.this,Volcano_effect.class);
                startActivity(intent54);
            }
        });
        card7a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent55=new Intent(D_Articles.this,Draught_history.class);
                startActivity(intent55);
            }
        });

        card7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent56=new Intent(D_Articles.this,Draught_recent.class);
                startActivity(intent56);
            }
        });
        card7c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent57=new Intent(D_Articles.this,Draught_effect.class);
                startActivity(intent57);
            }
        });
        videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v1;
        videoView.setVideoURI(Uri.parse(videoPath));

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });

        videoView2 = findViewById(R.id.videoView2);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.v2;
        videoView2.setVideoURI(Uri.parse(videoPath2)); // Corrected: set video URI for videoView2

        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView2.start(); // Corrected: start videoView2
            }
        });
        videoView3 = findViewById(R.id.videoView3);
        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.v3;
        videoView3.setVideoURI(Uri.parse(videoPath3));

        videoView3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView3.start();
            }
        });
        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.v4;
        videoView4 = findViewById(R.id.videoView4);
        videoView4.setVideoURI(Uri.parse(videoPath4));

        videoView4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView4.start();
            }
        });


        videoView5 = findViewById(R.id.videoView5);
        String videoPath5 = "android.resource://" + getPackageName() + "/" + R.raw.v5;
        videoView5.setVideoURI(Uri.parse(videoPath5));

        videoView5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView5.start();
            }
        });

        videoView6 = findViewById(R.id.videoView6);
        String videoPath6 = "android.resource://" + getPackageName() + "/" + R.raw.v6;
        videoView6.setVideoURI(Uri.parse(videoPath6));

        videoView6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView6.start();
            }
        });

        videoView7 = findViewById(R.id.videoView7);
        String videoPath7 = "android.resource://" + getPackageName() + "/" + R.raw.v7;
        videoView7.setVideoURI(Uri.parse(videoPath7));

        videoView7.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView7.start();
            }
        });



    }
}