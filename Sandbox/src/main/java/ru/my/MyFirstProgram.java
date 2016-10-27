package ru.my;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("me");
    hello("me1");
    hello("me");

    Square s =  new Square();
    s.l = 5;
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle();
    r.a = 4;
    r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

  }

    public static void hello(String smb) {
      System.out.println("Hello, " + smb);
    }

    public static double area(Square s) {
      return s.l * s.l;
    }
    public static double area(Rectangle r) {
      return r.a*r.b;
    }
}