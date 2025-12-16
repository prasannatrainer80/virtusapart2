package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {
  public static void main(String[] args) {
        List<Employ> employList =
          Arrays.asList(new Employ(11, "Lokesh",83222),
                  new Employ(4,"Islam",99211),
                  new Employ(13, "Kratika",83823),
                  new Employ(9,"Deepak",83111)
          );

        Collections.sort(employList);
        employList.forEach(System.out::println);
        // Sort By Namewise
        System.out.println("Sort-By Name-Wise  ");
        Comparator<Employ> comp = new NameComparator();
        Collections.sort(employList,comp);
        employList.forEach(System.out::println);
       }
}
