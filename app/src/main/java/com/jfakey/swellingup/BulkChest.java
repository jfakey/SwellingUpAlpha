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

public class BulkChest extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bulk_chest);
		
		
		TextView tv1=(TextView)findViewById(R.id.textView3);
		tv1.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv2=(TextView)findViewById(R.id.textView7);
		tv2.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv3=(TextView)findViewById(R.id.textView10);
		tv3.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv4=(TextView)findViewById(R.id.textView14);
		tv4.setMovementMethod(LinkMovementMethod.getInstance());
		
		TextView tv5=(TextView)findViewById(R.id.textView17);
		tv5.setMovementMethod(LinkMovementMethod.getInstance());

		
	}

    public void ds1Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Incline Fly: 15, 12, 8\nIncline Press: 15, 12, 8, 8");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Incline Fly\nIncline Press" + input.getText().toString());

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

    public void fs1Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Forced Chest Press with Rotation");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Chest Press with Rotation\n" + input.getText().toString());

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

    public void ps1Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Progressive Incline Press");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Progressive Incline Press\n" + input.getText().toString());

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
    public void ns1Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Close Grip Press to Fly: \n15, 12, 8");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Close Grip Press to Fly\n" + input.getText().toString());

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
    public void ns2Prompt(View view){

        AlertDialog.Builder ad = new Builder(this);
        ad.setTitle("Enter Numbers");
        ad.setMessage("Decline Push Ups: 10, 10, 10");
        final EditText input = new EditText(this);
        ad.setView(input);
        ad.setPositiveButton("Save", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = ("Decline Push Ups\n" + input.getText().toString());

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


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bulk_chest, menu);
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
