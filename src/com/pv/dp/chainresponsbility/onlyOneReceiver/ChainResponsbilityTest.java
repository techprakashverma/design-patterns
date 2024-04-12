package com.pv.dp.chainresponsbility.onlyOneReceiver;

public class ChainResponsbilityTest {

    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead();
        ProjectManager projectManager = new ProjectManager();
        HR hr = new HR();

        teamLead.setNextSupervisor(projectManager);
        projectManager.setNextSupervisor(hr);

        teamLead.applyLeave("Prakash",8);
        System.out.println();
        teamLead.applyLeave("Ravi",12);
        System.out.println();
        teamLead.applyLeave("Anil",30);
        System.out.println();
        teamLead.applyLeave("Sunil",45);
        System.out.println();

    }
}
