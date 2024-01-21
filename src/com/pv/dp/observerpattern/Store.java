package com.pv.dp.observerpattern;

import com.pv.dp.observerpattern.observable.IphoneObservableImpl;
import com.pv.dp.observerpattern.observable.StockObservable;
import com.pv.dp.observerpattern.observer.EmailAlertObserverImpl;
import com.pv.dp.observerpattern.observer.MobileAlertObserverImpl;
import com.pv.dp.observerpattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();


        NotificationAlertObserver userObserver1 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver userObserver2 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver userObserver3 = new MobileAlertObserverImpl("Prakash",iphoneStockObservable);


        iphoneStockObservable.add(userObserver1);
        iphoneStockObservable.add(userObserver2);
        iphoneStockObservable.add(userObserver3);

        iphoneStockObservable.setStockCount(5);
        iphoneStockObservable.getStockCount();

        //iphoneStockObservable.setStockCount(10);//Added more stock
        //iphoneStockObservable.getStockCount();


    }
}
