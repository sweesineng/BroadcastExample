package com.homenas.broadcastexample;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.homenas.broadcastexample.receiver.AirplaneModeReceiver;
import com.homenas.broadcastexample.receiver.WifiModeReceiver;

public class MainActivity extends AppCompatActivity {
    AirplaneModeReceiver AReceiver;
    WifiModeReceiver WReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Airplane mode receiver
        AReceiver = new AirplaneModeReceiver();
        registerReceiver(AReceiver, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        // Wifi mode receiver
        WReceiver = new WifiModeReceiver();
        registerReceiver(WReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }
}
