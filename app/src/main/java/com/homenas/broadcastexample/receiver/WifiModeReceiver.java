package com.homenas.broadcastexample.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by engss on 17/10/2017.
 */

public class WifiModeReceiver extends BroadcastReceiver {
    static final String TAG = "broadcastexample";
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager conMan = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMan.getActiveNetworkInfo();
        if (netInfo != null && netInfo.getType() == ConnectivityManager.TYPE_WIFI)
            Log.i(TAG, "Have Wifi Connection");
        else
            Log.i(TAG, "Don't have Wifi Connection");
        if (netInfo != null && netInfo.getType() == ConnectivityManager.TYPE_MOBILE)
            Log.i(TAG, "Have LTE Connection");
        else
            Log.i(TAG, "Don't have LTE Connection");
    }
}
