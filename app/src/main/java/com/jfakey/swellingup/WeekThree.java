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

public class WeekThree extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week_three);
	}
	
	//day1, insert after onCreate
	public void day15Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Fifteen");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BuildBack.class);
		startActivity(i);
		
	}
	
	//day2
	public void day16Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Sixteen");
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
	
	//day3
	public void day17Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Seventeen");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BuildShoulders.class);
		startActivity(i);
		
	}
	//day4
	public void day18Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Eighteen");
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
	//day5
	public void day19Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Nineteen");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BuildChest.class);
		startActivity(i);
		
	}
	//day6
	public void day20Open(View view){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Twenty");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BuildLegs.class);
		startActivity(i);
		
	}
	
		public void day21Open(View view){
	//day7	
	try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
			osw.write("Day Twenty-One");
			osw.write('\n');
			osw.write("Activity Started");
			osw.write('\n');
			osw.close();
			Toast.makeText(this, "Status Saved", Toast.LENGTH_LONG).show();
			
		} catch (java.io.IOException e){
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		Intent i = new Intent(this, BuildBack.class);
		startActivity(i);
		
	}

	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.week_three, menu);
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
