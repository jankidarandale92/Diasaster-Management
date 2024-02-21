package com.example.disastermanagement;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;


public class RateUsDialog extends Dialog {
    private float userRate=0;
    public RateUsDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_us_dialog_layout);

        final AppCompatButton rateNowBtn = findViewById(R.id.RateNowBtn);
        final AppCompatButton laterBtn = findViewById(R.id.LaterBtn);
        final RatingBar ratingBar = findViewById(R.id.RatingBar);
        final ImageView ratingimage=findViewById(R.id.ratingimage);

        rateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //your code goes here
            }
        });
        laterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hide rating dialod
              dismiss();
            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                if(rating <= 1){
                    ratingimage.setImageResource(R.drawable.one_star);
                } else if (rating <= 2) {
                   ratingimage.setImageResource(R.drawable.two_star);
                }
                else if (rating <= 3) {
                    ratingimage.setImageResource(R.drawable.three_star);
                }
                else if (rating <= 4) {
                    ratingimage.setImageResource(R.drawable.four_star);
                }
                else if(rating <= 5){
                    ratingimage.setImageResource(R.drawable.five_star);
                }
                //animate emoji image
                animatedImage(ratingimage);

                //selected rating by user
                userRate =rating;
            }
        });
    }
    private void animatedImage(ImageView ratingImage){
        ScaleAnimation scaleAnimation=new ScaleAnimation(0,1f,0,1f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(200);
        ratingImage.startAnimation(scaleAnimation);
    }
}
