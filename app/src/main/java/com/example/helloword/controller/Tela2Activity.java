package com.example.helloword.controller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.helloword.R;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("strName")!= null)
        {
            TextView txtName = findViewById(R.id.txtName);
            txtName.setText(bundle.getString("strName"));
        }
    }
}
