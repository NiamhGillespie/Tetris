import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
		grid.setBounds(25, 50, numberOfSquares * 20 + 50, numberOfSquares * 20+ 50);
	    TetrisSetup.tetrisFrame.add(grid);
		
		JLabel playerScore = new JLabel("Score: "); //+ getCurrentScore());
		playerScore.setBounds(25,height*2 + 60, 50, 20);
		TetrisSetup.tetrisFrame.add(playerScore); // will display score at bottom of board
		
		// NEED TO IMPLEMENT THIS AT LATER DATE :)
		JButton howToPlay = new JButton("How to play"); //+ getCurrentScore());
		howToPlay.setBounds(25 + width*2 - 100,height*2 + 60,100, 20);
		TetrisSetup.tetrisFrame.add(howToPlay);
		
		JButton mainMenuButton = new JButton("Main Menu"); //+ getCurrentScore());
		mainMenuButton.setBounds(25,20,100,20);
		TetrisSetup.tetrisFrame.add(mainMenuButton);
		
		mainMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("main menu button clicked!");
                TetrisSetup.tetrisFrame.getContentPane().removeAll();
        		TetrisSetup.tetrisFrame.repaint();
                TetrisSetup.main(null);
            }
        });
	}
	

	public void createGrid() {
		JLabel newGridSquare = new JLabel(" ");
		for ( int x = 100; x <= numberOfSquares * 20 ; x += 20 )
		  for ( int y = 100; y <= numberOfSquares * 20; y += 20 ) 			 
		  	newGridSquare.setBounds(x, y, 20, 20);
			TetrisSetup.tetrisFrame.add(newGridSquare);
			newGridSquare.setBorder(null);
	  }
}
