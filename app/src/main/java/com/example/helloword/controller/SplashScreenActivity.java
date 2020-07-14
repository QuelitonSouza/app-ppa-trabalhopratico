package com.example.helloword.controller;


import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloword.R;
import com.example.helloword.model.PersonModel;


public class SplashScreenActivity extends AppCompatActivity {
    private final int TIME_DELAY = 4000;
    private static final String FIRST_USED = "primeiraVez";
    private PersonModel persons = new PersonModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView txtName = (TextView) findViewById(R.id.txtName);
        txtName.setText(persons.personPrincipal);

        boolean primeiraVez = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean(FIRST_USED, true);
        //primeiraVez = true;
        if (primeiraVez) {
            PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                    .edit()
                    .putBoolean(FIRST_USED, false)
                    .commit();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ShowMain();
                }
            }, TIME_DELAY);

            Toast.makeText(this, "Bem-Vindo ao Trabalho Prático", Toast.LENGTH_SHORT).show();
        } else {
            ShowMain();
        }
    }

    private void ShowMain()
    {
        Intent mainIntent = new Intent( SplashScreenActivity.this, MainActivity.class);
        startActivity(mainIntent);
        finish();
    }
}
