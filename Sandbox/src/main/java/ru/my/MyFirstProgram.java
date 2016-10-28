package ru.my;

public class MyFirstProgram {

  public static void main(String[] arg) {
    hello("me");
    hello("me1");
    hello("me");

    Point p1 = new Point(2, 2);
    Point p2 = new Point(6, 6);
    System.out.println("Расстояние между точками = " + Point.distance(p1, p2));

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String smb) {
    System.out.println("Hello, " + smb);
  }



}



