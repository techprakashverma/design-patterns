package com.pv.dp.observerpattern.observer;

import com.pv.dp.observerpattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    private String userName;
    private StockObservable stockObservable;


    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(userName,"Product is in-stock hurry up!");

    }

    private void sendMail(String userName,String mes){
        // get the email address from the db by using the given userName
        String email = userName;
        System.out.println("Mail send to:"+email);
        //send the actual email to the end user
    }
}
