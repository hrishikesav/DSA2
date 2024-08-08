package com.hrishi.designpatterns.builder;

public class UserBuilder {

    private String firstName;
    private String lastName;
    private String department;
    private String dob;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDob() {
        return dob;
    }

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder department(String department) {
        this.department = department;
        return this;
    }

    public UserBuilder dob(String dob) {
        this.dob = dob;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
