package com.example.doctorpocket_;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    public void onbtnclk(View view) {
        EditText textView = findViewById(R.id.age);
        EditText editText = findViewById(R.id.name);
        RadioGroup radioGroup = findViewById(R.id.radio);

        String name = editText.getText().toString();
        String s1 = textView.getText().toString();


        if (name.equals("") || s1.equals("") || (radioGroup.getCheckedRadioButtonId() == -1))
        {
            Toast.makeText(this, "ادخل بياناتك", Toast.LENGTH_SHORT).show();
        } else {

            int age = Integer.parseInt(s1);
            SharedPreferences preferences = getSharedPreferences("checkData", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            editor.putInt("age", age);

            int selected = -1;
            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.male:
                    selected = 0;
                    break;
                case R.id.female:
                    selected = 1;
                    break;
            }

            editor.putInt("gender", selected);
            editor.apply();

            Intent intent = new Intent(StartActivity.this, SecondActivity.class);
            intent.putExtra("namE", name);
            startActivity(intent);
        }
    }
}
