package com.solid.LiskovSubstitution;

import java.io.IOException;

public class ExcelReportGenerator extends ReportGenerator {
    /**
     * Generates Order Summary report in Excel format
     *
     * @param userInput
     * @return
     */
    @Override
    public IReport createReport(UserInput userInput) throws IOException {
        return new ExcelReport();
    }
}
