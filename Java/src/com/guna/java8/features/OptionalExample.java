package com.guna.java8.features;

import java.util.Optional;

public class OptionalExample {
    private int id;
    private String name;
    private String email;

    public OptionalExample(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        OptionalExample optionalExample = new OptionalExample(101, "guna", "guna@gmail.com");

        Optional<Object> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

//        Optional<String> optionalEmail1 = Optional.of(optionalExample.email);
//        System.out.println(optionalEmail1);

        Optional<String> email1 = Optional.ofNullable(optionalExample.email);
       // System.out.println(email1);
        if(email1.isPresent()){
            System.out.println(optionalExample.email);
        }
    }
}
