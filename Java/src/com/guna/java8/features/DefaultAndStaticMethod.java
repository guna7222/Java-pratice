package com.guna.java8.features;


public interface DefaultAndStaticMethod {
    String greetings();

    public default String defaultMethodExample(){
        return "default method";
    }

    public static String staticMethodExample(){
        return "static method example";
    }
}
