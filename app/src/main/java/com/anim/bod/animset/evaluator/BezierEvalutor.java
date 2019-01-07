package com.anim.bod.animset.evaluator;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import android.util.TypedValue;

import com.anim.bod.animset.utils.BezierUtil;

public class BezierEvalutor implements TypeEvaluator<PointF> {

    private PointF mFlagPoint;

    public BezierEvalutor(PointF mFlagPoint) {
        this.mFlagPoint = mFlagPoint;
    }

    @Override
    public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
        return BezierUtil.CalculateBezierPointForQuadratic(fraction,startValue,mFlagPoint,endValue);
    }

}
