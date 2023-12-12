package com.pv.dp.factory;

public class Mongo extends Database{
    public Mongo() {
        setDriverName("mongo@driver");
        setUserName("mongodb@123");
    }
}
