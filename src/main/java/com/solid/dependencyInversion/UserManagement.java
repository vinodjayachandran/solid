package com.solid.dependencyInversion;

import com.solid.SingleResponsibility.Logger;

import java.io.IOException;

public class UserManagement {

    Logger errorLogger = new Logger();

    public boolean login(String userName, String password) throws IOException {
        // Validate credentials
        if (userName.isEmpty() || password.isEmpty()){
            errorLogger.usingBufferedWritter("Invalid Credentials");
            return false;
        }
        else{
            errorLogger.usingBufferedWritter(" Login Successful");
            return true;
        }

    }

    public boolean logout(String userId) throws IOException {
        // Validate usr
        if (userId.isEmpty() ){
            errorLogger.usingBufferedWritter("Failed to logout");
            return false;
        }
        else{
            errorLogger.usingBufferedWritter("Successfully logged out");
            return true;
        }

    }
}
