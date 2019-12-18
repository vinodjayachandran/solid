package com.solid.SingleResponsibility;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserManagement {

    /*
        UserManagement Class does 3 major tasks
        1. Login
        2. Logout
        3. Logging
     */

    public boolean login(String userName, String password) throws IOException {
        // Validate credentials
        if (userName.isEmpty() || password.isEmpty()){
            usingBufferedWritter("Invalid Credentials");
            return false;
        }
        else{
            usingBufferedWritter(" Login Successful");
            return true;
        }

    }

    public boolean logout(String userId) throws IOException {
        // Validate usr
        if (userId.isEmpty() ){
            usingBufferedWritter("Failed to logout");
            return false;
        }
        else{
            usingBufferedWritter("Successfully logged out");
            return true;
        }

    }

    public static void usingBufferedWritter(String logMessage) throws IOException, IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/tmp/log.txt"));
        writer.write(logMessage);
        writer.close();
    }





}
