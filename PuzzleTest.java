import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;

public class PuzzleTest extends Application {
  private int[][] answers = { {0,0,1,0,0,0,1,0},
                         {0,0,0,1,1,0,0,0},
                         {1,0,0,0,0,1,0,0},
                         {0,1,0,0,0,0,0,1},
                         {0,0,0,1,2,2,2,2},
                         {1,0,0,0,2,2,2,2},
                         {0,0,1,0,2,2,2,2},
                         {0,1,0,0,2,2,2,2}
                        };
   private final Image imageX = new Image("X.png");
   private final Image imageO = new Image("Circle.png");
   private final Image imageBlank = new Image("Blank.png");
   private GridPane gridPane = new GridPane();
  
  public static void main(String[] args) {
        launch(args);
    }

       @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPane example");
       

        Button[][] btn = new Button[8][8];
        Cell[][] cells = new Cell[8][8];

        for(int row=0; row<answers.length; row++){
               for( int column = 0; column<answers.length; column++) {
                    if(answers[row][column] == 0)
                       cells[row][column] = new Cell('X');
                    else if(answers[row][column] == 1)
                       cells[row][column] = new Cell('O');
                    else if(answers[row][column] == 2)
                       cells[row][column] = new Cell('H');
                }
             }

        for(int i=0; i<btn.length; i++){
              
                for(int j=0; j<btn.length;j++){             
                final int ii = i; 
                final int jj = j;
                btn[i][j] = new Button();
                btn[i][j].setPrefSize(30,30);
                btn[i][j].setGraphic(new ImageView(imageBlank));
                btn[i][j].setPadding(Insets.EMPTY);
                btn[ii][jj].setOnMousePressed((event) -> {
                           
                         switch(event.getClickCount()) {
                         case 1:
                           cells[ii][jj].setUserState('X');
                           System.out.println("Row: "+ii+" Column: "+jj+":"+cells[ii][jj].getUserState());
                           btn[ii][jj].setGraphic(new ImageView(imageX));
                           btn[ii][jj].setPadding(Insets.EMPTY);
                           break;
                           
                         case 2:
                           cells[ii][jj].setUserState('O');
                           System.out.println("Row: "+ii+" Column: "+jj+":"+cells[ii][jj].getUserState());
                           btn[ii][jj].setGraphic(new ImageView(imageO));
                           btn[ii][jj].setPadding(Insets.EMPTY);
                           break;
                           
                         case 3:
                            cells[ii][jj].setUserState('B');
                            System.out.println("Row: "+ii+" Column: "+jj+":"+cells[ii][jj].getUserState());
                            btn[ii][jj].setGraphic(new ImageView(imageBlank));
                            btn[ii][jj].setPadding(Insets.EMPTY);
                            break;
                         }
               });
                gridPane.add(btn[i][j], i, j);
                  if( i>=4 && j>=4)
                      btn[i][j].setVisible(false);
		      //gridPane.getChildren().remove(btn[i][j]);
               }
         }
            Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
