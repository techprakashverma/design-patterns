package com.pv.dp.singleton.serialization;

import java.io.*;

public class SerializetionTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, FileNotFoundException {
        SingletonSerialize originalObj = SingletonSerialize.getInstance();

        System.out.println("Original Object ::"+originalObj.hashCode());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("SerializationSingletonFile.ser"));
        objectOutputStream.writeObject(originalObj);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("SerializationSingletonFile.ser"));
        SingletonSerialize serializeObj = (SingletonSerialize) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println("Serialize Object ::"+serializeObj.hashCode());
    }

}
