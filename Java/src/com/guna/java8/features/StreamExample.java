package com.guna.java8.features;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> newStream = list.stream();
        Stream<Integer> integerStream = newStream.filter((i) -> i % 2 == 0);

        integerStream.forEach(x -> {
            System.out.println(x);
        });

    }
}
