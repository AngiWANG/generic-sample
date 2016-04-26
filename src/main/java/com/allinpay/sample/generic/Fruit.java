package com.allinpay.sample.generic;

import java.util.List;

/**
 * Created by Angi on 2016/4/21.
 */
public class Fruit {
    /**
     * 泛型方法示例
     *
     * @param a
     * @param <T>
     * @return
     */
    public <T> T a(T a) {
        T b = a;
        return b;
    }
}
