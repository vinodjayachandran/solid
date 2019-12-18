package com.solid.dependencyInversion;

import com.solid.SingleResponsibility.Logger;

import java.io.IOException;

public class UserManagement_DI {

    Logger logger;

    UserManagement_DI(Logger injectedLogger){
        logger = injectedLogger;
    }

    public boolean login(String userName, String password) throws IOException {
        // Validate credentials
        if (userName.isEmpty() || password.isEmpty()){
            logger.usingBufferedWritter("Invalid Credentials");
            return false;
        }
        else{
            logger.usingBufferedWritter(" Login Successful");
            return true;
        }

    }

    public boolean logout(String userId) throws IOException {
        // Validate usr
        if (userId.isEmpty() ){
            logger.usingBufferedWritter("Failed to logout");
            return false;
        }
        else{
            logger.usingBufferedWritter("Successfully logged out");
            return true;
        }

    }
}
