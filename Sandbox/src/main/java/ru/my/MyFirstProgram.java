package ru.my;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("me");
    hello("me1");
    hello("me");
    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника 1 со сторонами " + a + " и " + b + " = " + area(a,b));

    System.out.println("Площадь прямоугольника 2 со сторонами " + a + " и " + b + " = " + area(a,b));
  }

  public static void hello(String smb) {
    System.out.println("Hello, " + smb);
  }
  public static double area(double a, double b) {
   return a*b;
  }
  public static double area(double l) {
    return l * l;
  }
}