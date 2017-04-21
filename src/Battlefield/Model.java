package Battlefield;

import java.util.ArrayList;
import java.util.Random;

public class Model {
	boolean[][] playerBoard = new boolean[10][10];
	boolean[][] enemyBoard = new boolean[10][10];
	int xCoordinate;
	int yCoordinate;
	ArrayList<Ship> ships = new ArrayList<Ship>();
	ArrayList<Ship> ships1 = new ArrayList<Ship>();

	public Model() {
		for (int i = 0; i < enemyBoard.length; i++) {
			for (int j = 0; j < enemyBoard.length; j++) {
				playerBoard[i][j] = false;
				enemyBoard[i][j] = false;
			}
		}
		for (int i = 0; i < 10; i++) {
			ships.add(new Ship());
		}
		for (Ship ship : ships) {
			enemyBoard[ship.x][ship.y] = true;
		}
		for (int i = 0; i < 10; i++) {
			ships1.add(new Ship());
		}
		for (Ship ship : ships1) {
			playerBoard[ship.x][ship.y] = true;
		}
	}

	public boolean[][] getPlayerBoard() {
		return playerBoard;
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
		int x = Integer.parseInt(xCoordinate + "");
		this.xCoordinate = x;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(char yCoordinate) {
		int y = Integer.parseInt(yCoordinate + "");
		this.yCoordinate = y;
	}
	public int randomNumber(){
		int x;
		return 	x = new Random().nextInt(10);
		
	}
	public int randomNumber1(){
		int x;
		return 	x = new Random().nextInt(10);
		
	}
	public boolean gameFinished(boolean array[][]){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			if (array[i][j] == ) {
				
			}
		}
	}
		return false;
		
	}
}
