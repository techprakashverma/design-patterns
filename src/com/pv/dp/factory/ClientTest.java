package com.pv.dp.factory;

public class ClientTest {

    public static void main(String[] args) {
        Database database = DatabaseFactory.createDatabaseObject(DatabaseType.values()[0]);
        System.out.println(database);
        database.getConnectionDetails();
    }
}
