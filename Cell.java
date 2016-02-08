public class Cell {
   final char BLANK = 'B';
   final char WRONG = 'X';
   final char RIGHT = 'O';
   final char HIDDEN = 'H';
   
   char configState;
   char userState;
   
   public Cell(char configState) {
       this.configState = configState;
       userState = 'B';
   }
   
   public void setUserState(char userState) {
          //TODO Throw Error if not B, X, O
          this.userState = userState;
    }

   public char getUserState() {
          return userState;
   }

   public char getConfigState() {
          return configState;
    }
}
