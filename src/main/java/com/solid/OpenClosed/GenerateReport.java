package com.solid.OpenClosed;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class GenerateReport {

    /**
     * Generates Order Summary report in word format
     * @param userInput
     * @return
     */
    public File createReport(UserInput userInput) throws IOException {
        File wordDocument = new File("/tmp/OrderSummary.doc");
        return wordDocument;
    }

    protected class UserInput {

        Date startDate;

        Date endDate;

        String requestedByUser;


    }
}
