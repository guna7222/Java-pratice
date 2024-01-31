package com.guna.java8.features;

public class FuntionalInterfaceExample {

    public static void main(String[] args) {
        FuntionalInterfaceExp functionalInterface = new FuntionalInterfaceExp(){
            @Override
            public String getUserName(int id) {
                return "guna";
            }
        };

        System.out.println(functionalInterface.getUserName(54));

        FuntionalInterfaceExp funtionalInterfaceExp = (int id) -> "guna";
        FuntionalInterfaceExp funtionalInterfaceExp1 = (id) -> {
            return "sekhar";
        };
        System.out.println(funtionalInterfaceExp.getUserName(45));
        System.out.println(funtionalInterfaceExp1.getUserName(34));
    }
}
