package com.pv.dp.chainresponsbility.oneOrMoreReceivers;

public class ATM {

    private static HunderdRsHandler hunderdRsHandler = new HunderdRsHandler();
    private static FiftyRsHandler fiftyRsHandler = new FiftyRsHandler();
    private static TwentyRsHandler twentyRsHandler = new TwentyRsHandler();
    private static FiveRsHandler fiveRsHandler = new FiveRsHandler();

    static {
        hunderdRsHandler.nextHandler(fiftyRsHandler);
        fiftyRsHandler.nextHandler(twentyRsHandler);
        twentyRsHandler.nextHandler(fiveRsHandler);
    }

    public void withdraw(long requestAmount){
        hunderdRsHandler.dispatchRs(requestAmount);
    }


}
