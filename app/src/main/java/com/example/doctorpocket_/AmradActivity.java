package com.example.doctorpocket_;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

public class AmradActivity extends AppCompatActivity {
    TextView text;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amrad);

        text= findViewById(R.id.txt);
        image=findViewById(R.id.img);

        String infor= getIntent().getStringExtra("index");
        text.setText(infor);

        int in= getIntent().getIntExtra("clicked",-1);
        if(in!=-1)
            image.setImageResource(in);
    }
}
