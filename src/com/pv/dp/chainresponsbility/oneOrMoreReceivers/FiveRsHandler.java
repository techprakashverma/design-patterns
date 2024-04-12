package com.pv.dp.chainresponsbility.oneOrMoreReceivers;

public class FiveRsHandler extends RsHandler{



    @Override
    public void dispatchRs(long requestAmount) {
        long numberOfNoteToBeDispatched = requestAmount/5;
        if(numberOfNoteToBeDispatched > 0){
            if(numberOfNoteToBeDispatched > 1){
                System.out.println(numberOfNoteToBeDispatched+", Five Rs notes are dispatched by HundredRsHandler\n");
            }else {
                System.out.println(numberOfNoteToBeDispatched+", Five Rs note is dispatched by HundredRsHandler\n");
            }
        }
        /*long pendingAmountToBeProcessed = requestAmount % 5;
        if(pendingAmountToBeProcessed > 0){
            System.out.println("The ATM cannot fulfill your request as it does not dispense currency denominations below 5 Rs.");
        }*/
    }
}
