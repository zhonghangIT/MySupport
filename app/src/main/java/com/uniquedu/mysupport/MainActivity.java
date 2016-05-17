package com.uniquedu.mysupport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.button_float)
    Button buttonFloat;
    @InjectView(R.id.button_coord)
    Button buttonCoord;
    @InjectView(R.id.button_appbar)
    Button buttonAppbar;
    @InjectView(R.id.button_appbar_custom)
    Button buttonAppbarCustom;
    @InjectView(R.id.button_drawer)
    Button buttonDrawer;
    @InjectView(R.id.button_toolbar)
    Button buttonToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.button_float, R.id.button_coord, R.id.button_appbar, R.id.button_appbar_custom, R.id.button_drawer,R.id.button_toolbar})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_float:
                startActivity(new Intent(getApplicationContext(), FloatActivity.class));
                break;
            case R.id.button_coord:
                startActivity(new Intent(getApplicationContext(), CoordLayoutActivity.class));
                break;
            case R.id.button_appbar:
                startActivity(new Intent(getApplicationContext(), AppBarActivity.class));
                break;
            case R.id.button_appbar_custom:
                startActivity(new Intent(getApplicationContext(), ScrollingActivity.class));
                break;
            case R.id.button_drawer:
                startActivity(new Intent(getApplicationContext(), DrawerActivity.class));
                break;
            case R.id.button_toolbar:
                startActivity(new Intent(getApplicationContext(), ToolBarActivity.class));
                break;
        }
    }

}
