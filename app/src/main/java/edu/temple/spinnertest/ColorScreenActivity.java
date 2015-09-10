package edu.temple.spinnertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ColorScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_screen);

        Intent receivedIntent = getIntent();
        int colorChoice = receivedIntent.getIntExtra("Color", 0);

        View colorView = findViewById(R.id.layoutVeiw);

        switch(colorChoice){
            case 0:
                colorView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                break;
            case 1:
                colorView.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
                break;
            case 2:
                colorView.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color_screen, menu);
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
}
