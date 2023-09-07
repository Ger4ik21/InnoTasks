package com.javawork.designapptasks.javaclasses;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;


public class ColorSwitchView extends View {
    private final int[] colors = new int[]{Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN,
            Color.MAGENTA, Color.GRAY, Color.BLACK, Color.WHITE, Color.DKGRAY};
    private int currentIndex = 0;
    private Paint paint;

    public int getCurrentIndex() {
        return currentIndex;
    }

    public Paint getPaint() {
        return paint;
    }

    public ColorSwitchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(colors[currentIndex]);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) / 2;

        canvas.drawCircle(centerX, centerY, radius, paint);
    }

    public void setPreviousColor() {
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = colors.length - 1;
        }
        updateColor();
    }

    public void setNextColor() {
        currentIndex++;
        if (currentIndex >= colors.length) {
            currentIndex = 0;
        }
        updateColor();
    }

    private void updateColor() {
        paint.setColor(colors[currentIndex]);
        invalidate();
    }
}



