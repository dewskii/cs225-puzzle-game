import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	private int[][] testAnswers = {{0,0,1,0},
			{0,0,0,1},
			{1,0,0,0},
			{0,1,0,0}};

	  public static void main(String[] args) {
	        launch(args);
	    }
	  @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("GridPane example");
	        Block blocktest = new Block(testAnswers);
		blocktest.setButtons();
	        GridPane grid1 = blocktest.returnGrid();
	        Scene scene = new Scene(grid1);
	        primaryStage.setScene(scene);
	        primaryStage.show();

	  }

}

