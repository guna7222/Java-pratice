package com.guna.java8.features;

public class DefaultAndStaticMethodImpl implements DefaultAndStaticMethod {
    @Override
    public String greetings() {
        return "Welcome to the java 8 features";
    }

    static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        DefaultAndStaticMethodImpl defaultAndStaticMethod = new DefaultAndStaticMethodImpl();
        System.out.println(defaultAndStaticMethod.greetings());
        System.out.println(defaultAndStaticMethod.defaultMethodExample());
        System.out.println(DefaultAndStaticMethod.staticMethodExample());
    }
}
