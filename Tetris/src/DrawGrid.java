import java.awt.Graphics;
import javax.swing.*;

@SuppressWarnings("serial")
public class DrawGrid extends JPanel{
	
	@Override
	public void paintComponent(Graphics graphics) {
		for ( int x = 0; x <=  Board.numberOfSquares * 20 ; x += 20 )
		  for ( int y = 0; y <= Board.numberOfSquares * 20; y += 20 ) 
			 graphics.drawRect(x, y, 20, 20);
	}

//	  public static void main(String[] args) {
//	    JPanel grid = new DrawGrid();
//	    grid.setBounds(100, 100,Board.numberOfSquares * 20 + 200,Board.numberOfSquares * 20 + 200);
//	    TetrisSetup.tetrisFrame.add(grid);
//	  }
}
