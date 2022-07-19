package com.myapplicationdev.android.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AndroidVersion> alAndroidVersions;
    ListView lv;
//    ArrayAdapter<AndroidVersion> aaAndroidVersions;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        alAndroidVersions = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);


//        Android item1 = new Android("Pie", "9.0");
//        Android item2 = new Android("Oreo", "8.0 - 8.1");
//        Android item3 = new Android("Nougat", "7.0 - 7.1.2");

//        al.add("API 16-18: Jellybean (Android 4.1-4.3)");
//        al.add("API 19-20: Kitkat (Android 4.4-4.4W)");
//        al.add("API 21-22: Lollipop (Android 5-5.1)");
//        al.add("API 23: Marshmallow (Android 6)");
//        al.add("API 24-25: Nougat (Android 7-7.1.1)");
//        al.add("API 26-27: Oreo (Android 8.0-8.1)");

//        aaAndroidVersions = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, alAndroidVersions);
//        lv.setAdapter(aaAndroidVersions);

        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersions);
        lv.setAdapter(adapter);
    }
}