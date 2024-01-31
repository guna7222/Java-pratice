package com.guna.java8.features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {
    long id;
    String name;

    public Stream1(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Stream1> arrayList = new ArrayList<>();
        arrayList.add(new Stream1(1, "guna"));
        arrayList.add(new Stream1(2, "ssg"));
        arrayList.add(new Stream1(3, "ajay"));

//        Test test = new Test();
        Stream<Stream1> stream = arrayList.stream();
        stream.forEach(test -> {
            System.out.println(test.name);
        });
    }
}

//class Test implements Consumer{
//
//    @Override
//    public void accept(Object o) {
//        Stream1 ss = (Stream1) o;
//        System.out.println(ss.name);
//    }
//}
