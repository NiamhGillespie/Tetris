import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TetrisSetup{
	protected static JFrame tetrisFrame = new JFrame("Tetris");
	// i want to create a pop up 
	// i want to be able to choose a board size
	// i want to call board to create a blank board of that size
	// maybe include a leader board function here too
	
	public static void main(String args[]) {
		
		tetrisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		tetrisFrame.setSize(400, 400);
		tetrisFrame.setVisible(true);
		tetrisFrame.setLayout(null);
		
		JLabel modeInstructions = new JLabel("Choose a mode, any mode :)"); // add more in here
		modeInstructions.setBounds(110,50,160, 40);
		tetrisFrame.add(modeInstructions);
		
		JButton hardModeButton = new JButton("Hard \n 10x10");
		hardModeButton.setBounds(130,100,120, 40);
		
		JButton mediumModeButton = new JButton("Medium \n 20x20");
		mediumModeButton.setBounds(130,150,120, 40);
		
		JButton easyModeButton = new JButton("Easy \n 30x30");
		easyModeButton.setBounds(130,200,120, 40);
		
		JButton customModeButton = new JButton("Custom \n ?x?");
		customModeButton.setBounds(130,250,120, 40);
		          
		tetrisFrame.add(hardModeButton);
		tetrisFrame.add(mediumModeButton);
		tetrisFrame.add(easyModeButton);
		tetrisFrame.add(customModeButton);
		
		Board tetrisBoard = new Board();
		hardModeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("hard button clicked!");
                tetrisBoard.createBoard(BoardSizes.HARD);
            }
        });
		
		mediumModeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("medium button clicked!");
                tetrisBoard.createBoard(BoardSizes.MEDIUM);
            }
        });
		
		easyModeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("easy button clicked!");
                tetrisBoard.createBoard(BoardSizes.EASY);
            }
        });
		
		customModeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("custom button clicked!");
                tetrisBoard.createBoard(BoardSizes.CUSTOM);
            }
        });
	}

}
