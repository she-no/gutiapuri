package com.example.sakuraishino.gutiapuri2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;



public class MainActivity2Activity extends Activity implements OnClickListener {
//public class MainActivity2Activity extends ActionBarActivity {



    private TextView hukidasiTextView;
    private Button sousinButton;
    private String[] comment;
    private Button home2;
    private EditText text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        text2  = (EditText)findViewById(R.id.editText);

        home2 = (Button) findViewById(R.id.home2);
        home2.setOnClickListener(this);


        sousinButton = (Button) findViewById(R.id.sousin);
        hukidasiTextView = (TextView) findViewById(R.id.hukidasi);

        comment = new String[]{"洒\n落\nを\nい\nい\nな\n洒\n落\n", "ネ\nギ\nを\n値\n切\nれ\n", "こ\nれ\nお\n金\nか\nね\n？\n", "猫\nが\n寝\n込\nむ\n"};

        sousinButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Random r = new Random();
                hukidasiTextView.setText(comment[r.nextInt(4)]);
                hukidasiTextView.setVisibility(View.VISIBLE);

                text2.setText("");

            }


        });
    }

    public void onClick(View v) {

        if (v == home2) {
            Intent intent = new Intent(this, SubActivity.class);
            startActivityForResult(intent, 0);
        }
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

