package com.pv.dp.builder;

public class BuilderClient {

    public static void main(String[] args) {

        Report report1 = new Report.Builder()
                .reportContent("Report1")
                .reportFooter("Footer1")
                .reportType("type1")
                .reportHeader("header1")
                .build();
        System.out.println(report1);

        Report report2 = new Report.Builder()
                 .reportContent("Report2")
                .reportType("type2")
                .reportHeader("header2")
                .build();

        System.out.println(report2);
    }
}
