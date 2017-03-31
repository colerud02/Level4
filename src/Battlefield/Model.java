package Battlefield;

public class Model {
	boolean[][] playerBoard;
	boolean[][] enemyBoard;
	int xCoordinate;
	int yCoordinate;

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
