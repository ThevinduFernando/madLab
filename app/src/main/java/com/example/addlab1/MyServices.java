package com.example.addlab1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;



public class MyServices extends Service {
    private MediaPlayer player;
    @Override public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
    @Override

    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;
        //return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
        @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
