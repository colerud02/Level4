package Battlefield;

public class Model {
	boolean[][] playerBoard = new boolean[10][10];
	boolean[][] enemyBoard = new boolean[10][10];
	int xCoordinate;
	int yCoordinate;
public Model() {
	for (int i = 0; i < enemyBoard.length; i++) {
		for (int j = 0; j < enemyBoard.length; j++) {
			playerBoard[i][j] = true;
			enemyBoard[i][j] = true;
		}
	}
}
	public boolean checkLocationOnPlayerBoard(int x, int y) {
		return playerBoard[x][y];
	}

	public boolean checkLocationOnEnemyBoard(int x, int y) {
		return enemyBoard[x][y];
	}
	
	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(char xCoordinate) {
		int  x = Integer.parseInt(xCoordinate+"");
		this.xCoordinate = x;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(char yCoordinate) {
		int y = Integer.parseInt(yCoordinate+"");
		this.yCoordinate = y;
	}

}
