package com.pv.dp.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InvocationTargetException {

        SingletonRefl singletonReflDemo = SingletonRefl.getInstance();
        System.out.println("SingletonOrglObj::"+singletonReflDemo.hashCode());

        Class<?> singletonClass = Class.forName("com.singleton.reflection.SingletonReflDemo");
        Constructor<SingletonRefl> constructor = (Constructor<SingletonRefl>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        SingletonRefl singletonReflObj = constructor.newInstance();



        System.out.println("SingletonReflObj::"+singletonReflObj.hashCode());

    }
}
