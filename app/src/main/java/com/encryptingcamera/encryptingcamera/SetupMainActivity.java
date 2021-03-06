package com.encryptingcamera.encryptingcamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SetupMainActivity extends Activity {


    private Button btbLiveFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_main);

        btbLiveFeed = (Button)findViewById(R.id.btn_liveFeed);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setup_main, menu);
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

    public void onClickLiveFeedBtn(View view) {
        android.util.Log.i("blah",  "Test");
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();

        /*
         * Change activities through an intent.
         */
        Intent changeActivitiesIntent = new Intent(this, FullscreenCameraActivity.class);

        // If you need a bundle to pass stuff through an intent
        //Bundle bundle = new Bundle();

        // Start the activity
        startActivity(changeActivitiesIntent);

    }// end onClick
}
