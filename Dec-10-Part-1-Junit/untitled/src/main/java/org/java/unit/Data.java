package org.java.unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

  public List<String > showNames() {
     List<String > names = Arrays.asList("Lokesh","Sekhar","Meghana");
     return names;
  }

  public String sayHello() {
    return "Welcome to Junit Programming...";
  }

  public boolean evenOdd(int n) {
    if (n%2==0) {
      return true;
    }
    return false;
  }
  public int division(int a, int b){
    return a / b;
  }

  public int max3(int a, int b, int c) {
    int m = a;
    if (m < b) {
      m = b;
    }
    if (m < c) {
      m = c;
    }
    return m;
  }

  public int sum(int a, int b) {
    return a + b;
  }
}
