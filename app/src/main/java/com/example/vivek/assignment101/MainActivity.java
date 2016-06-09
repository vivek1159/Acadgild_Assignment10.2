package com.example.vivek.assignment101;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TAG:","onCreate Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG:","contentView set");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input = (EditText)findViewById(R.id.input);
        submitButton = (Button)findViewById(R.id.submitButton);
    }

    public void onClickSubmit(View v)
    {
        Log.d("TAG:", "submit clicked");
        Bundle data = new Bundle();
        data.putString("Input", input.getText().toString());
        Log.d("TAG:", "create mf object");
        MainFragment mf = new MainFragment();
        mf.setArguments(data);

        Log.d("TAG:", "Frag Manager");
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.mainFragment,mf);
        ft.commit();
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
}
