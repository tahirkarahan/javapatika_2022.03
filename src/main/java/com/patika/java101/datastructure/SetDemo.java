package com.patika.java101.datastructure;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    /* Features of Set:
      * Set ia an unordered collections
      * Set models the mathematical set abstraction
      * Set is a collection than can not contain duplicate elements
      * Set ia an interface, it has its implementations various classes
        like HashSet, TreeSet, LinkedHashSet
     */
    public static void main(String[] args) {
        Set<String> cityNames = new HashSet<String>();
        cityNames.add("Urumchi");
        cityNames.add("kashiger");
        cityNames.add("Aksu");
        cityNames.add("Korla");
        cityNames.add("Hoten");
        cityNames.add("Artush");
        cityNames.add("Karamay");
        cityNames.add("Turpan");
        cityNames.add("Kumul");
        cityNames.add("Gulja");
        System.out.print("total cities:" + cityNames.size());
        System.out.println();
        // print out using loop
        for (String city : cityNames) {
            System.out.print(city + ",");
        }
        // print out using Iterator
        System.out.print("\n[");
        Iterator<String> iterator = cityNames.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println("]");

        //print out max and min alphabet city name in the set
        System.out.print("Max  alphabet city name is:" + Collections.max(cityNames, String.CASE_INSENSITIVE_ORDER));
        System.out.print("\nMin alphabet city name is:" + Collections.min(cityNames, String.CASE_INSENSITIVE_ORDER));
    }
}
