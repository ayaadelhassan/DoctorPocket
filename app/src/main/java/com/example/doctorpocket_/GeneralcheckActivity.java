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
import android.widget.TextView;

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

public class GeneralcheckActivity extends AppCompatActivity
{
    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generalcheck);
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
        CheckBox c1 = findViewById(R.id.s_81);
        CheckBox c2 = findViewById(R.id.s_21);
        CheckBox c3 = findViewById(R.id.s_715);
        CheckBox c4 = findViewById(R.id.s_102);
        CheckBox c5 = findViewById(R.id.s_295);
        CheckBox c6 = findViewById(R.id.s_777);
        CheckBox c7 = findViewById(R.id.s_319);
        CheckBox c8 = findViewById(R.id.s_582);
        CheckBox c9 = findViewById(R.id.s_1345);
        CheckBox c10 = findViewById(R.id.s_631);
        CheckBox c11 = findViewById(R.id.s_917);
        CheckBox c12 = findViewById(R.id.s_329);
        CheckBox c13 = findViewById(R.id.s_8);
        CheckBox c14 = findViewById(R.id.s_410);
        CheckBox c15 = findViewById(R.id.s_437);
        /*//////////////////////////////////*/
        CheckBox c16 = findViewById(R.id.s_1848);
        CheckBox c17 = findViewById(R.id.s_1432);
        CheckBox c18 = findViewById(R.id.s_305);
        CheckBox c19 = findViewById(R.id.s_110);
        CheckBox c20 = findViewById(R.id.s_338);
        CheckBox c21 = findViewById(R.id.s_88);
        CheckBox c22 = findViewById(R.id.s_1925);
        CheckBox c23 = findViewById(R.id.s_534);
        CheckBox c24 = findViewById(R.id.s_1190);
        CheckBox c25 = findViewById(R.id.s_227);
        CheckBox c26 = findViewById(R.id.s_311);
        CheckBox c27 = findViewById(R.id.s_226);
        CheckBox c28 = findViewById(R.id.s_285);
        CheckBox c29 = findViewById(R.id.s_277);
        CheckBox c30 = findViewById(R.id.s_185);
        CheckBox c31 = findViewById(R.id.s_215);
        CheckBox c32 = findViewById(R.id.s_1488);

        /*///////////////////////////// head */

        CheckBox c33 = findViewById(R.id.s_1104);
        CheckBox c34 = findViewById(R.id.s_188);
        CheckBox c35 = findViewById(R.id.s_370);
        CheckBox c36 = findViewById(R.id.s_1123);
        CheckBox c37 = findViewById(R.id.s_247);
        CheckBox c38 = findViewById(R.id.s_962);
        CheckBox c39 = findViewById(R.id.s_316);
        CheckBox c40 = findViewById(R.id.s_310);
        CheckBox c41 = findViewById(R.id.s_1429);
        CheckBox c42 = findViewById(R.id.s_1483);
        CheckBox c43 = findViewById(R.id.s_1);
        CheckBox c44 = findViewById(R.id.s_19);
        CheckBox c45 = findViewById(R.id.s_65);
        CheckBox c46 = findViewById(R.id.s_122);
        CheckBox c47 = findViewById(R.id.s_407);
        CheckBox c48 = findViewById(R.id.s_1563);
        CheckBox c49 = findViewById(R.id.s_121);
        CheckBox c50 = findViewById(R.id.s_1961);
        CheckBox c51 = findViewById(R.id.s_591);
        CheckBox c52 = findViewById(R.id.s_1105);
        CheckBox c53 = findViewById(R.id.s_1010);
        CheckBox c54 = findViewById(R.id.s_969);
        CheckBox c55 = findViewById(R.id.s_9);
        CheckBox c56 = findViewById(R.id.s_276);
        CheckBox c57 = findViewById(R.id.s_252);
        CheckBox c58 = findViewById(R.id.s_331);
        CheckBox c59 = findViewById(R.id.s_681);
        /*///////////////////////////legs*/

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
        /*////////////////////////*/


        JSONObject Person = new JSONObject();
        try {
            Person.put("sex", Gender);
            Person.put("age", age);


            JSONArray evidence = new JSONArray();

            if (c1.isChecked()) {
                Log.d("checkbox", "" + c1.isChecked());
                JSONObject ev = new JSONObject();
                ev.put("id", "s_81");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c1.setChecked(false);
            }
            if (c2.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_21");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c2.setChecked(false);
            }
            if (c3.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_715");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c3.setChecked(false);
            }
            if (c4.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_102");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c4.setChecked(false);
            }
            if (c5.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_295");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c5.setChecked(false);
            }
            if (c6.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_777");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c6.setChecked(false);
            }
            if (c7.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_319");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c7.setChecked(false);
            }
            if (c8.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_582");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c8.setChecked(false);
            }
            if (c9.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1345");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c9.setChecked(false);
            }
            if (c10.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_631");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c10.setChecked(false);
            }
            if (c11.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_917");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c11.setChecked(false);
            }
            if (c12.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_329");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c12.setChecked(false);
            }
            if (c13.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_8");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c13.setChecked(false);
            }
            if (c14.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_410");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c14.setChecked(false);
            }
            if (c15.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_437");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c15.setChecked(false);
            }

            /*///////////////////////////////////*/

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
                ev.put("id", "s_1925");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c22.setChecked(false);
            }
            if (c23.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_534");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c23.setChecked(false);
            }
            if (c24.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1190");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c24.setChecked(false);
            }
            if (c25.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_227");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c25.setChecked(false);
            }
            if (c26.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_311");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c26.setChecked(false);
            }
            if (c27.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_226");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c27.setChecked(false);
            }
            if (c28.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_285");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c28.setChecked(false);
            }
            if (c29.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_277");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c29.setChecked(false);
            }
            if (c30.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_185");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c30.setChecked(false);
            }
            if (c31.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_215");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c31.setChecked(false);
            }
            if (c32.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1488");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c32.setChecked(false);
            }

            /*///////////////////////////////////// head */

            if (c33.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1104");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c33.setChecked(false);
            }
            if (c34.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_188");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c34.setChecked(false);
            }
            if (c35.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_370");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c35.setChecked(false);
            }
            if (c36.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1123");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c36.setChecked(false);
            }
            if (c37.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_247");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c37.setChecked(false);
            }
            if (c38.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_962");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c38.setChecked(false);
            }
            if (c39.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_316");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c39.setChecked(false);
            }
            if (c40.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_310");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c40.setChecked(false);
            }
            if (c41.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1429");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c41.setChecked(false);
            }
            if (c42.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1483");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c42.setChecked(false);
            }
            if (c43.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c43.setChecked(false);
            }
            if (c44.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_19");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c44.setChecked(false);
            }
            if (c45.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_65");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c45.setChecked(false);
            }
            if (c46.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_122");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c46.setChecked(false);
            }
            if (c47.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_407");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c47.setChecked(false);
            }
            if (c48.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1563");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c48.setChecked(false);
            }
            if (c49.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_121");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c49.setChecked(false);
            }

            if (c50.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1961");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c50.setChecked(false);
            }


            if (c51.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_591");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c51.setChecked(false);
            }
            if (c52.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1105");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c52.setChecked(false);
            }
            if (c53.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_1010");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c53.setChecked(false);
            }
            if (c54.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_969");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c54.setChecked(false);
            }
            if (c55.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_9");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c55.setChecked(false);
            }
            if (c56.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_276");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c56.setChecked(false);
            }
            if (c57.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_252");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c57.setChecked(false);
            }
            if (c58.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_331");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c58.setChecked(false);
            }
            if (c59.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_681");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c59.setChecked(false);
            }

            /*///////////////////////////////////////////legs*/

            if (c60.isChecked()) {
                JSONObject ev = new JSONObject();
                ev.put("id", "s_117");
                ev.put("choice_id", "present");
                evidence.put(ev);
                c61.setChecked(false);
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
            Log.d("checkbox", "" + Person);
            Log.d("checkbox", String.valueOf(Person));

        } catch (JSONException e) {
            e.printStackTrace();
        }
        callJson(Person, GeneralcheckActivity.this);

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
