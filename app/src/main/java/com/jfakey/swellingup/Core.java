package com.jfakey.swellingup;

import java.io.OutputStreamWriter;

import android.support.v7.app.ActionBarActivity;
import android.text.method.LinkMovementMethod;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Core extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_core);
		
		
		TextView tv1=(TextView)findViewById(R.id.textView2);
		tv1.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv2=(TextView)findViewById(R.id.textView3);
		tv2.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv3=(TextView)findViewById(R.id.textView4);
		tv3.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv4=(TextView)findViewById(R.id.textView5);
		tv4.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv5=(TextView)findViewById(R.id.textView6);
		tv5.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv6=(TextView)findViewById(R.id.textView7);
		tv6.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv7=(TextView)findViewById(R.id.textView8);
		tv7.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv8=(TextView)findViewById(R.id.textView9);
		tv8.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv9=(TextView)findViewById(R.id.textView10);
		tv9.setMovementMethod(LinkMovementMethod.getInstance());

	
		
	}
	
	//finish button handler
	
	public void finishPrompt(View view){
		AlertDialog.Builder ad = new Builder(this);
		ad.setTitle("Finish");
		ad.setMessage("Input any notes you would like to save");
		final EditText input = new EditText(this);
		ad.setView(input);
		ad.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				//Put osw here
				String text = input.getText().toString();
				try {
					OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
					osw.write(text);
					osw.write('\n');
					osw.write("Activity Completed");
					osw.write('\n');
					osw.close();	
				} catch (java.io.IOException e){
					e.printStackTrace();
				}
			}
		});
		
		ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				//Canceled
			}
		});
		ad.show();
		
	}
	//end finish button handler	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.core, menu);
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
