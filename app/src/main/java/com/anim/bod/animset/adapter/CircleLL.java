package com.anim.bod.animset.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.view.menu.MenuAdapter;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CircleLL extends LinearLayout {
    public CircleLL(Context context) {
        super(context);
    }

    public CircleLL(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleLL(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private MenuCircleAdapter iMenuAdapter;

    public MenuCircleAdapter getiMenuAdapter() {
        return iMenuAdapter;
    }

    //负责数据和ui绑定的
    public void setiMenuAdapter(MenuCircleAdapter iMenuAdapter) {
        this.iMenuAdapter = iMenuAdapter;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initBuilder();

    }

    private void initBuilder() {
        if (iMenuAdapter!=null){
            for (int i = 0; i < iMenuAdapter.getCount(); i++) {
               TextView textView = (TextView) iMenuAdapter.getView(i);
               iMenuAdapter.bindData(textView,i);
               addView(textView);
            }
        }
    }
}
