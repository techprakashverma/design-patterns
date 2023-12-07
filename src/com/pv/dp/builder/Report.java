package com.pv.dp.builder;

/** This is a builder class. */
public class Report {

    private String reportType;
    private String reportHeader;
    private String reportFooter;
    private String reportContent;

    private Report(Builder builder){
        this.reportType = builder.reportType;
        this.reportContent = builder.reportContent;
        this.reportFooter = builder.reportFooter;
        this.reportHeader = builder.reportHeader;
    }
    public String getReportType() {
        return this.reportType;
    }

    public String getReportHeader() {
        return this.reportHeader;
    }

    public String getReportFooter() {
        return this.reportFooter;
    }

    public String getReportContent() {
        return this.reportContent;
    }

    //static inner class
    public static class Builder{
        private String reportType;
        private String reportHeader;
        private String reportFooter;
        private String reportContent;

        public Builder(){

        }

        public Report build(){
            return new Report(this);
        }

        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        public Builder reportHeader(String reportHeader) {
            this.reportHeader = reportHeader;
            return this;
        }

        public Builder reportFooter(String reportFooter) {
            this.reportFooter = reportFooter;
            return this;
        }

        public Builder reportContent(String reportContent) {
            this.reportContent = reportContent;
            return this;
        }
    }


    @Override
    public String toString() {
        return "Report{" +
                "reportType='" + reportType + '\'' +
                ", reportHeader='" + reportHeader + '\'' +
                ", reportFooter='" + reportFooter + '\'' +
                ", reportContent='" + reportContent + '\'' +
                '}';
    }
}
