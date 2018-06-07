package com.aono.uiappication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class GridLayoutActivity extends Activity {
    private GridLayout mGl;
    private Button mBtnRefresh;
    private ArrayList<View> mList = new ArrayList<>();
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        mBtnRefresh = findViewById(R.id.btn_refresh);
        mGl = findViewById(R.id.gl);
        View view1 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        final View view2 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        View view3 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        View view4 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        final View view5 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        View view6 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        View view7 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        View view8 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);
        View view9 = getLayoutInflater().inflate(R.layout.item_new_car_home, mGl, false);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(getScreenWidth(this) / 2,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        mList.add(view1);
        mList.add(view2);
        mList.add(view3);
        mList.add(view4);
        mList.add(view5);
        mList.add(view6);
        mList.add(view7);
        mList.add(view8);
        mList.add(view9);
        for (View view : mList) {
            view.setLayoutParams(lp);
        }

        mBtnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < mList.size()) {
                    mGl.addView(mList.get(index));
                    index++;
                }
            }
        });
    }

    /**
     * 获得屏幕宽度
     */
    public int getScreenWidth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.widthPixels;
    }
}
