package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example1 {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Lokesh","Shaili","Islam","Harsh","Bharathi","Ankit","Karthik");
    Collections.sort(names);
    names.forEach(System.out::println);

//    List<Employ> employList = Arrays.asList(new Employ(1, "Lokesh",83222),
//      new Employ(2,"Islam",99211),
//      new Employ(3, "Kratika",83823),
//      new Emp
//    );
  }
}
