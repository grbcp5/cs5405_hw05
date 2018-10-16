/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * ButtonSegmentController.java
 */

package code;
 
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;


public class ButtonSegmentController extends BorderPane implements EventHandler<ActionEvent> {


  private ButtonMenu buttonMenu;
  private ButtonSegmentControllerDataSource dataSource;


  public ButtonSegmentController(ButtonSegmentControllerDataSource dataSource) {
    super();

    this.buttonMenu = new ButtonMenu();
    this.dataSource = dataSource;

    this.setTop(this.buttonMenu);

    this.reloadData();
  }


  public void reloadData() {

    this.buttonMenu.removeAllButtons();

    for(int i = 0; i < this.dataSource.getNumberOfSegments(); i++) {
      this.buttonMenu.addButton(
        this, 
        this.dataSource.getTitleForSegment(i)
      );
    }

    if(this.dataSource.getNumberOfSegments() > 0) {
      this.setCenter(
        this.dataSource.getPaneForSegment(
          this.dataSource.getTitleForSegment(0)
        )
      );
    }
  }


  @Override
  public void handle(ActionEvent actionEvent) {
    String senderTitle = ((Button)actionEvent.getSource()).getText();

    this.setCenter(this.dataSource.getPaneForSegment(senderTitle));
  }
}
