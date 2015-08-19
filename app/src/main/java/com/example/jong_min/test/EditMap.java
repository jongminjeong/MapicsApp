package com.example.jong_min.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;


public class EditMap extends ActionBarActivity implements Animation.AnimationListener {
    LinearLayout ln;
    Animation slideUp;
    Animation slideDown;
    ImageButton addBtn;
    ImageButton feedBtn;
    ImageButton searchBtn;
    ImageButton mymapBtn;
    ImageButton profileBtn;

    Button addMap;
    Button addPicture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setCustomView(R.layout.title_layout);
        TextView title = (TextView)getSupportActionBar().getCustomView().findViewById(R.id.title);
        title.setText("지도편집");
        setContentView(R.layout.edit_map);

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
                Intent intent=new Intent(EditMap.this,SelectMap.class);
                startActivity(intent);
            }
        });

        addPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EditMap.this,MyAlbum.class);
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
                Intent intent=new Intent(EditMap.this,FeedList.class);
               startActivity(intent);
            }
        });
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EditMap.this,SearchHash.class);
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
                Intent intent=new Intent(EditMap.this,UserProfile.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_okay, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_okay:
                Intent intent=new Intent(EditMap.this, MainMap.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
