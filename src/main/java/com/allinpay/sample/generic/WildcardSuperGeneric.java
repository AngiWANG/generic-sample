package com.allinpay.sample.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angi on 2016/4/21.
 */
public class WildcardSuperGeneric {
    public static  void main(String[] args){
        List<Fruit> fruits = new ArrayList<Fruit>();
//        Fruit是Apple的父类，所以可以赋值
        List<? super Apple> apples = fruits;

        //可以赋值
        List<Apple> apple = new ArrayList<Apple>();
        apples = apple;

        //GreenApple是Apple的子类，不可以赋值
        List<GreenApple> greenApples = new ArrayList<GreenApple>();
//        apples = greenApples;

        //只能addApple及Apple的之类
        apples.add(new Apple());
        apples.add(new GreenApple());
//        apples.add(new Object());
//        apples.add(new Fruit());
        //获取的实例类型默认为Object
        Object fruit = apples.get(0);
    }
}
