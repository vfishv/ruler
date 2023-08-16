package com.example.zhixuanlai.ruler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        RulerView rulerView = (RulerView) findViewById(R.id.ruler_view);
        rulerView.setUnitType(RulerView.Unit.CM);

        setSupportActionBar(toolbar);
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
            RulerView rulerView = (RulerView) findViewById(R.id.ruler_view);
            if (rulerView.getUnitType() == RulerView.Unit.INCH) {
                rulerView.setUnitType(RulerView.Unit.CM);
            } else {
                rulerView.setUnitType(RulerView.Unit.INCH);
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
