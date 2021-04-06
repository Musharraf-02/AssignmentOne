package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class colorsActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
    }

    public void switchToMainActivity(View view) {
        finish();
    }

    public void listenGreen(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.green);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTeal(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.teal);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenIndigo(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.indigo);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenBlue(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.blue);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenPurple(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.purple);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenLightGreen(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.lightgreen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenLime(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.lime);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenLightBlue(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.lightblue);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenCyan(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.cyan);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenDeepPurple(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.deeppurple);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenYellow(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.yellow);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenOrange(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.orange);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenBrown(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.brown);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenGray(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.grey);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenAmber(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.amber);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenDeepOrange(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.deeporange);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenRed(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.red);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenDeepBrown(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.deepbrown);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}