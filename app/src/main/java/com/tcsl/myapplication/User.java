package com.tcsl.myapplication;

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/7/18 09: 01
 */

public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * 若无get方法，databinding 会报错
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
