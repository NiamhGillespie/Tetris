import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintShapes extends JPanel{
	
	// add in rotation
	private static int x;
	private static int y;
	private static Shapes shape;
	private static int shapeRotation;
	
	public static void getInformation(int xCoordinate, int yCoordinate, Shapes shapes, int rotation) {
		x = xCoordinate;
		y= yCoordinate;
		shape = shapes;
		shapeRotation = rotation;
	}
	
	public void paintComponent(Graphics graphics) {
		// rotation doesn't matter for square
		if (shape == Shapes.SQUARE_SHAPE) {
			graphics.drawRect(x, y, 40, 40);
			Graphics2D graphics2D = (Graphics2D) graphics;

			graphics2D.setPaint(new Color(183, 246, 226));
			graphics.fillRect(x,y,40,40);
			graphics2D.setPaint(Color.BLACK);
			graphics.drawRect(x, y, 20,20);
			graphics.drawRect(x + 20, y, 20,20);
			graphics.drawRect(x + 20, y + 20, 20,20);
			graphics.drawRect(x, y + 20, 20,20);
		}
		
		if (shape == Shapes.STRAIGHT_SHAPE) {
			if (shapeRotation == 1 || shapeRotation == 3 ) {
				graphics.drawRect(x, y, 20, 80);
				Graphics2D graphics2D = (Graphics2D) graphics;

				graphics2D.setPaint(new Color(223, 160, 219));
				graphics.fillRect(x,y,20,80);
				graphics2D.setPaint(Color.BLACK);
				graphics.drawRect(x, y, 20,20);
				graphics.drawRect(x, y + 20, 20,20);
				graphics.drawRect(x, y + 40, 20,20);
				graphics.drawRect(x, y + 60, 20,20);
			} else {
				graphics.drawRect(x, y, 80,20);
				Graphics2D graphics2D = (Graphics2D) graphics;

				graphics2D.setPaint(new Color(223, 160, 219));
				graphics.fillRect(x,y,80,20);
				graphics2D.setPaint(Color.BLACK);
				graphics.drawRect(x, y, 20,20);
				graphics.drawRect(x + 20, y, 20,20);
				graphics.drawRect(x + 40, y, 20,20);
				graphics.drawRect(x + 60, y, 20,20);
			}
			
		}
	}

	public static void main(String args[]) {
		getInformation(25,25, Shapes.STRAIGHT_SHAPE, 2);
		
		JFrame tetrisFrame = new JFrame("Tetris");
		tetrisFrame.setSize(700, 700);
		tetrisFrame.setVisible(true);
		tetrisFrame.setLayout(null);
		
//		DrawGrid grid = new DrawGrid();
//		grid.setBounds(25, 50, 10 * 20, 10 * 20);
//	    tetrisFrame.add(grid);
	    
		PaintShapes straight = new PaintShapes();
		straight.setBounds(x + 200, y, 110, 110);
	    tetrisFrame.add(straight);
	    
//	    getInformation(100,50, Shapes.SQUARE_SHAPE, 1);
//	    PaintShapes square = new PaintShapes();
//		square.setBounds(x + 200, y, 120, 120);
//	    tetrisFrame.add(square);
		
		
	}
}
