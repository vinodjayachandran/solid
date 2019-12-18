package com.solid.LiskovSubstitution;

import java.io.IOException;

public class PDFReportGenerator extends ReportGenerator {
    /**
     * Generates Order Summary report
     *
     * @param userInput
     * @return
     */
    @Override
    public IReport createReport(UserInput userInput) throws IOException {
        return new PDFReport();
    }
}
