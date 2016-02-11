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
	        Block blocktest1 = new Block(testAnswers); blocktest1.setButtons();
                Block blocktest2 = new Block(testAnswers); blocktest2.setButtons();
                Block blocktest3 = new Block(testAnswers); blocktest3.setButtons();
		GridPane master = new GridPane();
	        GridPane grid1 = blocktest1.returnGrid();
                GridPane grid2 = blocktest2.returnGrid();
                GridPane grid3 = blocktest3.returnGrid();

		master.add(grid1,0,0);
                master.add(grid2,0,1);
                master.add(grid3,1,0);

         
	        Scene scene = new Scene(master);
	        primaryStage.setScene(scene);
	        primaryStage.show();

	  }

}

