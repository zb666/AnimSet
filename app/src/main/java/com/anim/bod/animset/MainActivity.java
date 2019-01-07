package com.anim.bod.animset;

import android.content.Intent;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.anim.bod.animset.adapter.CircleLL;
import com.anim.bod.animset.adapter.MenuCircleAdapter;
import com.anim.bod.animset.jetpack.JetPackActivity;

import java.lang.annotation.Inherited;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

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
    }


}
