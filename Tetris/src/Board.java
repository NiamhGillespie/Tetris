import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JLabel;

public class Board {
	
	public static int numberOfSquares;
	
	protected void createBoard(BoardSizes boardSize) {
		// creates a playing board of the given diameter - think about how to implement this
		// with a leader board - have a set 3 options and then custom? <- will need to have
		// sensible limits 
		int[] boardDimensions = boardSize.getBoardSize();
		int width = boardDimensions[0];
		int height = boardDimensions[1];
		numberOfSquares = boardDimensions[2];
		
		

		TetrisSetup.tetrisFrame.getContentPane().removeAll();
		TetrisSetup.tetrisFrame.repaint();
		TetrisSetup.tetrisFrame.setSize(width * 2 + 100,  height * 2 + 150);
		
		DrawGrid grid = new DrawGrid();
		grid.setBounds(25, 25,Board.numberOfSquares * 20 + 50,Board.numberOfSquares * 20+ 50);
	    TetrisSetup.tetrisFrame.add(grid);
		
		JLabel playerScore = new JLabel("Score: "); //+ getCurrentScore());
		playerScore.setBounds(25,height*2 + 50,160, 40);
		TetrisSetup.tetrisFrame.add(playerScore); // will display score at bottom of board
	}
	

	public void createGrid() {
		JLabel newGridSquare = new JLabel(" ");
		for ( int x = 100; x <= Board.numberOfSquares * 20 ; x += 20 )
		  for ( int y = 100; y <= Board.numberOfSquares * 20; y += 20 ) 			 
		  	newGridSquare.setBounds(x, y, 20, 20);
			TetrisSetup.tetrisFrame.add(newGridSquare);
			newGridSquare.setBorder(null);
	  }
}
