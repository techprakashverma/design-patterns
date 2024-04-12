package com.pv.dp.chainresponsbility.onlyOneReceiver;

public class ProjectManager extends Employee{
    private int MAX_LEAVE_CAN_APPROVE=20;

    @Override
    public void applyLeave(String employeeName, int numberOfDaysLeave) {
        //check if project manager can process this request
        if(numberOfDaysLeave <= MAX_LEAVE_CAN_APPROVE){

            approveLeave(employeeName,numberOfDaysLeave);
        }else {
            //if project manager can't process the Leave request then pass on to the supervisor(HR)
            //So that he can process
            supervisor.applyLeave(employeeName,numberOfDaysLeave);
        }
    }

    private void approveLeave(String employeeName, int numberOfDaysLeave) {
        System.out.println("Project manager approved "+ numberOfDaysLeave+" days Leave for the employee:"+ employeeName);
    }
}
