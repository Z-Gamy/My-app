package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class text extends TextView {
    public text(Context context) {
        super(context);
    }

    public text(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public text(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
