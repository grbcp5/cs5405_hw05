/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * DemosPane.java
 */

package code;


import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;


public class DemosPane extends BorderPane implements EventHandler<ActionEvent> {

  private CircleDataScrollPane circleDataPane;

  private Pane circlePane;
  private Circle c1;
  private Circle c2;

  public DemosPane() {
    super();

    this.circleDataPane = new CircleDataScrollPane(this);
    this.setLeft(this.circleDataPane);

    this.updateUI(); 
  }


  @Override
  public void handle(ActionEvent actionEvent) {
    this.updateUI();
  }


  public void updateUI() {

    this.circlePane = new Pane();
    this.circlePane.setStyle("-fx-border-color: black");
    this.c1 = circleDataPane.getPane().getModel().getCircle1();
    this.c2 = circleDataPane.getPane().getModel().getCircle2();

    this.c1.setFill(new Color(1.0, 0.0, 0.0, 0.5));
    this.c1.setStroke(Color.RED);
    this.c2.setFill(new Color(0.0, 0.0, 1.0, 0.5));
    this.c2.setStroke(Color.BLUE);

    this.circlePane.getChildren().add(this.c1);
    this.circlePane.getChildren().add(this.c2);

    this.setCenter(circlePane);
  }
}