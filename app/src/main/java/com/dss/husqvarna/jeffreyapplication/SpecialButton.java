package com.dss.husqvarna.jeffreyapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by ada on 22/06/16.
 */
public class SpecialButton extends Button {

    public SpecialButton(Context context) {
        super(context);
    }

    public SpecialButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SpecialButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void jeffreyMethod() {
        setText("Guess who am I?");
    };


}
