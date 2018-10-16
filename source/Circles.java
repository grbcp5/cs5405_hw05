/*
 * CS5405
 * Homework 05
 * Grant Broadwater (grbcp5)
 * October 16, 2018
 *
 * Circles.java
 */

package code;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Circles extends Application implements ButtonSegmentControllerDataSource {

  public static final String AUTHOR_MENU_OPTION = "Author";
  public static final String PROBLEM_MENU_OPTION = "Problem";
  public static final String REFERENCE_MENU_OPTION = "Reference";
  public static final String DEMOS_MENU_OPTION = "Demos";
  public static final String[] MENU_OPTION_TITLES = {
    Circles.AUTHOR_MENU_OPTION, 
    Circles.PROBLEM_MENU_OPTION,
    Circles.REFERENCE_MENU_OPTION,
    Circles.DEMOS_MENU_OPTION,
  };

  private ButtonSegmentController segmentController;
  private AuthorPane authorPane;
  private ProblemPane problemPane;
  private ReferencePane referencePane;
  private DemosPane demosPane;


  public static void main(String[] args) {

    System.out.println("CS5405");
    System.out.println("Homework 05");
    System.out.println("Grant Broadwater");
    System.out.println("October 16, 2018");
    System.out.println();

    System.out.println("Starting application.");
    Circles.launch(args);
    System.out.println("Terminating application.");

  }


  public void start(Stage primaryStage) { 

    this.authorPane = new AuthorPane();
    this.problemPane = new ProblemPane();
    this.referencePane = new ReferencePane();
    this.demosPane = new DemosPane();
    this.segmentController = new ButtonSegmentController(this);

    Scene scene = new Scene(this.segmentController, 750, 600);
    primaryStage.setTitle("Homework 05");
    primaryStage.setScene(scene);
    primaryStage.show();
  }


  public int getNumberOfSegments() {
    return Circles.MENU_OPTION_TITLES.length;
  }


  public String getTitleForSegment(int segmentIndex) {
    return Circles.MENU_OPTION_TITLES[segmentIndex];
  }


  public Pane getPaneForSegment(String segmentTitle) {
    if (segmentTitle.equals(Circles.AUTHOR_MENU_OPTION)) {
      return this.authorPane;
    } else if (segmentTitle.equals(Circles.PROBLEM_MENU_OPTION)) {
      return this.problemPane;
    } else if (segmentTitle.equals(Circles.REFERENCE_MENU_OPTION)) {
      return this.referencePane;
    } else if (segmentTitle.equals(Circles.DEMOS_MENU_OPTION)) {
      return this.demosPane;
    } else {
      return null;
    }
  }
}
