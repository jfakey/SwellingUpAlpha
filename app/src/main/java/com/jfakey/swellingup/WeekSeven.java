package com.jfakey.swellingup;

import java.io.OutputStreamWriter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class WeekSeven extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week_seven);
	}
	//day1, insert after onCreate
	public void day43Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Forty-Three");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BulkChest.class);
		startActivity(i);
		
	}
	
	//day2
	public void day44Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Forty-Four");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BulkLegs.class);
		startActivity(i);
		
	}
	
	//day3
	public void day45Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Forty-Five");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BulkArms.class);
		startActivity(i);
		
	}
	//day4
	public void day46Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Forty-Six");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, Core.class);
		startActivity(i);
		
	}
	//day5
	public void day47Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Forty-Seven");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BulkBack.class);
		startActivity(i);
		
	}
	//day6
	public void day48Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Forty-Eight");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BulkShoulders.class);
		startActivity(i);
		
	}
	
		public void day49Open(View view){
	//day7	
	try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Forty-Nine");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, Rest.class);
		startActivity(i);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.week_seven, menu);
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
