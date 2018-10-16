/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * ProblemPane.java
 */

package code;


public class ProblemPane extends LabelPane {

  public static final String PROBLEM_TEXT = "This exercise also extends your previous HW04." 
    + "\nThis is a variation of ex 14.23 p.590, it is circles instead of rectangles." 
    + "\nYou are experts on circles.  By now, everyone should be able to do it correctly." 
    + "\nDo it right, it will be used again.";

  public ProblemPane() {
    super(ProblemPane.PROBLEM_TEXT);
  }

}