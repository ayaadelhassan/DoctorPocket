package com.example.doctorpocket_;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LegcheckActivity extends AppCompatActivity {

    private String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legcheck);
        res="";
    }

    public void clk(View view) {

        SharedPreferences preferences=getSharedPreferences("checkData",MODE_PRIVATE);
        int age = preferences.getInt("age", 0);
        int gender=preferences.getInt("gender", 0);
        String Gender;
        if (gender==1)
            Gender="male";
        else
            Gender="female";

        CheckBox c60 = findViewById(R.id.s_117);
        CheckBox c61 = findViewById(R.id.s_408);
        CheckBox c62 = findViewById(R.id.s_270);
        CheckBox c63 = findViewById(R.id.s_553);
        CheckBox c64 = findViewById(R.id.s_578);
        CheckBox c65 = findViewById(R.id.s_317);
        CheckBox c66 = findViewById(R.id.s_1624);
        CheckBox c67 = findViewById(R.id.s_1789);
        CheckBox c68 = findViewById(R.id.s_83);
        CheckBox c69 = findViewById(R.id.s_125);
        CheckBox c70 = findViewById(R.id.s_44);

        JSONObject Person = new JSONObject();
        try {
            Person.put("sex", Gender);
            Person.put("age", age);


            JSONArray evidence = new JSONArray();

            if (c60.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_117");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c60.setChecked(false);
            }
            if (c61.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_408");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c61.setChecked(false);
            }
            if (c62.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_270");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c62.setChecked(false);
            }
            if (c63.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_553");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c63.setChecked(false);
            }
            if (c64.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_578");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c64.setChecked(false);
            }
            if (c65.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_317");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c65.setChecked(false);
            }

            if (c66.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1624");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c66.setChecked(false);
            }
            if (c67.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1789");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c67.setChecked(false);
            }
            if (c68.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_83");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c68.setChecked(false);
            }
            if (c69.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_125");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c69.setChecked(false);
            }
            if (c70.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_44");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c70.setChecked(false);
            }

            /*/////////////////////////////////////*/


            Person.put("evidence", evidence);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        callJson(Person, LegcheckActivity.this);

    }
    public void callJson(JSONObject Per, final Activity activity) {

        RequestQueue queue = Volley.newRequestQueue(activity);
        String url = "https://api.infermedica.com/v2/diagnosis";

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, url, Per,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        //Log.d("json", "response is" + response);

                        try {
                            JSONArray conditions = response.getJSONArray("conditions");
                            String name, probability;
                            for (int i = 0; i < conditions.length(); i++) {
                                //Log.d("json", "loop: " + i);
                                JSONObject obj = conditions.getJSONObject(i);
                                name = obj.getString("common_name");
                                probability = obj.getString("probability");
                                res += ("You may have:" + name + "\n With a rate of :" + probability + "\n");
                                //Log.d("json", "res value: " + res);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Intent intent = new Intent(activity, Resopnse.class);
                        intent.putExtra("Result", res);
                        startActivity(intent);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //Log.d("json", "error found in onErrorResponse " + error);
                        error.printStackTrace();
                    }
                }) {
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> postMap = new HashMap<>();
                postMap.put("App-Id", "64992355");
                postMap.put("App-Key", "9af23cbb544d28e1201e21861710d1a9");
                return postMap;
            }

        };
        queue.add(jsonObjReq);

    }

    @Override
    protected void onResume() {
        super.onResume();
        res = "";
    }


}
