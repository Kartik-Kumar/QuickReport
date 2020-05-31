package com.project.quickreport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    private ImageView doctorImage,plusImage;
    private TextView appname,developerName;

    private Animation top,left,right,bottom;
    private int TIME_LAPSE=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        doctorImage=findViewById(R.id.doctor);
        plusImage=findViewById(R.id.plushsign);
        appname=findViewById(R.id.appnameText);
        developerName=findViewById(R.id.developerText);

        top= AnimationUtils.loadAnimation(this,R.anim.top);
        right=AnimationUtils.loadAnimation(this,R.anim.right);
        left=AnimationUtils.loadAnimation(this,R.anim.left);
        bottom=AnimationUtils.loadAnimation(this,R.anim.bottom);

        doctorImage.setAnimation(top);
        plusImage.setAnimation(bottom);

        appname.setAnimation(right);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_LAPSE );



    }
}
