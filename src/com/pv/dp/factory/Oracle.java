package com.pv.dp.factory;

public class Oracle extends Database{
    public Oracle() {
        setDriverName("Oracle@driver");
        setUserName("Oracle@12345");
    }
}
