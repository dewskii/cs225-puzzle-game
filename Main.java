package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Main extends Application {
	
	Puzzle puzzle = new Puzzle();
    @FXML
    private Pane puzzleArea;
	

	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Untitled.fxml"));
			Scene scene = new Scene(root,718,503);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}
}
