package com.jfakey.swellingup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    //ADDED BY ME
    
    
    public void openWeek1(View view){
    	Intent intent = new Intent(this, WeekOne.class);
    	startActivity(intent);
    }
    public void openWeek2(View view){
    	Intent intent = new Intent(this, WeekTwo.class);
    	startActivity(intent);
    }
    public void openWeek3(View view){
    	Intent intent = new Intent(this, WeekThree.class);
    	startActivity(intent);
    }
    public void openWeek4(View view){
    	Intent intent = new Intent(this, WeekFour.class);
    	startActivity(intent);
    }
    public void openWeek5(View view){
    	Intent intent = new Intent(this, WeekFive.class);
    	startActivity(intent);
    }
    public void openWeek6(View view){
    	Intent intent = new Intent(this, WeekSix.class);
    	startActivity(intent);
    }
    public void openWeek7(View view){
    	Intent intent = new Intent(this, WeekSeven.class);
    	startActivity(intent);
    }
    public void openWeek8(View view){
    	Intent intent = new Intent(this, WeekEight.class);
    	startActivity(intent);
    }
    public void openWeek9(View view){
    	Intent intent = new Intent(this, WeekNine.class);
    	startActivity(intent);
    }
    public void openWeek10(View view){
    	Intent intent = new Intent(this, WeekTen.class);
    	startActivity(intent);
    }
    public void openWeek11(View view){
    	Intent intent = new Intent(this, WeekEleven.class);
    	startActivity(intent);
    }
    public void openWeek12(View view){
    	Intent intent = new Intent(this, WeekTwelve.class);
    	startActivity(intent);
    }
    public void helpButt(View view){
    	Intent intent = new Intent(this, HelpButt.class);
    	startActivity(intent);
    }
    public void openData(View view){
    	Intent intent = new Intent(this, OpenData.class);
    	startActivity(intent);
    }


    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
