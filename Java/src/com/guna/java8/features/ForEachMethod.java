package com.guna.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("guna");
        list.add("ssg");

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                String str = (String) o;
                System.out.println(str);
            }
        };

        list.forEach(consumer);
    }
}
