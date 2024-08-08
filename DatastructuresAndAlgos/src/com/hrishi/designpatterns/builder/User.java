package com.hrishi.designpatterns.builder;

public class User {

    private String firstName;
    private String lastName;
    private String department;
    private String dob;

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.getFirstName();
        this.lastName = userBuilder.getLastName();
        this.department = userBuilder.getDepartment();
        this.dob = userBuilder.getDob();
    }

    public static UserBuilder getUserBuilder() {
        return new UserBuilder();
    }

}
