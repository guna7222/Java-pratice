package com.guna.enumeration.iterator.listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        String[] str = new String[] {"guna", "ssg"};
        ArrayList<String> arrayList = new ArrayList<>(List.of(str));
        Iterator<String> i = arrayList.iterator();
        while (i.hasNext()){
           String name = i.next();
            if(name.equals("guna")) {
               i.remove();
           }
        }
        arrayList.forEach(p -> System.out.println(p));

    }

}
