package com.example.doctorpocket_;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Resopnse extends AppCompatActivity {

    String res;
    ClipboardManager clipboardManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resopnse);
        String result = getIntent().getStringExtra("Result");
        TextView textView = findViewById(R.id.response);
        textView.setText(result);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, " للترجمة اضغط على الزر بالأسفل سوف يتم نسخ النص تلقائيا ", Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
    public void clkk(View view) {
      try {
           res = getIntent().getStringExtra("Result");
          clipboardManager=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
          ClipData clipData=ClipData.newPlainText("text",res);
          clipboardManager.setPrimaryClip(clipData);
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, res);
            intent.putExtra("key_text_input", res);
            intent.putExtra("key_text_output", "");
            intent.putExtra("key_language_from", "en");
            intent.putExtra("key_language_to", "ar");
            intent.putExtra("key_suggest_translation", "");
            intent.putExtra("key_from_floating_window", false);
            intent.setComponent(new ComponentName(
                    "com.google.android.apps.translate",
                    //Change is here
                    //"com.google.android.apps.translate.HomeActivity"));
                    "com.google.android.apps.translate.TranslateActivity"));
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
            // TODO Auto-generated catch block
            Toast.makeText(this, "Sorry, No Google Translation Installed, opening in browser!", Toast.LENGTH_SHORT).show();
            clipboardManager=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
          ClipData clipData=ClipData.newPlainText("text",res);
           clipboardManager.setPrimaryClip(clipData);

          startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://translate.google.com.eg/?hl=ar")));

        }




    }
}
