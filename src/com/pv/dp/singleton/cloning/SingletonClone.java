package com.pv.dp.singleton.cloning;

public class SingletonClone implements Cloneable{


    private static SingletonClone instance;

    private SingletonClone()
    {
        //no argument constructor
    }

    public static SingletonClone getInstance() {

        if(instance == null) {
            instance = new SingletonClone();
        }

        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        throw new CloneNotSupportedException();
    }
}