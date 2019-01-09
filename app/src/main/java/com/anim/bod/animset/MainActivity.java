package com.anim.bod.animset;

import android.content.Intent;
import android.graphics.PointF;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.anim.bod.animset.adapter.CircleLL;
import com.anim.bod.animset.adapter.MenuCircleAdapter;
import com.anim.bod.animset.jetpack.Demo;
import com.anim.bod.animset.jetpack.DemoSingle;
import com.anim.bod.animset.jetpack.JetPackActivity;

import java.lang.annotation.Inherited;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    private boolean isPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleLL circleLL = new CircleLL(this);

        MenuCircleAdapter menuCircleAdapter = new MenuCircleAdapter(Arrays.asList("1","2"),this);
        circleLL.setiMenuAdapter(menuCircleAdapter);

        ViewGroup viewById = findViewById(R.id.bezierview);
        viewById.addView(circleLL);
//        startActivity( new Intent(this, JetPackActivity.class));

        DemoSingle.getInstance().setDemo(new Demo());
        try {
            Demo demo = DemoSingle.getInstance().getDemo();
            Demo demo1 = DemoSingle.getInstance().getDemo();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        final ImageView imageView = findViewById(R.id.imageview);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doAnim(imageView);
            }
        });

    }

    private void doAnim(ImageView imageView) {
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
//        if (!isPlaying) {
//            animationDrawable.start();
//        }else {
//            animationDrawable.stop();
//        }
    }


}
