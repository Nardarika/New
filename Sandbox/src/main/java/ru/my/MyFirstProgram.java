package ru.my;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("me");
    hello("me1");
    hello("me");
    double q = 5;
    System.out.println("Площадь квадрата со стороной " + q + " = " + area(q));


  }



  public static void hello(String smb) {
    System.out.println("Hello, " + smb);
  }
  public static double area(double t) {
   return t*t;
}
}