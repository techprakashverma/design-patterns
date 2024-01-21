package com.pv.dp.observerpattern.observable;

import com.pv.dp.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList;
    public int stockCount = 0;

    public IphoneObservableImpl() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        int index = observerList.indexOf(observer);
        if(index > 0){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0 && newStockAdded > 0){
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;

        /** This's just for testing */
        if(stockCount == 0){
            System.out.println("Oops! Item is Out of Stock! Please click on 'Notify Me' ");
        }
    }

    @Override
    public int getStockCount() {
        System.out.println("iphone stock count:"+stockCount);
        return stockCount;
    }
}
