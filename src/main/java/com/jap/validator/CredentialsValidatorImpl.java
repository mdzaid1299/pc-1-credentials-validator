package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password) {
    CredentialsValidator credentialsValidator = (name1,password1) -> {
        if (name1.equals("admin") && password1.equals("1234")) {
            return "valid user";
        } else {
            return "invalid user";
        }

    };
    return credentialsValidator.validator(name,password);
    }






}
