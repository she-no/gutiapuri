package com.example.sakuraishino.gutiapuri2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SubActivity extends Activity implements OnClickListener {

    private Button kiite;
    private Button omosiroi;
    private Button satori;
    private Button nikki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        kiite = (Button) findViewById(R.id.kiite);
        kiite.setOnClickListener(this);

        omosiroi = (Button) findViewById(R.id.omosiroi);
        omosiroi.setOnClickListener(this);

        satori = (Button) findViewById(R.id.satori);
        satori.setOnClickListener(this);

        nikki = (Button) findViewById(R.id.nikki);
        nikki.setOnClickListener(this);
    }


    public void onClick(View v) {

        if(v==kiite){
            Intent intent = new Intent(this, MainActivity.class);
            startActivityForResult(intent, 0);
        }

        if(v==omosiroi){
            Intent intent = new Intent(this, MainActivity2Activity.class);
            startActivityForResult(intent, 0);
        }

        if(v==satori){
            Intent intent = new Intent(this, MainActivity3Activity.class);
            startActivityForResult(intent, 0);
        }

        if(v==nikki){
            Intent intent = new Intent(this, MainActivity4Activity.class);
            startActivityForResult(intent, 0);
        }

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub, menu);
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

