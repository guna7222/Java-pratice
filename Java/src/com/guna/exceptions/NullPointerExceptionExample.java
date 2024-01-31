package com.guna.exceptions;

/**
 * if you perform any operation on null object you will get NUllPointerException
 */

public class NullPointerExceptionExample {
    private int id;
    private String name;

    NullPointerExceptionExample() {
    }

    NullPointerExceptionExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters and setters
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

    public static void main(String[] args) {
        NullPointerExceptionExample nullPointerExceptionExample = new NullPointerExceptionExample(101, "guna");
        String name = nullPointerExceptionExample.getName();
        System.out.println(name);

        NullPointerExceptionExample nullPointerExceptionExample1 = new NullPointerExceptionExample(101, null);
        String name1 = nullPointerExceptionExample1.getName();
        // here i'm doing operation on null object so it throws NullPointerException
        try {
            System.out.println(name1.toUpperCase());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}



