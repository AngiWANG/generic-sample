package com.allinpay.sample.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Angi on 2016/4/21.
 */
public class WildcardExtendsGeneric {
    public static  void main(String[] args){
        List<GreenApple> greenApples = new ArrayList<GreenApple>();
//        GreenApple是Apple的之类，所以可以赋值
        List<? extends Apple> apples = greenApples;
        // 无法add任何实例
//        apples.add(new Object());
//        apples.add(new Fruit());
//        apples.add(new GreenApple())
//        apples.add(new Apple());

//        apples.addAll(new ArrayList<Apple>());
//        可以添加null
        apples.add(null);
        System.out.println(apples.size());

        // 只能获取，且获取的实例默认类型为父类
        Apple apple = apples.get(0);
    }
}
