package com.pv.dp.factory;

public class DatabaseFactory {

    public DatabaseFactory() throws IllegalAccessException {
        throw new IllegalAccessException("Object creation not possible for this class!...");
    }

    public static Database createDatabaseObject(DatabaseType databaseType){
        switch (databaseType){
            case MYSQL:
                return new MySql();
            case ORACLE:
                return new Oracle();
            case MONGO:
                return new Mongo();
            default:
                return null;
        }
    }
}
