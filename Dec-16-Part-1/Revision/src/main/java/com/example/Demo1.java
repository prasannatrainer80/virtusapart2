package com.example;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Lokesh","Shaili","Islam","Harsh","Bharathi");

    String[] res = names.toArray(new String[names.size()]);
    for(String s : res) {
      System.out.println(s);
    }
  }
}
