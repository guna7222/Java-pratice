package com.guna.java8.features;

public class OverloadingStaticMethods {

    public static void foo(){
        System.out.println("default static method");
    }

    public static void foo(String str){
        System.out.println("parameterized static method");
    }

    public static void main(String[] args) {
        OverloadingStaticMethods.foo();
        OverloadingStaticMethods.foo("name");
    }
}
