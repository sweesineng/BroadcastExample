package com.homenas.broadcastexample.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by engss on 17/10/2017.
 */

public class SdCardReceiver extends BroadcastReceiver {
    static final String TAG = "broadcastexample";
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(Intent.ACTION_MEDIA_MOUNTED.equals(action)) {
            Log.i(TAG,"Mounted");
        }
        if(Intent.ACTION_MEDIA_UNMOUNTED.equals(action)) {
            Log.i(TAG,"Unmounted");
        }
        if(Intent.ACTION_MEDIA_EJECT.equals(action)) {
            Log.i(TAG,"EJECT");
        }
    }
}
