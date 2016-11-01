package ru.my;

/**
 * Created by ndya on 31.10.2016.
 */
public class Res {
  double x1;
  double x2;
  double y1;
  double y2;

  public Res(double x1, double x2, double y1, double y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }


  public double res() {
  return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}
