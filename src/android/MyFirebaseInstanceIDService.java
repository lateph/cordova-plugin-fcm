package com.gae.scaffolder.plugin;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

/**
 * Created by Felipe Echanique on 08/06/2016.
 */
public class MyFirebaseInstanceIDService extends FirebaseMessagingService {

    private static final String TAG = "FCMPlugin";

    @Override
    public void onNewToken(String token){
      FCMPlugin.sendTokenRefresh( token );
      Log.d(TAG, "Refreshed token: " + token);
    }
}
