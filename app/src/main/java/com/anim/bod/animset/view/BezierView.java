package com.anim.bod.animset.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.anim.bod.animset.R;
import com.anim.bod.animset.evaluator.BezierEvalutor;

public class BezierView extends View implements View.OnClickListener {

    private Path mPath;
    private Paint mPaintCircle;
    private Paint mPaintPath;
    private int mStartPointX;
    private int mMovePointX;
    private int mMovePointY;
    private int mEndPointX;
    private int mEndPointY;
    private int mFlagPointX;
    private int mFlagPointY;
    private int mStartPointY;
    private Bitmap mBezierBitmap;
    private RectF rectF;


    public BezierView(Context context) {
        this(context, null);
    }

    public BezierView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BezierView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {

        mPath = new Path();
        //绘制贝塞尔曲线
        mPaintPath = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintPath.setStyle(Paint.Style.STROKE);
        mPaintPath.setStrokeWidth(8);
        //绘制圆球
        mPaintCircle = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintCircle.setStrokeWidth(5);
        mPaintCircle.setColor(Color.GREEN);

        mStartPointX = 100;
        mStartPointY = 100;

        //贝塞尔曲线上的点
        mMovePointX = mStartPointX;
        mMovePointY = mStartPointY;

        mEndPointX = 600;
        mEndPointY = 600;

        mFlagPointX = 500;
        mFlagPointY = 0;

        setOnClickListener(this);

        mBezierBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);


        rectF = new RectF();
        rectF.set(100,100,400,400);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPath.reset();
        //绘制贝塞尔曲线
        mPath.moveTo(mStartPointX,mStartPointY);
        mPath.quadTo(mFlagPointX,mFlagPointY,mEndPointX,mEndPointY);

//        canvas.drawPath(mPath,mPaintPath);

        canvas.drawCircle(mMovePointX,mMovePointY,20,mPaintCircle);

        canvas.drawArc(rectF,0f,120f,false,mPaintPath);
        canvas.drawText("65%",300,300,mPaintCircle);
    }

    @Override
    public void onClick(View v) {
        BezierEvalutor bezierEvalutor = new BezierEvalutor(new PointF(mFlagPointX, mFlagPointY));
        final ValueAnimator valueAnimator = ValueAnimator.ofObject(bezierEvalutor, new PointF(mStartPointX, mStartPointY), new PointF(mEndPointX, mEndPointY));
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                mMovePointX = (int) pointF.x;
                mMovePointY = (int) pointF.y;
                postInvalidate();
            }
        });
        valueAnimator.setDuration(500);
//        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        valueAnimator.setRepeatMode(ValueAnimator.RESTART);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.start();

    }
}
