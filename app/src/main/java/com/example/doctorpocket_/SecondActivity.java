package com.example.doctorpocket_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView=findViewById(R.id.welcomtext);
        TextView name=findViewById(R.id.name);
        String name1=getIntent().getStringExtra("namE");
        textView.setText("اهلا "+name1);
        String [] quotes={"- مارس الرياضة للتمتع بصحة جيدة","- السعادة ليست أكثر من صحة جيدة وذاكرة سيئة :D","- الحفاظ على صحة الجسم ضروري وإلا فلن نحافظ على أذهاننا قوية "," - الصحة الجيدة هي أعظم بركات الحياة","(نعمتان مغبون فيهما كثير من الناس :الصحة والفراغ)","الصحة الجيدة لا تقدر بثمن "};
        int random =new Random().nextInt(4);
        TextView welcome=findViewById(R.id.welcomqoute);
        welcome.setText(quotes[random]);

    }

    public void onbtn(View view) {
        Intent intent=new Intent (SecondActivity.this,HumanActivity.class);
        startActivity(intent);

    }

    public void btn2(View view) {
        Intent in=new Intent(SecondActivity.this,ProtectionActivity.class);
        startActivity(in);
    }
}