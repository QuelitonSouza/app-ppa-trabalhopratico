package com.example.helloword.controller;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloword.R;
import com.example.helloword.model.PersonModel;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private PersonModel persons = new PersonModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtName = findViewById(R.id.txtName);
        txtName.setText(persons.personPrincipal);
        Button openView = (Button) findViewById(R.id.btnOpenView);
        openView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela2Activity.class);
                it.putExtra("strName", persons.personPrincipal);
                startActivity(it);
            }
        });

        //Toast.makeText(getApplicationContext(),"onCreate", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate" );
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        //Toast.makeText(getApplicationContext(),"onStart", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart" );
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        //Toast.makeText(getApplicationContext(),"onResume", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume" );
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        //Toast.makeText(getApplicationContext(),"onRestart", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart" );
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        //Toast.makeText(getApplicationContext(),"onPause", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause" );
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        // Toast.makeText(getApplicationContext(),"onStop", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop" );
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        //Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy" );
    }
}
