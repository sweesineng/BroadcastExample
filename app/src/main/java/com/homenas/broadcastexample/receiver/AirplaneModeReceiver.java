package com.homenas.broadcastexample.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;

/**
 * Created by engss on 17/10/2017.
 */

public class AirplaneModeReceiver extends BroadcastReceiver {
    static final String TAG = "broadcastexample";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().intern().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
            if(isAirplaneModeOn(context)) {
                Log.i(TAG, "AIRPLANE Mode Change: On " + intent.getAction());
            }else{
                Log.i(TAG, "AIRPLANE Mode Change: Off "+ intent.getAction());
            }
        }
    }

    private static boolean isAirplaneModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }
}
