package com.pv.dp.singleton.simple;

import java.io.Serializable;

public class CompleteSingleton implements Cloneable, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private static CompleteSingleton instance;

    private CompleteSingleton() {
        // no argument constructor
        if (instance == null) {
            throw new IllegalStateException("Object con't be create by using reflection");
        }
    }

    public static CompleteSingleton getInstance() {

        if (instance == null) {
            synchronized (CompleteSingleton.class) {
                if (instance == null) {
                    instance = new CompleteSingleton();
                }
            }
        }

        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone();
        throw new CloneNotSupportedException("Object con't be create using the clone");
    }
}
