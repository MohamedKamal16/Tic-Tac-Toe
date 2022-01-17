package single;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedHashMap;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import video.loseVideo;
import video.winVideo;

public class HardClass extends JFrame{
    JLabel[] arrayOfLabals;
     JPanel parentPanal;
     JLabel firstPlayerScore, secondPlayerScore,tieScore;
     int XOCounter ;
     ImageIcon xIcon;
     int firstPlayer;
     int secondPlayer;
     public static LinkedHashMap<Integer, String> moves = new LinkedHashMap<>();

    public HardClass(JLabel[] arrayOfLabals, JPanel parentPanal, JLabel firstPlayerScore, JLabel secondPlayerScore, int XOCounter,JLabel tieScore) {
        this.arrayOfLabals = arrayOfLabals;
        this.parentPanal = parentPanal;
        this.firstPlayerScore = firstPlayerScore;
        this.secondPlayerScore = secondPlayerScore;
        this.XOCounter = XOCounter;
        this.tieScore = tieScore;
        
         char[][] board = {{'_','_','_'}
                            ,{'_','_','_'}
                            ,{'_','_','_'}};
        
                 arr2d(board);
                 printArray(board);
                 Move move = findBestMove(board);
                 System.out.println( " X: "
                         +move.row+ " Y: "+move.col);

                        arrayOfLabals[move.row+(move.col*3)].setText("O");
                        arrayOfLabals[move.row+(move.col*3)].setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/o.png")));
                        arrayOfLabals[move.row+(move.col*3)].setForeground(Color.blue);
                        moves.put(Integer.parseInt(arrayOfLabals[move.row+(move.col*3)].getName()),arrayOfLabals[move.row+(move.col*3)].getText());
                        parentPanal.repaint();
                        printArray(board);
                        XOCounter++;
           
    }

    boolean isFirstPlayerTurn = true;
    boolean isGameEnds = false;
    int randomNumber;
    Random random = new Random();
   
    private void createGamePage() {
        for (int i = 0; i < arrayOfLabals.length; i++) {
            arrayOfLabals[i].setName(""+i);
        }
  
    
    }

     private void colorBackgroundWinnerLabels(JLabel l1, JLabel l2, JLabel l3) {
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        isGameEnds = true;
    }
     
     private void checkIfThereIsAWinner() {
     
        String c0 = arrayOfLabals[0].getText();
        String c1 = arrayOfLabals[1].getText();
        String c2 = arrayOfLabals[2].getText();
        String c3 = arrayOfLabals[3].getText();
        String c4 = arrayOfLabals[4].getText();
        String c5 = arrayOfLabals[5].getText();
        String c6 = arrayOfLabals[6].getText();
        String c7 = arrayOfLabals[7].getText();
        String c8 = arrayOfLabals[8].getText();

         firstPlayer = Integer.valueOf(this.firstPlayerScore.getText());
         secondPlayer = Integer.valueOf(this.secondPlayerScore.getText());
        

        if (c0.equals(c1) && c0.equals(c2) && !c0.equals("")) {
            if (c0.equals("X")) {
                this.firstPlayerScore.setText((firstPlayer + 1) + "");
                 new winVideo().setVisible(true);
              
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                  new loseVideo().setVisible(true);
            }
            colorBackgroundWinnerLabels(arrayOfLabals[0], arrayOfLabals[1], arrayOfLabals[2]);
        }

        if (c3.equals(c4) && c3.equals(c5) && !c3.equals("")) {
            if (c3.equals("X")) {
                this.firstPlayerScore.setText((firstPlayer + 1) + "");
              new winVideo().setVisible(true);
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                  new loseVideo().setVisible(true);
            }
            colorBackgroundWinnerLabels(arrayOfLabals[3], arrayOfLabals[4], arrayOfLabals[5]);
        }

        if (c6.equals(c7) && c6.equals(c8) && !c6.equals("")) {
            if (c6.equals("X")) {
                this.firstPlayerScore.setText((firstPlayer + 1) + "");
                new winVideo().setVisible(true);
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                  new loseVideo().setVisible(true);
            }
            colorBackgroundWinnerLabels(arrayOfLabals[6], arrayOfLabals[7], arrayOfLabals[8]);
        }

        if (c0.equals(c3) && c0.equals(c6) && !c0.equals("")) {
            if (c0.equals("X")) {
                this.firstPlayerScore.setText((firstPlayer + 1) + "");
                 new winVideo().setVisible(true);
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                  new loseVideo().setVisible(true);
            }
            colorBackgroundWinnerLabels(arrayOfLabals[0], arrayOfLabals[3], arrayOfLabals[6]);
        }

        if (c1.equals(c4) && c1.equals(c7) && !c1.equals("")) {
            if (c1.equals("X")) {
                 this.firstPlayerScore.setText((firstPlayer + 1) + "");
                 new winVideo().setVisible(true);
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                   new loseVideo().setVisible(true);
            }
            colorBackgroundWinnerLabels(arrayOfLabals[1], arrayOfLabals[4], arrayOfLabals[7]);
        }

        if (c2.equals(c5) && c2.equals(c8) && !c2.equals("")) {
            if (c2.equals("X")) {
                this.firstPlayerScore.setText((firstPlayer + 1) + "");
                 new winVideo().setVisible(true);
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                  new loseVideo().setVisible(true);
            }
            colorBackgroundWinnerLabels(arrayOfLabals[2], arrayOfLabals[5], arrayOfLabals[8]);
        }

        if (c0.equals(c4) && c0.equals(c8) && !c0.equals("")) {
            if (c0.equals("X")) {
                this.firstPlayerScore.setText((firstPlayer + 1) + "");
                 new winVideo().setVisible(true);
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                      new loseVideo().setVisible(true);
                   
            }
            colorBackgroundWinnerLabels(arrayOfLabals[0], arrayOfLabals[4], arrayOfLabals[8]);
        }

        if (c2.equals(c4) && c2.equals(c6) && !c2.equals("")) {
            if (c2.equals("X")) {
                this.firstPlayerScore.setText((firstPlayer + 1) + "");
                 new winVideo().setVisible(true);
            } else {
                this.secondPlayerScore.setText((secondPlayer + 1) + "");
                  new loseVideo().setVisible(true);
            }
            colorBackgroundWinnerLabels(arrayOfLabals[2], arrayOfLabals[4], arrayOfLabals[6]);
        }

    }
    
     
     public void arr2d(char[][] board)
     {
       for(int i =0 ;i<3;i++)
                    for(int j=0 ;j<3;j++)
                {
                    if(!arrayOfLabals[(i*3)+j].getText().equals(""))
                    board[i][j] = arrayOfLabals[(i*3)+j].getText().charAt(0);
                   
                }
       
       
     }
     public void printArray(char[][] board)
     {
           for(int i =0 ;i<3;i++)
           {
               System.out.println("");
                    for(int j=0 ;j<3;j++)
                        System.out.print(board[i][j]+" ");
     }}
     
     static class Move
{
    int row, col;
};

static char player = 'O', opponent = 'X';

// This function returns true if there are moves
// remaining on the board. It returns false if
// there are no moves left to play.
static Boolean isMovesLeft(char board[][])
{
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (board[i][j] == '_')
                return true;
    return false;
}

// This is the evaluation function as discussed
// in the previous article ( http://goo.gl/sJgv68 )
static int evaluate(char b[][])
{
    // Checking for Rows for X or O victory.
    for (int row = 0; row < 3; row++)
    {
        if (b[row][0] == b[row][1] &&
            b[row][1] == b[row][2])
        {
            if (b[row][0] == player)
                return +10;
            else if (b[row][0] == opponent)
                return -10;
        }
    }

    // Checking for Columns for X or O victory.
    for (int col = 0; col < 3; col++)
    {
        if (b[0][col] == b[1][col] &&
            b[1][col] == b[2][col])
        {
            if (b[0][col] == player)
                return +10;

            else if (b[0][col] == opponent)
                return -10;
        }
    }

    // Checking for Diagonals for X or O victory.
    if (b[0][0] == b[1][1] && b[1][1] == b[2][2])
    {
        if (b[0][0] == player)
            return +10;
        else if (b[0][0] == opponent)
            return -10;
    }

    if (b[0][2] == b[1][1] && b[1][1] == b[2][0])
    {
        if (b[0][2] == player)
            return +10;
        else if (b[0][2] == opponent)
            return -10;
    }

    // Else if none of them have won then return 0
    return 0;
}

// This is the minimax function. It considers all
// the possible ways the game can go and returns
// the value of the board
static int minimax(char board[][], 
                    int depth, Boolean isMax)
{
    int score = evaluate(board);

    // If Maximizer has won the game 
    // return his/her evaluated score
    if (score == 10)
        return score;

    // If Minimizer has won the game 
    // return his/her evaluated score
    if (score == -10)
        return score;

    // If there are no more moves and 
    // no winner then it is a tie
    if (isMovesLeft(board) == false)
        return 0;

    // If this maximizer's move
    if (isMax)
    {
        int best = -1000;

        // Traverse all cells
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                // Check if cell is empty
                if (board[i][j]=='_')
                {
                    // Make the move
                    board[i][j] = player;

                    // Call minimax recursively and choose
                    // the maximum value
                    best = Math.max(best, minimax(board, 
                                    depth + 1, !isMax));

                    // Undo the move
                    board[i][j] = '_';
                }
            }
        }
        return best;
    }

    // If this minimizer's move
    else
    {
        int best = 1000;

        // Traverse all cells
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                // Check if cell is empty
                if (board[i][j] == '_')
                {
                    // Make the move
                    board[i][j] = opponent;

                    // Call minimax recursively and choose
                    // the minimum value
                    best = Math.min(best, minimax(board, 
                                    depth + 1, !isMax));

                    // Undo the move
                    board[i][j] = '_';
                }
            }
        }
        return best;
    }
}

// This will return the best possible
// move for the player
static Move findBestMove(char board[][])
{
    int bestVal = -1000;
    Move bestMove = new Move();
    bestMove.row = -1;
    bestMove.col = -1;

    // Traverse all cells, evaluate minimax function 
    // for all empty cells. And return the cell 
    // with optimal value.
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            // Check if cell is empty
            if (board[i][j] == '_')
            {
                // Make the move
                board[i][j] = player;

                // compute evaluation function for this
                // move.
                int moveVal = minimax(board, 0, false);

                // Undo the move
                board[i][j] = '_';

                // If the value of the current move is
                // more than the best value, then update
                // best/
                if (moveVal > bestVal)
                {
                    bestMove.row = i;
                    bestMove.col = j;
                    bestVal = moveVal;
                }
            }
        }
    }

    System.out.printf("The value of the best Move " + 
                             "is : %d\n\n", bestVal);

    return bestMove;
}
     
     
     
     
     public boolean isOnePlayerGameEnds() {
         
         int tieScore = Integer.valueOf(this.tieScore.getText());
         char[][] board = {{'_','_','_'}
                            ,{'_','_','_'}
                            ,{'_','_','_'}};

        if (XOCounter < 9 && ModesBoard.pressedLabel.getText().equals("")) {

            ModesBoard.pressedLabel.setText("X");
            ModesBoard.pressedLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/x.png")));
            parentPanal.repaint();
          
            
            ModesBoard.pressedLabel.setForeground(Color.ORANGE);
            
            XOCounter++;
            moves.put(Integer.parseInt(ModesBoard.pressedLabel.getName()), ModesBoard.pressedLabel.getText());
           
            checkIfThereIsAWinner();
            

            if (XOCounter < 9 && isGameEnds == false) {
                 arr2d(board);
                 System.out.println("chances");
                  printArray(board);
                 Move move = findBestMove(board);
                 System.out.println( " X: "+move.row+ " Y: "+move.col);
          
                        arrayOfLabals[move.col+(move.row*3)].setText("O");
                        arrayOfLabals[move.col+(move.row*3)].setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/o.png")));
                        arrayOfLabals[move.col+(move.row*3)].setForeground(Color.blue);
                         arrayOfLabals[move.col+(move.row*3)].setVisible(true);
                        board[move.row][move.col] = 'X';
                        parentPanal.repaint();
                        moves.put(Integer.parseInt(arrayOfLabals[move.col+(move.row*3)].getName()), arrayOfLabals[move.col+(move.row*3)].getText());

                        XOCounter++;
                        checkIfThereIsAWinner();
                        System.out.println("aftel calc");
                        printArray(board);
                        System.out.println(XOCounter);
            }

        }

        if ( (XOCounter == 9 )&& firstPlayer == Integer.valueOf(firstPlayerScore.getText()) && secondPlayer == Integer.valueOf(secondPlayerScore.getText())) {
                this.tieScore.setText((tieScore + 1) + "");  
            }
        
         if (XOCounter >= 9 || isGameEnds == true) {
            return true;
        }

        return false;

    }

}