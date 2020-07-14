package com.example.helloword.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BateryLowBroadcastActivity extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Atenção!!! Bateria Fraca.", Toast.LENGTH_SHORT).show();
    }
}
