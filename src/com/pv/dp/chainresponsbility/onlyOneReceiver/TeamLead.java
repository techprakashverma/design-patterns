package com.pv.dp.chainresponsbility.onlyOneReceiver;

public class TeamLead extends Employee{
    private int MAX_LEAVE_CAN_APPROVE=10;

    @Override
    public void applyLeave(String employeeName, int numberOfDaysLeave) {
        //check if Team lead can process this request
        if(numberOfDaysLeave <= MAX_LEAVE_CAN_APPROVE){

            approveLeave(employeeName,numberOfDaysLeave);
        }else {
            //if teamLead can't process the Leave request then pass on to the supervisor(project manager)
            //So that he can process
            supervisor.applyLeave(employeeName,numberOfDaysLeave);
        }
    }

    private void approveLeave(String employeeName, int numberOfDaysLeave) {
        System.out.println("Team Lead approved "+ numberOfDaysLeave+" days Leave for the employee:"+ employeeName);
    }
}
