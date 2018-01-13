package com.example.hp.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String username=getIntent().getStringExtra("username");

        TextView tv=(TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }
}
