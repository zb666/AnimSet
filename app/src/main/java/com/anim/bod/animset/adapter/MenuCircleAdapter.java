package com.anim.bod.animset.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MenuCircleAdapter implements IMenuAdapter {

    private List<String> url;

    private Context mContext;

    public MenuCircleAdapter(List<String> url, Context mContext) {
        this.url = url;
        this.mContext = mContext;
    }

    @Override
    public View getView(int position) {
        TextView textView = new TextView(mContext);
        return textView;
    }

    @Override
    public void bindData(int pos) {

    }

    @Override
    public void bindData(TextView textView, int count) {
       textView.setText(url.get(count));
    }

    @Override
    public int getCount() {
        return url.size();
    }


}
