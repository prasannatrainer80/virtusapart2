package org.example;

import java.util.*;

public class SortEmploy {

  public static void main(String[] args) {
    Comparator<Employ> c = new NameComparator();
    SortedSet<Employ> employs = new TreeSet<Employ>(c);
    employs.add(new Employ(10,"Ankit",84235.23));
    employs.add(new Employ(6,"Lokesh",89942.22));
    employs.add(new Employ(9,"Anusri",90000.23));
    employs.add(new Employ(7,"Junaid",87722.23));
    employs.add(new Employ(1,"Harsh",91034.23));
    employs.add(new Employ(8,"Subham",98822.23));

    employs.forEach(System.out::println);
  }
}
