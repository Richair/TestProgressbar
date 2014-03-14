package com.example.testprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SweepPieView extends View {
	private Paint mPaints[] =new  Paint[4];
	private boolean mUseCenters[] =new boolean[4];
	private float mBigOval =0;
	private int mBigIndex =0;
	public SweepPieView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	public SweepPieView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public SweepPieView(Context context) {
		super(context);
		init();
	}

	private void init(){
//		1. 填充圆弧但不含圆心：

		mPaints[0] = new Paint();
		mPaints[0].setAntiAlias(true);
		mPaints[0].setStyle(Paint.Style.FILL);
		mPaints[0].setColor(0x88FF0000);
		mUseCenters[0] = false;
//		2. 填充圆弧带圆心（扇形）
		 	
		mPaints[1] = new Paint(mPaints[0]);
		mPaints[1].setColor(0x8800FF00);
		mUseCenters[1] = true;
//		3. 只绘圆周，不含圆心
		 	
		mPaints[2] = new Paint(mPaints[0]);
		mPaints[2].setStyle(Paint.Style.STROKE);
		mPaints[2].setStrokeWidth(4);
		mPaints[2].setColor(0x880000FF);
		mUseCenters[2] = false;
//		4. 只绘圆周，带圆心（扇形）
		 	
		mPaints[3] = new Paint(mPaints[2]);
		mPaints[3].setColor(0x88888888);
		mUseCenters[3] = true;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
//		canvas.drawColor(Color.WHITE);
//		 
//		 drawArcs(canvas, mBigOval, mUseCenters[mBigIndex],
//		 mPaints[mBigIndex]);
//		 
//		 for (int i = 0; i < 4; i++) {
//		 drawArcs(canvas, mOvals[i], mUseCenters[i], mPaints[i]);
//		 }
//		 
//		 mSweep += SWEEP_INC;
//		 if (mSweep > 360) {
//		 mSweep -= 360;
//		 mStart += START_INC;
//		 if (mStart >= 360) {
//		 mStart -= 360;
//		 }
//		 mBigIndex = (mBigIndex + 1) % mOvals.length;
//		 }
//		 invalidate();
		
	}


}
