public class TestCells {

       public static void main(String[] args) {
           int[][] answers = { {0,0,1,0,0,0,1,0},
                         {0,0,0,1,1,0,0,0},
                         {1,0,0,0,0,1,0,0},
                         {0,1,0,0,0,0,0,1},
                         {0,0,0,1,2,2,2,2},
                         {1,0,0,0,2,2,2,2},
                         {0,0,1,0,2,2,2,2},
                         {0,1,0,0,2,2,2,2}
                        };

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

           System.out.println("Location 0,2 should be O: "+cells[0][2].getConfigState());
           System.out.println("Location 2,0 should be O: "+cells[2][0].getConfigState());
           System.out.println("Location 0,6 should be O: "+cells[0][6].getConfigState());
           System.out.println("Location 4,4 should be H: "+cells[4][4].getConfigState());
           System.out.println("Location 7,7 should be H: "+cells[7][7].getConfigState());
      
}
}
