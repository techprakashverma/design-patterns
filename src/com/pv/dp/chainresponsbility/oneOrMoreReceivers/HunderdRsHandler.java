package com.pv.dp.chainresponsbility.oneOrMoreReceivers;

public class HunderdRsHandler extends RsHandler{



    @Override
    public void dispatchRs(long requestAmount) {
        long numberOfNoteToBeDispatched = requestAmount/100;
        if(numberOfNoteToBeDispatched > 0){
            if(numberOfNoteToBeDispatched > 1){
                System.out.println(numberOfNoteToBeDispatched+", Hundred Rs notes are dispatched by HundredRsHandler\n");
            }else {
                System.out.println(numberOfNoteToBeDispatched+", Hundred Rs note is dispatched by HundredRsHandler\n");
            }
        }
        long pendingAmountToBeProcessed = requestAmount % 100;
        if(pendingAmountToBeProcessed > 0){
            rsHandler.dispatchRs(pendingAmountToBeProcessed);
        }
    }
}
