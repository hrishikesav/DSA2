package com.hrishi.designpatterns.builder;

public class Main {

    public static void main(String[] args) {
        UserBuilder userBuilder = User.getUserBuilder();

        User user = userBuilder.firstName("Don").lastName("Junior").department("Private").dob("1243").build();

        User user2 = userBuilder.firstName("name1").lastName("name2").build();
    }
}
