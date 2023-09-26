package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
String arr[]={"This is ","Item","Item2"};          // Data Source

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  listView = findViewById(R.id.listView);
        ArrayAdapter ad=new ArrayAdapter(this , android.R.layout.simple_list_item_1,arr);
//listView.setAdapter(ad);
//        MyAdapter ad=new MyAdapter(this,R.layout.my_kunal_layout,arr);
        listView.setAdapter(ad);
        listView.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
                    public void onItemClick(AdapterView<?> adapterView, View view,int i,long l)
            {
                Toast.makeText(MainActivity.this, "You Clicked On "+i, Toast.LENGTH_SHORT).show();
            }
        }

    }

}