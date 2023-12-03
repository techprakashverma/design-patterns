package com.pv.dp.singleton.cloning;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonClone originalSingletonObj = SingletonClone.getInstance();
        System.out.println("OriginalSingletonObj :: "+originalSingletonObj.hashCode());

        SingletonClone singletonCloneObj = (SingletonClone) originalSingletonObj.clone();
        System.out.println("SingletonCloneObj :: "+singletonCloneObj.hashCode());
    }
}
