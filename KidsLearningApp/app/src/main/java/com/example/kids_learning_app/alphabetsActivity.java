package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class alphabetsActivity extends AppCompatActivity {


    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
    }

    public void switchToMainActivity(View view) {
        finish();
    }

    public void listenA(View view) {

        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.a);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenB(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.b);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenC(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.c);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenD(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.d);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenE(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.e);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenF(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.f);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenG(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.g);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenH(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.h);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenI(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.i);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenJ(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.j);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenK(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.k);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenL(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.l);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenM(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.m);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenN(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.n);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenO(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.o);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenP(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.p);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenQ(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.q);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenR(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.r);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenS(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.s);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenT(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.t);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenU(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.u);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenV(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.v);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenW(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.w);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenX(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.x);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenY(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.y);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenZ(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp = MediaPlayer.create(this, R.raw.z);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}