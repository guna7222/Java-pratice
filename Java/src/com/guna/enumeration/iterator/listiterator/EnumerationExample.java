package com.guna.enumeration.iterator.listiterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

    public Vector<String> vectorObject() {
        Vector<String> vector = new Vector<>();
        vector.add("ssg");
        vector.add("guna");
        vector.add("ajay");
        return vector;
    }

    public void iterateLegacyObjects(EnumerationExample enumerationExample){
        Vector<String> e = enumerationExample.vectorObject();
        Enumeration<String> elements = e.elements();

        // iterating over the elements
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

    }

    public static void main(String[] args) {
        EnumerationExample enumerationExample = new EnumerationExample();
        enumerationExample.iterateLegacyObjects(enumerationExample);
    }
}
