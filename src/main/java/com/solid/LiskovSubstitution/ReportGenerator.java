package com.solid.LiskovSubstitution;


import java.io.IOException;

public abstract class ReportGenerator {

    /**
     * Generates Order Summary report
     * @param userInput
     * @return
     */
    public abstract IReport createReport(UserInput userInput) throws IOException;

}
