package com.solid.OpenClosed;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.common.PDStream;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class GeneratePDFReport extends GenerateReport {

    /**
     * Generate Order Summary in PDF format.
     * @param userInput
     * @return
     */
    @Override
    public File createReport(GenerateReport.UserInput userInput) throws IOException {
        InputStream is = null;
        PDDocument doc = PDDocument.load(new File("filename.pdf"));
        File targetFile = new File("nameoffile.pdf");
        PDStream ps = new PDStream(doc);
        is = ps.createInputStream();
        FileUtils.copyInputStreamToFile(is, targetFile);
        return targetFile;
    }
}
