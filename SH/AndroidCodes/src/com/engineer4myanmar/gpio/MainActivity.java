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

public class MainActivity extends Activity implements  OnCheckedChangeListener {
	String URL="http://192.168.1.2/";
	private Switch s0,s1,s2,s3,s4,s5,s6,s7;
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
        s0.setOnCheckedChangeListener(this);
        s1.setOnCheckedChangeListener(this);
        s2.setOnCheckedChangeListener(this);
        s3.setOnCheckedChangeListener(this);
        s4.setOnCheckedChangeListener(this);
        s5.setOnCheckedChangeListener(this);
        s6.setOnCheckedChangeListener(this);
        s7.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
    public void funOn0(View v)
    {
    	String url="http://192.168.1.2/index0.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }

    public void funOff0(View v)
    {
    	String url="http://192.168.1.2/index00.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }
    
    public void funOn1(View v)
    {
    	String url="http://192.168.1.2/index1.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }

    public void funOff1(View v)
    {
    	String url="http://192.168.1.2/index10.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }
    
    public void funOn2(View v)
    {
    	String url="http://192.168.1.2/index2.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }

    public void funOff2(View v)
    {
    	String url="http://192.168.1.2/index20.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }
    
    public void funOn3(View v)
    {
    	String url="http://192.168.1.2/index3.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }

    public void funOff3(View v)
    {
    	String url="http://192.168.1.2/index30.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }
    
    public void funOn4(View v)
    {
    	String url="http://192.168.1.2/index4.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }

    public void funOff4(View v)
    {
    	String url="http://192.168.1.2/index40.php";
		
    	try {
    		WebView webview = (WebView)findViewById(R.id.web1 );
    		webview.loadUrl(url);
    	   
    	  } catch (Exception e) {
    	    
    	   Log.e("eeee",e.toString());
    	  }
    }
        public void funOn5(View v)
        {
        	String url="http://192.168.1.2/index5.php";
    		
        	try {
        		WebView webview = (WebView)findViewById(R.id.web1 );
        		webview.loadUrl(url);
        	   
        	  } catch (Exception e) {
        	    
        	   Log.e("eeee",e.toString());
        	  }
        }

        public void funOff5(View v)
        {
        	String url="http://192.168.1.2/index50.php";
    		
        	try {
        		WebView webview = (WebView)findViewById(R.id.web1 );
        		webview.loadUrl(url);
        	   
        	  } catch (Exception e) {
        	    
        	   Log.e("eeee",e.toString());
        	  }
        }
        
        public void funOn6(View v)
        {
        	String url="http://192.168.1.2/index6.php";
    		
        	try {
        		WebView webview = (WebView)findViewById(R.id.web1 );
        		webview.loadUrl(url);
        	   
        	  } catch (Exception e) {
        	    
        	   Log.e("eeee",e.toString());
        	  }
        }

        public void funOff6(View v)
        {
        	String url="http://192.168.1.2/index60.php";
    		
        	try {
        		WebView webview = (WebView)findViewById(R.id.web1 );
        		webview.loadUrl(url);
        	   
        	  } catch (Exception e) {
        	    
        	   Log.e("eeee",e.toString());
        	  }
        }
        
        public void funOn7(View v)
        {
        	String url="http://192.168.1.2/index7.php";
    		
        	try {
        		WebView webview = (WebView)findViewById(R.id.web1 );
        		webview.loadUrl(url);
        	   
        	  } catch (Exception e) {
        	    
        	   Log.e("eeee",e.toString());
        	  }
        }

        public void funOff7(View v)
        {
        	String url="http://192.168.1.2/index70.php";
    		
        	try {
        		WebView webview = (WebView)findViewById(R.id.web1 );
        		webview.loadUrl(url);
        	   
        	  } catch (Exception e) {
        	    
        	   Log.e("eeee",e.toString());
        	  }
        }

		


	
    	
    	
    
    
	
	
}
