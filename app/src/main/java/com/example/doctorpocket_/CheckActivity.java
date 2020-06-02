package com.example.doctorpocket_;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

public class CheckActivity extends AppCompatActivity {

    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        getSupportActionBar().hide();
        res = "";
    }

    public void btnClick(View view) {

        SharedPreferences preferences=getSharedPreferences("checkData",MODE_PRIVATE);
        int age = preferences.getInt("age", 0);

        int gender=preferences.getInt("gender", 0);
        String Gender;
        if (gender==1)
            Gender="male";
        else
            Gender="female";
        Log.d("Age","Gender"+Gender );
        CheckBox c33 = findViewById(R.id.s_102);
        CheckBox c34 = findViewById(R.id.s_1104);
        CheckBox c35 = findViewById(R.id.s_188);
        CheckBox c36 = findViewById(R.id.s_370);
        CheckBox c37 = findViewById(R.id.s_1123);
        CheckBox c38 = findViewById(R.id.s_247);
        CheckBox c39 = findViewById(R.id.s_962);
        CheckBox c40 = findViewById(R.id.s_21);
        CheckBox c41 = findViewById(R.id.s_316);
        CheckBox c42 = findViewById(R.id.s_310);
        CheckBox c43 = findViewById(R.id.s_1429);
        CheckBox c44 = findViewById(R.id.s_1483);
        CheckBox c45 = findViewById(R.id.s_715);
        CheckBox c46 = findViewById(R.id.s_1);
        CheckBox c47 = findViewById(R.id.s_19);
        CheckBox c48 = findViewById(R.id.s_65);
        CheckBox c49 = findViewById(R.id.s_122);
        CheckBox c50 = findViewById(R.id.s_407);
        CheckBox c51 = findViewById(R.id.s_1563);
        CheckBox c52 = findViewById(R.id.s_121);
        CheckBox c53 = findViewById(R.id.s_1961);
        CheckBox c54 = findViewById(R.id.s_591);
        CheckBox c55 = findViewById(R.id.s_1105);
        CheckBox c56 = findViewById(R.id.s_1010);
        CheckBox c57 = findViewById(R.id.s_969);
        CheckBox c58 = findViewById(R.id.s_9);
        CheckBox c59 = findViewById(R.id.s_276);
        CheckBox c60 = findViewById(R.id.s_252);
        CheckBox c61 = findViewById(R.id.s_331);
        CheckBox c62 = findViewById(R.id.s_681);

        JSONObject Person = new JSONObject();
        try {
            Person.put("sex", Gender);
            Person.put("age", age);


            JSONArray evidence = new JSONArray();
            if (c33.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_102");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c33.setChecked(false);
            }
            if (c34.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1104");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c34.setChecked(false);
            }
            if (c35.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_188");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c35.setChecked(false);
            }
            if (c36.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_370");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c36.setChecked(false);
            }
            if (c37.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1123");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c37.setChecked(false);
            }
            if (c38.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_247");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c38.setChecked(false);
            }
            if (c39.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_962");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c39.setChecked(false);
            }
            if (c40.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_21");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c40.setChecked(false);
            }
            if (c41.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_316");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c41.setChecked(false);
            }
            if (c42.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_310");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c42.setChecked(false);
            }
            if (c43.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1429");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c43.setChecked(false);
            }
            if (c44.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1483");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c44.setChecked(false);
            }
            if (c45.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_715");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c45.setChecked(false);
            }
            if (c46.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c46.setChecked(false);
            }
            if (c47.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_19");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c47.setChecked(false);
            }
            if (c48.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_65");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c48.setChecked(false);
            }
            if (c49.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_122");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c49.setChecked(false);
            }
            if (c50.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_407");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c50.setChecked(false);
            }
            if (c51.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1563");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c51.setChecked(false);
            }
            if (c52.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_121");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c52.setChecked(false);
            }
            if (c53.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1961");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c53.setChecked(false);
            }
            if (c54.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_591");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c54.setChecked(false);
            }
            if (c55.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1105");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c55.setChecked(false);
            }
            if (c56.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1010");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c56.setChecked(false);
            }
            if (c57.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_969");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c57.setChecked(false);
            }
            if (c58.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_9");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c58.setChecked(false);
            }
            if (c59.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_276");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c59.setChecked(false);
            }
            if (c60.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_252");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c60.setChecked(false);
            }
            if (c61.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_331");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c61.setChecked(false);
            }
            if (c62.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_681");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c62.setChecked(false);
            }
            Person.put("evidence", evidence);
            //Log.d("json", "JSON to be sent: " + Person);

        } catch (JSONException e) {
            //Log.d("json", "Catching JSONOBJECT creation error" + e);
            e.printStackTrace();
        }

        callJson(Person, CheckActivity.this);

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
