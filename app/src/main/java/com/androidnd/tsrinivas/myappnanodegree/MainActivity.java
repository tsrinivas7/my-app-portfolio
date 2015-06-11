package com.androidnd.tsrinivas.myappnanodegree;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void launchSpotifyApp(View v) {
       showToast("This button will launch my Spotify Streamer App!");
    }

    public void launchScoresApp(View v) {
        showToast("This button will launch my Scores App!");
    }

    public void launchLibraryApp(View v) {
        showToast("This button will launch my Library App!");
    }

    public void launchBuildItBiggerApp(View v) {
        showToast("This button will launch my Buidl it Bigger App!");
    }

    public void launchXYZReaderApp(View v) {
        showToast("This button will launch my XYZ Reader App!");
    }

    public void launchCapstoneApp(View v) {
        showToast("This button will launch my Capstone project App!");
    }

    public void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
}
