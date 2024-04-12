package com.pv.dp.chainresponsbility.oneOrMoreReceivers;

public class FiftyRsHandler extends RsHandler{



    @Override
    public void dispatchRs(long requestAmount) {
        long numberOfNoteToBeDispatched = requestAmount/50;
        if(numberOfNoteToBeDispatched > 0){
            if(numberOfNoteToBeDispatched > 1){
                System.out.println(numberOfNoteToBeDispatched+", Fifty Rs notes are dispatched by HundredRsHandler\n");
            }else {
                System.out.println(numberOfNoteToBeDispatched+", Fifty Rs note is dispatched by HundredRsHandler\n");
            }
        }
        long pendingAmountToBeProcessed = requestAmount % 50;
        if(pendingAmountToBeProcessed > 0){
            rsHandler.dispatchRs(pendingAmountToBeProcessed);
        }
    }
}
