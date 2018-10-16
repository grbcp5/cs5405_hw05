/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * CircleDataScrollPane.java
 */

package code;

import javafx.scene.control.ScrollPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;


public class CircleDataScrollPane extends ScrollPane {

  private CircleDataPane pane;

  public CircleDataScrollPane(EventHandler<ActionEvent> parent) {
    this.pane = new CircleDataPane(parent);
    this.setContent(this.pane);
    this.setHbarPolicy(ScrollBarPolicy.NEVER);
  }


  public CircleDataPane getPane() {
    return this.pane;
  }
}