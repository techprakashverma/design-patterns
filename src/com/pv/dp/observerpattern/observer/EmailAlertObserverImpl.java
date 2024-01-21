package com.pv.dp.observerpattern.observer;

import com.pv.dp.observerpattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private String emailId;
    private StockObservable stockObservable;


    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is in-stock hurry up!");

    }

    private void sendMail(String emailId,String mes){
        System.out.println("Mail send to:"+emailId);
        //send the actual email to the end user
    }
}
