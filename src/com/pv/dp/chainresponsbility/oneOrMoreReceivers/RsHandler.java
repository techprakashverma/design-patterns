package com.pv.dp.chainresponsbility.oneOrMoreReceivers;

public abstract class RsHandler {
    RsHandler rsHandler;

    public void nextHandler(RsHandler rsHandler){
        this.rsHandler=rsHandler;
    }

    public abstract void dispatchRs(long requestAmount);
}
