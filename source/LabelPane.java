/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * LabelPane.java
 */

package code;

import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;


public class LabelPane extends StackPane {

  private Label primaryLabel;

  public LabelPane(String labelText) {
    super();

    this.primaryLabel = new Label(labelText);
    this.getChildren().add(this.primaryLabel);
  }

}