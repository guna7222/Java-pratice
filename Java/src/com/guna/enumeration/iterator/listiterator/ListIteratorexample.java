package com.guna.enumeration.iterator.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorexample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(43);

        // list iterator is used to iterate only over the classes that are implemented by list interface
        // bidirectional
        // legacy + new classes

        ListIterator<Integer> listIterator = list.listIterator();

        //forward direction
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // backward direction
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // writing operation
        listIterator.add(13);

        System.out.println(list);


    }
}
