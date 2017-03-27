package com.example.shekhar.yummyindia;

import android.content.pm.ActivityInfo;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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
            Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                    "Settings functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            return true;
        }
        if(id == R.id.action_cart){
            Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                    "Cart functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        if(id == R.id.action_account){
            Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                    "Accounts functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
