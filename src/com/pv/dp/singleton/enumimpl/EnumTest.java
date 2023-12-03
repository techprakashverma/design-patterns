package com.pv.dp.singleton.enumimpl;

public class EnumTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.GETINSTANCE;
        Singleton singleton2 = Singleton.GETINSTANCE;

        System.out.println(singleton1.hashCode());
        System.out.println(singleton1.hashCode());

        System.out.println(singleton1.testMethod());
    }
}
