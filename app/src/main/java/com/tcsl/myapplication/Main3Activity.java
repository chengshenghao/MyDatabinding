package com.tcsl.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tcsl.myapplication.databinding.ActivityMain3Binding;

import java.util.Random;

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/7/18 10: 49
 */

public class Main3Activity extends AppCompatActivity {

    private Goods goods;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain3Binding activityMain3Binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
        goods = new Goods("code", "hi", 24);
        activityMain3Binding.setGoodsInfo(goods);
        activityMain3Binding.setGoodsHandler(new GoodsHandler());
    }

    public class GoodsHandler {

        public void changeGoodsName() {
            //由于使用的notifyPropertyChanged(BR.name)方法，price数据发生变化，但不会跟新到UI
            goods.setName("code" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            goods.setDetails("hi" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }

    }
}
