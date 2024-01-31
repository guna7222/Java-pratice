package com.guna.test;

public class B extends A{

    public void greetings(){
        System.out.println("greetings");
    }

    public static void g(){
        System.out.println("j");
    }


    public static void main(String[] args) {
        B b = new B();
        b.guna();
        b.hello();
        System.out.println(b.bb);
        System.out.println(b.a);

        b.a = 56;
        System.out.println(b.a);
        System.out.println(b.a);

        b.hello();



    }
}
