package com.example.hp.loginpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by hp on 26-07-2017.
 */

public class SignUp extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    public void onSignButton(View v)
    {
        if(v.getId()==R.id.Lsignup)
        {
            EditText name = (EditText)findViewById(R.id.TFname);
            EditText email = (EditText)findViewById(R.id.TFemail);
            EditText uname = (EditText)findViewById(R.id.TFuname);
            EditText pas1= (EditText)findViewById(R.id.TFpassword);
            EditText pas2 = (EditText)findViewById(R.id.TFcpassword);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String pas1str = pas1.getText().toString();
            String pas2str = pas2.getText().toString();

            if(!pas1str.equals(pas2str))
            {

                Toast pass=Toast.makeText(this,"password dont match",Toast.LENGTH_SHORT);
                pass.show();
            }
            else
            {
                //details im DB
                Contact c= new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pas1str);

                helper.insertContact(c);

                Intent iss=new Intent(this,MainActivity.class);
                startActivity(iss);

            }

        }
    }
}
