package com.solid.LiskovSubstitution;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        String reportType = args[1];
        UserInput userInput = new UserInput();
        IReport report;
        switch (reportType){
            case "excel": {
                report = new ExcelReportGenerator().createReport(userInput);
                break;
            }
            case "word" :{
                report = new WordReportGenerator().createReport(userInput);
                break;
            }
            case "pdf" :{
                report = new PDFReportGenerator().createReport(userInput);
                break;
            }
        }
    }
}
