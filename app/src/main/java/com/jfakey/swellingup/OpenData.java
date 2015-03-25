package com.jfakey.swellingup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class OpenData extends ActionBarActivity {


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_open_data);
	}
	

	/*
	 * 
	 * LEAVING THIS IN HERE FOR OWN RECORD ON HOW TO SAVE AND APPEND TO A FILE
	 * USE THIS ONCLICK EACH TIME A USER CLICKS A SPECIFIC DAY
	 * ADDITIONALLY, ON EACH DAY USER WILL BE ABLE TO CLICK "COMPLETE" WHICH WILL
	 * ALLOW THE USER TO INPUT ANY COMMENTS THAT WILL BE SAVED UNDER EACH DAY IN
	 * THE TEXT FILE
	 
	
	public void runSave(View view){
	    try {
	        //open file for writing
	    	OutputStreamWriter out = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));

	        //write information to file
	        EditText text = (EditText)findViewById(R.id.editText1);
	        String text2 = text.getText().toString();
	        out.write(text2);
	        out.write('\n');

	        //close file

	        out.close();
	        Toast.makeText(this,"Status Saved",Toast.LENGTH_LONG).show();

	    } catch (java.io.IOException e) {
	        //if caught
	        Toast.makeText(this, "Error",Toast.LENGTH_LONG).show();
	    }
	}
		*/

	public void runLoad(View view){
		StringBuilder text = new StringBuilder();
		try {
			InputStream is = openFileInput("save.txt");
			if (is != null){
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String line = null;
				while ((line = br.readLine()) != null){
					text.append(line);
					text.append('\n');
				}
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		TextView tv = (TextView)findViewById(R.id.textView3);
		tv.setText(text);
	}
	
	//playing with this to set a prompt for delete
	
	public void runDelete(View view){
	    
		
		AlertDialog.Builder adb = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.alert));
		adb.setTitle("WARNING");
		adb.setMessage("CANNOT BE UNDONE");
		adb.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				try {
					OutputStreamWriter out = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_PRIVATE));
					out.write('\n');
					out.close();

				} catch (java.io.IOException e) {
					e.printStackTrace();
				}
			}
		});
		adb.setNegativeButton("No", null);
		adb.show();
		
				
    };
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.open_data, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
