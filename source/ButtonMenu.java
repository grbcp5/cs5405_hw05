/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * ButtonMenu.java
 */

package code;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.Priority;
import javafx.geometry.Insets;

public class ButtonMenu extends HBox {


  public static final double DEFAULT_SPACING = 20.0;


  public ButtonMenu() {
    this(ButtonMenu.DEFAULT_SPACING);
  }


  public ButtonMenu(double spacing) {
    this(null, new String[0]);
  }


  public ButtonMenu(EventHandler<ActionEvent> handler, String... buttonTitles) {
    this(ButtonMenu.DEFAULT_SPACING, handler, buttonTitles);
  }


  public ButtonMenu(double spacing, EventHandler<ActionEvent> handler, String... buttonTitles) {
    super(spacing);

    this.setPadding(new Insets(10, 10, 10, 10));

    this.setButtons(handler, buttonTitles);
  }


  public void setButtons(EventHandler<ActionEvent> handler, String... buttonTitles) {
    this.removeAllButtons();

    for(int i = 0; i < buttonTitles.length; i++) {
      this.addButton(handler, buttonTitles[i]);
    }
  }


  public void addButton(EventHandler<ActionEvent> handler, String buttonTitle) {
      Button b = new Button(buttonTitle);
      b.setOnAction(handler);
      b.setMaxWidth(Double.MAX_VALUE);
      HBox.setHgrow(b, Priority.ALWAYS);
      this.getChildren().add(b);
  }


  public void removeAllButtons() {
    this.getChildren().removeAll();
  }
}





