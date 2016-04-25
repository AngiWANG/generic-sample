package com.allinpay.sample.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Angi on 2016/4/21.
 */
public class WildcardGeneric {
    public static  void main(String[] args){
        List<GreenApple> greenApples = new ArrayList<GreenApple>();
        List<?> apples = greenApples;
        // 无法add任何实例
//        apples.add(new Object());
//        apples.add(new Fruit());
//        apples.add(new GreenApple())
//        apples.add(new Apple());
        apples.add(null);

        // 只能获取，且获取的实例类型默认为Object
        Object fruit = apples.get(0);
    }
}
