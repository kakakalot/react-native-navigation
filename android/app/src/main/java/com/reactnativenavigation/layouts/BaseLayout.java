package com.reactnativenavigation.layouts;

import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseLayout extends RelativeLayout implements Layout {

    public BaseLayout(AppCompatActivity activity) {
        super(activity);
    }

    protected AppCompatActivity getActivity() {
        return (AppCompatActivity) getContext();
    }
}
