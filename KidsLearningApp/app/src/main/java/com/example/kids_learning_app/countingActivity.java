package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class countingActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);
    }

    public void switchToMainActivity(View view) {
       finish();
    }

    public void listenOne(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.one);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwo(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.two);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenThree(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.three);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenFour(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.four);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenFive(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.five);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenSix(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.six);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenSeven(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.seven);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenEight(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.eight);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenNine(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.nine);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTen(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.ten);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenEleven(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.eleven);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwelve(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twelve);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenThirteen(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.thirteeen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenFourteen(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.fourteen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenFifteen(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.fifteen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenSixteen(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.sixteen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenSeventeen(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.seventeen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenEighteen(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.eighteen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenNineteen(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.nineteen);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwenty(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twenty);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentyOne(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentyone);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentyTwo(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentytwo);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentyThree(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentythree);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentyFour(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentyfour);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentyFive(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentyfive);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

    }

    public void listenTwentySix(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentysix);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentySeven(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentyseven);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentyEight(View view) {
        view.setRotationX(0);
        view.animate().rotationX(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentyeight);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenTwentyNine(View view) {
        view.setRotationY(0);
        view.animate().rotationY(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.twentynine);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void listenThirty(View view) {
        view.setRotation(0);
        view.animate().rotation(360).setDuration(1000);
        mp=MediaPlayer.create(this,R.raw.thirty);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}