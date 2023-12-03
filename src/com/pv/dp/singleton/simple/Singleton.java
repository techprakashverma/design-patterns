package com.pv.dp.singleton.simple;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable{

    private static Singleton instance;

    private Singleton(){
        //private no argument constructor
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
