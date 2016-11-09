package com.example.ah_lai.youdothemath;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Ah_Lai on 9 Nov 2016.
 */

public class Music {
    private static MediaPlayer mp = null;

    public static void play(Context context, int resources) {
        stop(context);
        mp = MediaPlayer.create(context, resources);
        mp.setLooping(true);
        mp.start();
    }

    // stopping music
    public static void stop(Context context) {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
