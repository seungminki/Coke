package com.cookandroid.hellocoke;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    ImageView view1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        view1 = (ImageView) findViewById(R.id.view2);


        //버튼 1 애니메이션
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator anim = ObjectAnimator.ofFloat(view1, "translationY", 500f);
                anim.setDuration(500);
                anim.setRepeatCount(ObjectAnimator.INFINITE);
                anim.setRepeatCount(-1);
                anim.setRepeatCount(ObjectAnimator.REVERSE);




                anim.start();




            }

        });


    }

}