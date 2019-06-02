package com.example.admin.controltails;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    AutoCompleteTextView note1;
    AutoCompleteTextView note2;
    AutoCompleteTextView note3;
    AutoCompleteTextView note4;
    AutoCompleteTextView note5;
    AutoCompleteTextView note6;
    AutoCompleteTextView note7;
    AutoCompleteTextView note8;
    AutoCompleteTextView note9;

    SharedPreferences sPref;
    final String n1 = "n1";
    final String n2 = "n2";
    final String n3 = "n3";
    final String n4 = "n4";
    final String n5 = "n5";
    final String n6 = "n6";
    final String n7 = "n7";
    final String n8 = "n8";
    final String n9 = "n9";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        note1 = (AutoCompleteTextView) findViewById(R.id.note1);
        note2 = (AutoCompleteTextView) findViewById(R.id.note2);
        note3 = (AutoCompleteTextView) findViewById(R.id.note3);
        note4 = (AutoCompleteTextView) findViewById(R.id.note4);
        note5 = (AutoCompleteTextView) findViewById(R.id.note5);
        note6 = (AutoCompleteTextView) findViewById(R.id.note6);
        note7 = (AutoCompleteTextView) findViewById(R.id.note7);
        note8 = (AutoCompleteTextView) findViewById(R.id.note8);
        note9 = (AutoCompleteTextView) findViewById(R.id.note9);

        loadData();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                saveData();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveData();
    }

    void saveData() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(n1, note1.getText().toString());
        ed.putString(n2, note2.getText().toString());
        ed.putString(n3, note3.getText().toString());
        ed.putString(n4, note4.getText().toString());
        ed.putString(n5, note5.getText().toString());
        ed.putString(n6, note6.getText().toString());
        ed.putString(n7, note7.getText().toString());
        ed.putString(n8, note8.getText().toString());
        ed.putString(n9, note9.getText().toString());
        ed.commit();
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    void loadData()
    {
        String savedText;
        sPref = getPreferences(MODE_PRIVATE);
        savedText = sPref.getString(n1, "");
        note1.setText(savedText);
        savedText = sPref.getString(n2, "");
        note2.setText(savedText);
        savedText = sPref.getString(n3, "");
        note3.setText(savedText);
        savedText = sPref.getString(n4, "");
        note4.setText(savedText);
        savedText = sPref.getString(n5, "");
        note5.setText(savedText);
        savedText = sPref.getString(n6, "");
        note6.setText(savedText);
        savedText = sPref.getString(n7, "");
        note7.setText(savedText);
        savedText = sPref.getString(n8, "");
        note8.setText(savedText);
        savedText = sPref.getString(n9, "");
        note9.setText(savedText);
    }
}
