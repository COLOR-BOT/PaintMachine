package com.tinkerlog.printclient.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.tinkerlog.printclient.R;
import com.tinkerlog.printclient.util.FontCache;

/**
 * Created by alex on 24.08.15.
 */
public class CustomButton extends Button {

    public CustomButton(Context context) {
        super(context);
        initialize(context, null);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    private void initialize(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        String fontName = a.getString(R.styleable.CustomTextView_fontName);
        if (fontName != null) {
            Typeface tf = FontCache.getFont(context, fontName);
            setTypeface(tf);
        }
        a.recycle();
    }

}
