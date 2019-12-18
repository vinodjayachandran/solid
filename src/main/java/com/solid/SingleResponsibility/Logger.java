package com.solid.SingleResponsibility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    public static void usingBufferedWritter(String logMessage) throws IOException, IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/tmp/log.txt"));
        writer.write(logMessage);
        writer.close();
    }
}
