package com.example.jong_min.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by jong-min on 2015-08-19.
 */
public class UserProfile extends Activity implements Animation.AnimationListener {
    LinearLayout ln;
    Animation slideUp;
    Animation slideDown;
    ImageButton addBtn;
    Button addMap;
    Button addPicture;

    ImageButton feedBtn;
    ImageButton searchBtn;
    ImageButton mymapBtn;
    ImageButton profileBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        ln = (LinearLayout)findViewById(R.id.add);
        ln.setVisibility(View.INVISIBLE);
        addBtn = (ImageButton)findViewById(R.id.btn_3);
        feedBtn = (ImageButton)findViewById(R.id.btn_1);
        searchBtn = (ImageButton)findViewById(R.id.btn_2);
        mymapBtn = (ImageButton)findViewById(R.id.btn_4);
        profileBtn = (ImageButton)findViewById(R.id.btn_5);

        slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        slideUp.setAnimationListener(this);
        slideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        slideDown.setAnimationListener(this);

        addMap = (Button)findViewById(R.id.addmap);
        addPicture = (Button)findViewById(R.id.addpicture);

        addMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserProfile.this,SelectMap.class);
                startActivity(intent);
            }
        });

        addPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserProfile.this,MyAlbum.class);
                startActivity(intent);
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.VISIBLE);
                ln.startAnimation(slideUp);
            }
        });
        feedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserProfile.this,FeedList.class);
                startActivity(intent);
            }
        });
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserProfile.this,SearchHash.class);
                startActivity(intent);
            }
        });
        mymapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(EditMap.this,MyAlbum.class);
                //startActivity(intent);
            }
        });
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserProfile.this,UserProfile.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
