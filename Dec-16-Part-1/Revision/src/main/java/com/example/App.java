package com.example;

import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) {
    List<Employ> employList = Arrays.asList(new Employ(1, "Lokesh",83222),
        new Employ(2,"Islam",99211),
        new Employ(3, "Kratika",83823)
      );

    Employ[] res = employList.toArray(new Employ[employList.size()]);
    for(Employ e : res) {
      System.out.println(e);
    }
  }
}
