package com.example.doctorpocket_;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static android.os.SystemClock.sleep;

public class HumanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);


    }

    @Override
    protected void onResume() {
        super.onResume();
        ImageView imageView=findViewById(R.id.head);
        imageView.setImageResource(R.drawable.head);
        ImageView image=findViewById(R.id.stomch);
        image.setImageResource(R.drawable.abdominal);
        ImageView im=findViewById(R.id.leg);
        im.setImageResource(R.drawable.leg);
    }

    public void headclk(View view) {
        MediaPlayer media = MediaPlayer.create(HumanActivity.this,R.raw.click);
        media.start();
        ImageView imageView=findViewById(R.id.head);
        imageView.setImageResource(R.drawable.headsec);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },2000);
        Intent intent=new Intent(HumanActivity.this,CheckActivity.class);
        startActivity(intent);
    }

    public void abdominalclk(View view) {
        MediaPlayer media = MediaPlayer.create(HumanActivity.this,R.raw.click);
        media.start();
        ImageView imageView=findViewById(R.id.stomch);
        imageView.setImageResource(R.drawable.abdominalsec);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },2000);
        Intent intent=new Intent(HumanActivity.this,AbdominalActivity.class);
        startActivity(intent);

    }

    public void legclk(View view) {
        MediaPlayer media = MediaPlayer.create(HumanActivity.this,R.raw.click);
        media.start();
        ImageView imageView=findViewById(R.id.leg);
        imageView.setImageResource(R.drawable.legsec);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },2000);
        Intent intent=new Intent(HumanActivity.this,LegcheckActivity.class);
        startActivity(intent);

    }

    public void clk(View view) {
        Intent intent=new Intent(HumanActivity.this,GeneralcheckActivity.class);
        startActivity(intent);
    }
}
