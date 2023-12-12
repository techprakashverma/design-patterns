package com.pv.dp.factory;

public class MySql extends Database{
    public MySql() {
        setDriverName("mysql@driver");
        setUserName("mysql@12345");
    }
}
