package org.example;

public class VarArgsDemo {

  public static void show(String...name) {
    for(String s: name) {
      System.out.print(s + "   ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    show();
    show("Ankit");
    show("Ankit","Anusri");
    show("Ankit","Anusri","Lokesh");
    show("Ankit","Anusri","Lokesh","Sai Karthik");

  }
}
