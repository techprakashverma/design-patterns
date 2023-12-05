package com.pv.dp.singleton.multithreading;

import java.io.Serializable;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        //private no argument constructor
    }

    /*public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }*/

    /** Double-checked locking */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
