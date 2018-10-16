/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * DemoCircle.java
 */

package code;


import javafx.scene.shape.Circle;


public class DemoCircle extends Circle {


  public DemoCircle(double x, double y, double r) {
    super(x, y, r);
  }

  public double getX() {
    return this.getCenterX();
  }

  public double getY() {
    return this.getCenterY();
  }


  public double getR() {
    return this.getRadius();
  }


  public boolean equals(Object o) {

    if ( this == o ) {
      return true;
    }
    if ( o == null || getClass() != o.getClass() ) {
      return false;
    }

    Circle otherCircle = ( Circle ) o;

    return this.getCenterX() == otherCircle.getCenterX()
      && this.getCenterY() == otherCircle.getCenterY()
      && this.getRadius() == otherCircle.getRadius();
  }


  public boolean isOutside(DemoCircle o) {
    double d = Math.sqrt(
      Math.pow(this.getX() - o.getX(), 2.0) + Math.pow(this.getY() - o.getY(), 2.0)
    );

    return d >= (this.getR() + o.getR());
  }


  public boolean isExternallyTouching(DemoCircle o) {
    double d = Math.sqrt(
      Math.pow(this.getX() - o.getX(), 2.0) + Math.pow(this.getY() - o.getY(), 2.0)
    );

    return d == (this.getR() + o.getR());
  }


  public boolean isInside(DemoCircle o) {
    double d = Math.sqrt(
      Math.pow(this.getX() - o.getX(), 2.0) + Math.pow(this.getY() - o.getY(), 2.0)
    );

    return d <= (o.getR() - this.getR());
  }


  public boolean isInternallyTouching(DemoCircle o) {
    double d = Math.sqrt(
      Math.pow(this.getX() - o.getX(), 2.0) + Math.pow(this.getY() - o.getY(), 2.0)
    );

    return d == (o.getR() - this.getR());
  }
  

  public String toString() {
    return "x: " + this.getX() + 
            "\ny: " + this.getY() +
            "\nr: " + this.getR();
  }
}