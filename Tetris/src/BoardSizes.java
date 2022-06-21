

public enum BoardSizes {
	
	HARD(100,100,10), MEDIUM(200,200,20), EASY(300,300,30), CUSTOM;

	private final int width;
	private final int height;
	private final int sqaures;
	
	private BoardSizes(int width, int height, int square) {
		this.width = width;
		this.height = height;
		this.sqaures = square;
	}

	private BoardSizes() {
		//add constraints here as well - use while loop?
//		int userInputWidth = ;
//		int userInputHeight = ;
		this.width = 0;
		this.height = 0;
		this.sqaures = 0;
	}
	
	protected int[] getBoardSize() {
		return new int[] {this.width, this.height, this.sqaures};
	}
}
