package com.engineer4myanmar.gpio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PassActivity extends Activity {
	EditText etUname, etPass;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        etUname=(EditText)findViewById(R.id.etUname );
        etPass=(EditText)findViewById(R.id.etPass );
    }

    public void funLogin(View v)
    {
    	String sUname="";
    	String sPass="";
    	sUname=etUname.getText().toString();
    	sPass= etPass.getText().toString();
    	if(sUname.equals("admin")&&sPass.equals("123"))
    	{
    		Intent intent = new Intent(this,MainActivity.class);
        	startActivity(intent);
        	this.finish();
    	}
    	else
    	{
    		Toast.makeText(getApplicationContext(), "Wrong password or username",Toast.LENGTH_SHORT).show();
    		etUname.setText("");
    		etPass.setText("");
    		etUname.requestFocus();
    	}
    	
    }
  
}
