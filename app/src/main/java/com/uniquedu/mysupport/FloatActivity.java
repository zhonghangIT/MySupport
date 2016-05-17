package com.uniquedu.mysupport;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class FloatActivity extends AppCompatActivity {

    @InjectView(R.id.floatbutton)
    FloatingActionButton floatbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.floatbutton)
    public void onClick() {
    }
}
