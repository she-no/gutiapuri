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


public class MainActivity3Activity extends Activity implements OnClickListener {
//public class MainActivity3Activity extends ActionBarActivity {



    private TextView hukidasiTextView;
    private Button sousinButton;
    private String[] comment;
    private Button home3;
    private EditText text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);

        text3  = (EditText)findViewById(R.id.editText);

        home3 = (Button) findViewById(R.id.home3);
        home3.setOnClickListener(this);


        sousinButton = (Button) findViewById(R.id.sousin);
        hukidasiTextView = (TextView) findViewById(R.id.hukidasi);

        comment = new String[]{"こ\nれ\nで\nい\nい\nの\nだ\n", "笑\nえ\nば\nい\nい\nと\n思\nう\nよ\n", "坊\nや\nだ\nか\nら\nさ\n", "真\n実\nは\nい\nつ\nも\n一\nつ\n"};


        sousinButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Random r = new Random();
                hukidasiTextView.setText(comment[r.nextInt(4)]);
                hukidasiTextView.setVisibility(View.VISIBLE);

                text3.setText("");

            }


        });
    }

    public void onClick(View v) {

        if (v == home3) {
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

