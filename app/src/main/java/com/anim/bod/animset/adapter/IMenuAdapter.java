package com.anim.bod.animset.adapter;

import android.view.View;
import android.widget.TextView;

public interface IMenuAdapter {

    View getView(int position);

    void bindData(int pos);

    void bindData(TextView textView, int count);

    int getCount();
}
