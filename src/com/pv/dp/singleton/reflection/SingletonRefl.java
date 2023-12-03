package com.pv.dp.singleton.reflection;

public class SingletonRefl {
    private static SingletonRefl instance;

    private SingletonRefl() {
        //private no argument constructor
        if(instance == null) {
            throw new IllegalStateException("Object con't be create using reflection");
        }
    }

    public static SingletonRefl getInstance() {


        if(instance == null) {
            instance = new SingletonRefl();
        }

        return instance;
    }
}
