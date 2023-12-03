package com.pv.dp.singleton.simple;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {
        Singleton originalInstance = Singleton.getInstance();

        Singleton duplicateInstance = Singleton.getInstance();
        System.out.println("===============================================================================");
        System.out.println("OriginalInstance ::"+originalInstance.hashCode());
        System.out.println("DuplicateInstance ::"+duplicateInstance.hashCode());

        System.out.println(originalInstance.equals(duplicateInstance));

        System.out.println(originalInstance==duplicateInstance);
        System.out.println("===============================================================================");

        System.out.println("=========================Break Down with Reflection============================");
        Singleton originalInstanceRef = Singleton.getInstance();
        System.out.println("OriginalInstance ::"+originalInstanceRef.hashCode());
        Class<?> sigletonClass = Class.forName("com.pv.dp.singleton.simple.Singleton");
        Constructor<Singleton> constructor = (Constructor<Singleton>) sigletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton newSingletonInstance = constructor.newInstance();

        System.out.println("Ref new Instance : "+newSingletonInstance.hashCode());

        System.out.println(originalInstance.equals(newSingletonInstance));

        System.out.println(originalInstance==newSingletonInstance);
        System.out.println("===============================================================================");

        System.out.println("=========================Break Down with Clone ============================");
        Singleton originalInstanceC = Singleton.getInstance();

        Singleton singletonClone = (Singleton) originalInstanceC.clone();

        System.out.println("OriginalInstance ::"+originalInstanceC.hashCode());
        System.out.println("New Clone instance:: "+singletonClone.hashCode());
        System.out.println("===============================================================================");

        System.out.println("=========================Break Down with Serialization ============================");
        /** Serialization process */
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("T:\\Java_Practice\\design-patterns\\singletonfile.ser"));
        objectOutputStream.writeObject(originalInstance);
        objectOutputStream.close();
        /** deserialization process */
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("T:\\Java_Practice\\design-patterns\\singletonfile.ser"));
        Singleton newDeserializedSingletonInstance = (Singleton) inputStream.readObject();
        inputStream.close();

        System.out.println("OriginalInstance ::"+originalInstance.hashCode());
        System.out.println("New Deserialized SingletonInstance : "+newDeserializedSingletonInstance.hashCode());
        System.out.println("===============================================================================");
    }
}
