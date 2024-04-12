package com.pv.dp.chainresponsbility.oneOrMoreReceivers;

public class TwentyRsHandler extends RsHandler{

    @Override
    public void dispatchRs(long requestAmount) {
        long numberOfNoteToBeDispatched = requestAmount/20;
        if(numberOfNoteToBeDispatched > 0){
            if(numberOfNoteToBeDispatched > 1){
                System.out.println(numberOfNoteToBeDispatched+", Twenty Rs notes are dispatched by HundredRsHandler\n");
            }else {
                System.out.println(numberOfNoteToBeDispatched+", Twenty Rs note is dispatched by HundredRsHandler\n");
            }
        }
        long pendingAmountToBeProcessed = requestAmount % 20;
        if(pendingAmountToBeProcessed > 0){
            rsHandler.dispatchRs(pendingAmountToBeProcessed);
        }
    }
}
