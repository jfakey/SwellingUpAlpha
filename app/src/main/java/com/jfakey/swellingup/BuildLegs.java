package com.jfakey.swellingup;

import java.io.IOException;
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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class BuildLegs extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_build_legs);
		
		
		
		TextView tv1=(TextView)findViewById(R.id.textView3);
		tv1.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv2=(TextView)findViewById(R.id.textView6);
		tv2.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv3=(TextView)findViewById(R.id.textView10);
		tv3.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv4=(TextView)findViewById(R.id.textView11);
		tv4.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv5=(TextView)findViewById(R.id.textView16);
		tv5.setMovementMethod(LinkMovementMethod.getInstance());
		
	}
	
	//finish button handler

    public void ds1Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Sumo Squat: 15, 12, 8, 8");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Sumo Squat\n" + input.getText().toString());

                try {
                    OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
                    osw.write('\n');
                    osw.write(text);
                    osw.close();
                } catch (IOException e){
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

    public void ds2Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Alternate Lunges: 15, 12, 8, 8 \nStep Up to Reverse: 10, 10, 10");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Alternate Lunge\nStep Up to Reverse\n" + input.getText().toString());

                try {
                    OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
                    osw.write('\n');
                    osw.write(text);
                    osw.close();
                } catch (IOException e){
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

    public void gs1Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Parallel Squat: 15, 12, 8\nBulgarian Squat: 15, 12, 8\nStraight Leg Deadlift: 15, 12, 8");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Parallel Squat\nBulgarian Squat\nStraight Leg Deadlift\n" + input.getText().toString());

                try {
                    OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
                    osw.write('\n');
                    osw.write(text);
                    osw.close();
                } catch (IOException e){
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

    public void ts1Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Single Calf Raise\nSeated Calf Raise");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Single Calf Raise\nSeated Calf Raise\n" + input.getText().toString());

                try {
                    OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
                    osw.write('\n');
                    osw.write(text);
                    osw.close();
                } catch (IOException e){
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



    public void finishPrompt(View view){
        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Finish");
        ad.setMessage("Input any notes you would like to save");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = input.getText().toString();
                try {
                    OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("save.txt", Context.MODE_APPEND));
                    osw.write('\n');
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
		getMenuInflater().inflate(R.menu.build_legs, menu);
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
