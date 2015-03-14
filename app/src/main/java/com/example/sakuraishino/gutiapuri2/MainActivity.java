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




public class MainActivity extends Activity implements OnClickListener {
 //public class MainActivity extends ActionBarActivity {


     private TextView hukidasiTextView;
     private Button sousinButton;
     private String[] comment;
     private Button home;
     private EditText text;
    //MediaPlayer mp = null;



     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         //mp = MediaPlayer.create(this, R.raw.chik-cry1);

         text  = (EditText)findViewById(R.id.editText);

         home = (Button) findViewById(R.id.home);
         home.setOnClickListener(this);



         sousinButton = (Button) findViewById(R.id.sousin);
         hukidasiTextView = (TextView) findViewById(R.id.hukidasi);

         sousinButton.setOnClickListener(this);

         comment = new String[]{"分\nか\nる\nよ\n", "そ\nい\nう\nい\nう\nの\nあ\nる\nよ\nね\n", "お\n疲\nれ\n様\n", "大\n変\nだ\nよ\nね\n"};

         sousinButton.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 Random r = new Random();
                 hukidasiTextView.setText(comment[r.nextInt(4)]);
                 hukidasiTextView.setVisibility(View.VISIBLE);

                 Nikki n = new Nikki();
                 n.comment = text.getText().toString();

                 n.save();

                 text.setText("");

              // if (mp.isPlaying()) { //再生中

                //     mp.stop();
                  //   try {
                    //     mp.prepare();
                     //} catch (IllegalStateException e) {
                      //   e.printStackTrace();
                     //} catch (IOException e) {
                       //  e.printStackTrace();
                     //}

             }


         });


     }//}

     public void onClick(View v) {

         if (v == home) {
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



