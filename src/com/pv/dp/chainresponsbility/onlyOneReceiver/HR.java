package com.pv.dp.chainresponsbility.onlyOneReceiver;

public class HR extends Employee{
    private int MAX_LEAVE_CAN_APPROVE=30;

    @Override
    public void applyLeave(String employeeName, int numberOfDaysLeave) {
        //check if project manager can process this request
        if(numberOfDaysLeave <= MAX_LEAVE_CAN_APPROVE){

            approveLeave(employeeName,numberOfDaysLeave);
        }else {
            System.out.println("Leave application suspended, Please contact with HR");
        }
    }

    private void approveLeave(String employeeName, int numberOfDaysLeave) {
        System.out.println("HR approved "+ numberOfDaysLeave+" days Leave for the employee:"+ employeeName);
    }
}
