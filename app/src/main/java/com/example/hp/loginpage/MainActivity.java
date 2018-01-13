package com.example.hp.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    DatabaseHelper helper=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.loginB) {
            EditText a=(EditText)findViewById(R.id.username);
            String str=a.getText().toString();
            EditText b=(EditText)findViewById(R.id.password);
            String pass=b.getText().toString();

            String password = helper.searchPass(str);
            if(pass.equals(password))
            {
                Intent i = new Intent(this,Main2Activity.class);
                i.putExtra("username",str);
                startActivity(i);
            }
            else
            {
                Toast temp=Toast.makeText(MainActivity.this," username and password dont match",Toast.LENGTH_SHORT);
                temp.show();
            }


        }
        if(v.getId() == R.id.signup){
            Intent is = new Intent(this,SignUp.class);
            startActivity(is);
        }
    }
}
