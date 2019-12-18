package com.solid.SingleResponsibility;

import java.io.IOException;

public class UserManagement_SR {

    Logger logger = new Logger();

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
