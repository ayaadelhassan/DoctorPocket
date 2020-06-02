package com.example.doctorpocket_;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

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

public class AbdominalActivity extends AppCompatActivity {

    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdominal);
        res = "";

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
        CheckBox c16 = findViewById(R.id.s_1848);
        CheckBox c17 = findViewById(R.id.s_1432);
        CheckBox c18 = findViewById(R.id.s_305);
        CheckBox c19 = findViewById(R.id.s_110);
        CheckBox c20 = findViewById(R.id.s_338);
        CheckBox c21 = findViewById(R.id.s_88);
        CheckBox c22 = findViewById(R.id.s_329);
        CheckBox c23 = findViewById(R.id.s_8);
        CheckBox c24 = findViewById(R.id.s_1925);
        CheckBox c25 = findViewById(R.id.s_534);
        CheckBox c26 = findViewById(R.id.s_1190);
        CheckBox c27 = findViewById(R.id.s_227);
        CheckBox c28 = findViewById(R.id.s_311);
        CheckBox c29 = findViewById(R.id.s_226);
        CheckBox c30 = findViewById(R.id.s_285);
        CheckBox c31 = findViewById(R.id.s_277);
        CheckBox c32 = findViewById(R.id.s_185);
        CheckBox c33 = findViewById(R.id.s_215);
        CheckBox c34 = findViewById(R.id.s_1488);


        JSONObject Person = new JSONObject();
        try {
            Person.put("sex", Gender);
            Person.put("age", age);


            JSONArray evidence = new JSONArray();


            if (c16.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1848");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c16.setChecked(false);
            }
            if (c17.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1432");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c17.setChecked(false);
            }
            if (c18.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_305");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c18.setChecked(false);

            }
            if (c19.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_110");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c19.setChecked(false);

            }
            if (c20.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_338");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c20.setChecked(false);

            }
            if (c21.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_88");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c21.setChecked(false);

            }
            if (c22.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_329");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c22.setChecked(false);
            }
            if (c23.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_8");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c23.setChecked(false);
            }
            if (c24.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1925");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c24.setChecked(false);

            }
            if (c25.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_534");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c25.setChecked(false);
            }
            if (c26.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1190");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c26.setChecked(false);
            }
            if (c27.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_227");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c27.setChecked(false);
            }
            if (c28.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_311");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c28.setChecked(false);
            }
            if (c29.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_226");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c29.setChecked(false);
            }
            if (c30.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_285");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c30.setChecked(false);
            }
            if (c31.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_277");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c31.setChecked(false);
            }
            if (c32.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_185");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c32.setChecked(false);
            }
            if (c33.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_215");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c33.setChecked(false);
            }
            if (c34.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1488");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c34.setChecked(false);
            }

            Person.put("evidence", evidence);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        callJson(Person, AbdominalActivity.this);

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
