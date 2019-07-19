package com.tcsl.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * 描述:一个纯净的 ViewModel 类被更新后，并不会让 UI 自动更新。而数据绑定后，
 * 我们自然会希望数据变更后 UI 会即时刷新，Observable 就是为此而生的概念
 * <p/>作者：ss
 * <br/>创建时间：2019/7/18 10: 58
 */

public class Goods extends BaseObservable {
    /**
     * 如果是 public 修饰符，则可以直接在成员变量上方加上 @Bindable 注解
     * 该 BR 的生成通过注释 @Bindable 生成，可以通过 BR notify 特定属性关联的视图
     */
    @Bindable
    private String name;
    /**
     * 如果是 private 修饰符，则在成员变量的 get 方法上添加 @Bindable 注解
     */
    private String details;
    private float price;

    public Goods(String name, String details, float price) {
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
