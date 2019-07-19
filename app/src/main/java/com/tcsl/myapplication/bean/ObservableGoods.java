package com.tcsl.myapplication.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.tcsl.myapplication.BR;

/**
 * 描述:一个纯净的 ViewModel 类被更新后，并不会让 UI 自动更新。而数据绑定后，
 * 我们自然会希望数据变更后 UI 会即时刷新，Observable 就是为此而生的概念
 * <p/>作者：ss
 * <br/>创建时间：2019/7/18 10: 58
 */

public class ObservableGoods extends BaseObservable {
    @Bindable
    private String name;
    private String details;
    private float price;

    public ObservableGoods(String name, String details, float price) {
        this.name = name;
        this.details = details;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //只更新本字段
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
        //更新所有字段
        notifyChange();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
