package com.pv.dp.factory;

public abstract class Database {

    private String driverName;
    private String userName;

    public String getDriverName() {
        return driverName;
    }

    public Database setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Database setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public void getConnectionDetails(){
        System.out.println("DriverName::"+driverName);
        System.out.println("UserName::"+userName);
    }
}
