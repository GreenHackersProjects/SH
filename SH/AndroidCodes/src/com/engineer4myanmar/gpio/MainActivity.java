package com.engineer4myanmar.gpio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener {
	String URL = "http://192.168.1.2/";
	private Switch s0, s1, s2, s3, s4, s5, s6, s7,s8;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		s0 = (Switch) findViewById(R.id.s0);
		s1 = (Switch) findViewById(R.id.s1);
		s2 = (Switch) findViewById(R.id.s2);
		s3 = (Switch) findViewById(R.id.s3);
		s4 = (Switch) findViewById(R.id.s4);
		s5 = (Switch) findViewById(R.id.s5);
		s6 = (Switch) findViewById(R.id.s6);
		s7 = (Switch) findViewById(R.id.s7);
		s8 = (Switch) findViewById(R.id.s8);
		s0.setOnCheckedChangeListener(this);
		s1.setOnCheckedChangeListener(this);
		s2.setOnCheckedChangeListener(this);
		s3.setOnCheckedChangeListener(this);
		s4.setOnCheckedChangeListener(this);
		s5.setOnCheckedChangeListener(this);
		s6.setOnCheckedChangeListener(this);
		s7.setOnCheckedChangeListener(this);
		s8.setOnCheckedChangeListener(this);
	}

	public void onCheckedChanged(CompoundButton btn, boolean isChecked) {
		
		switch (btn.getId()) {
		case R.id.s0:
			if (isChecked) {funOn0(btn);} else {funOff0(btn);}
			// check the current state before we display the screen
			if (s0.isChecked()) {funOn0(btn);} else {funOff0(btn);}break;
			
		case R.id.s1:
			if (isChecked) {funOn1(btn);} else {funOff1(btn);}
			// check the current state before we display the screen
			if (s1.isChecked()) {funOn1(btn);} else {funOff1(btn);}break;
		case R.id.s2:
			if (isChecked) {funOn2(btn);} else {funOff2(btn);}
			// check the current state before we display the screen
			if (s2.isChecked()) {funOn2(btn);} else {funOff2(btn);}break;
		case R.id.s3:
			if (isChecked) {funOn3(btn);} else {funOff3(btn);}
			// check the current state before we display the screen
			if (s3.isChecked()) {funOn3(btn);} else {funOff3(btn);}break;
		case R.id.s4:
			if (isChecked) {funOn4(btn);} else {funOff4(btn);}
			// check the current state before we display the screen
			if (s4.isChecked()) {funOn4(btn);} else {funOff4(btn);}break;
		case R.id.s5:
			if (isChecked) {funOn5(btn);} else {funOff5(btn);}
			// check the current state before we display the screen
			if (s5.isChecked()) {funOn5(btn);} else {funOff5(btn);}break;
		case R.id.s6:
			if (isChecked) {funOn6(btn);} else {funOff6(btn);}
			// check the current state before we display the screen
			if (s6.isChecked()) {funOn6(btn);} else {funOff6(btn);}break;
		case R.id.s7:
			if (isChecked) {funOn7(btn);} else {funOff7(btn);}
			// check the current state before we display the screen
			if (s7.isChecked()) {funOn7(btn);} else {funOff7(btn);}break;
		case R.id.s8:
			if (isChecked) {funOn0(btn);funOn1(btn);funOn2(btn);funOn3(btn);funOn4(btn);funOn5(btn);funOn6(btn);funOn7(btn);} 
			else {funOff0(btn);funOff1(btn);funOff2(btn);funOff3(btn);funOff4(btn);funOff5(btn);funOff6(btn);funOff7(btn);}
			// check the current state before we display the screen
			if (s8.isChecked()) {funOn0(btn);funOn1(btn);funOn2(btn);funOn3(btn);funOn4(btn);funOn5(btn);funOn6(btn);funOn7(btn);} 
			else {funOff0(btn);funOff1(btn);funOff2(btn);funOff3(btn);funOff4(btn);funOff5(btn);funOff6(btn);funOff7(btn);}
		default:
			break;
		}

	}

	public void funOn0(View v) {
		String url = "http://192.168.1.2/index0.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s0 is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff0(View v) {
		String url = "http://192.168.1.2/index00.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s0 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOn1(View v) {
		String url = "http://192.168.1.2/index1.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s1 is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff1(View v) {
		String url = "http://192.168.1.2/index10.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s1 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOn2(View v) {
		String url = "http://192.168.1.2/index2.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s2 is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff2(View v) {
		String url = "http://192.168.1.2/index20.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s2 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOn3(View v) {
		String url = "http://192.168.1.2/index3.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s3 is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff3(View v) {
		String url = "http://192.168.1.2/index30.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s3 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOn4(View v) {
		String url = "http://192.168.1.2/index4.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s4 is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff4(View v) {
		String url = "http://192.168.1.2/index40.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s4 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOn5(View v) {
		String url = "http://192.168.1.2/index5.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s5is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff5(View v) {
		String url = "http://192.168.1.2/index50.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s5 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOn6(View v) {
		String url = "http://192.168.1.2/index6.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s6 is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff6(View v) {
		String url = "http://192.168.1.2/index60.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s6 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOn7(View v) {
		String url = "http://192.168.1.2/index7.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s7 is ON", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

	public void funOff7(View v) {
		String url = "http://192.168.1.2/index70.php";

		try {
			WebView webview = (WebView) findViewById(R.id.web1);
			webview.loadUrl(url);
			Toast.makeText(getApplicationContext(), "s7 is OFF", Toast.LENGTH_SHORT).show();
		} catch (Exception e) {

			Log.e("eeee", e.toString());
		}
	}

}
