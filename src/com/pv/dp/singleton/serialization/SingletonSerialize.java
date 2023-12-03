package com.pv.dp.singleton.serialization;

import java.io.Serializable;

public class SingletonSerialize implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private static SingletonSerialize instance;

    private SingletonSerialize() {

    }

    public static SingletonSerialize getInstance() {

        if(instance == null) {
            instance = new SingletonSerialize();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

}
