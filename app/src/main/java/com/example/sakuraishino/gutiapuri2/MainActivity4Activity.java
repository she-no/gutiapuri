package com.example.sakuraishino.gutiapuri2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.activeandroid.query.Select;

import java.util.ArrayList;
import java.util.List;


public class MainActivity4Activity extends Activity {
     ListView list;
    ArrayAdapter<String> adapter;
    ArrayList<String> arr;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4);

        list = (ListView) findViewById(R.id.list);
        arr = new ArrayList<>();

        List<Nikki> itemList = new Select().from(Nikki.class).execute();
        for (Nikki i : itemList) {
            arr.add(i.comment);
        }
        adapter = new ArrayAdapter<>(
                getApplicationContext(),
                R.layout.item_row,
                arr

        );
     list.setAdapter(adapter);
    }

}
