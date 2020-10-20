package com.zemoso.objects;

public class FacebookUser {

    private final String firstName;
    private final String email;

    public FacebookUser(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
}
