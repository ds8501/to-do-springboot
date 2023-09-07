package com.todolist.todolistspringboot;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean  authenticate(String username,String password){
        boolean isvalidname=username.equals("divya");
        boolean isvalidpassword=password.equals("divya11");

        return isvalidname && isvalidpassword;

    }
}
