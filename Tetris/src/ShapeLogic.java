import java.awt.Graphics;

public class ShapeLogic {
	
	int[][] coordinates; //0,0 is the leftmost square on the top row of the grid
	Shapes shape; // what shape the shape is
	
	private void createShape(Graphics graphics, Shapes shape) {	
		graphics.setColor(shape);
			@Override
			public void paintComponent(Graphics graphics) {
				graphics.drawRect(x, y, 20, 20);
			}
	}
}
