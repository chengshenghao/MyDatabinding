package com.tcsl.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tcsl.myapplication.bean.ObservableGoods;
import com.tcsl.myapplication.databinding.ActivityMain4Binding;

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/7/19 13: 31
 */

public class Main4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain4Binding activityMain4Binding = DataBindingUtil.setContentView(this, R.layout.activity_main4);
        ObservableGoods observableGoods = new ObservableGoods("名字", "详情", 12);
        activityMain4Binding.setGoods(observableGoods);
    }
}
