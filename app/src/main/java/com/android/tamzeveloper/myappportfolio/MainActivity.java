package com.android.tamzeveloper.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click

        Context context = getApplicationContext();
        CharSequence text = "This button will launch ";
        int duration = Toast.LENGTH_SHORT;

        int buttonId=view.getId();

        switch (buttonId){
            case R.id.button_spotify:
                text=text+"Spotify Streamer App!";
                break;
            case R.id.button_superDuo1:
                text=text+"Football Scores App!";
                break;
            case R.id.button_superDuo2:
                text=text+"Library App!";
                break;

            case R.id.button_builtIt:
                text=text+"Build It Bigger App!";
                break;

            case R.id.button_xyzReader:
                text=text+"XYZ Reader App!";
                break;
            case R.id.button_myApp:
                text=text+"my capston app!";
                break;



        }




        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
