package Battlefield;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Veiw {
	static final int HEIGHT = 400;
	static final int WIDTH = 600;
	JFrame Frame = new JFrame();
	JPanel gamePanel = new JPanel();
	JPanel playerPanel = new JPanel();
	JPanel enemyPanel = new JPanel();
	JPanel controlPanel = new JPanel();
	int xint = 0;
	int yint = 0;
	int xint1 = 0;
	int yint1 = 0;
	JLabel[][] playerBoard = new JLabel[10][10];
	JLabel[][] enemyBoard = new JLabel[10][10];
	public int getXint() {
		return xint;
	}

	public void setXint(int xint) {
		this.xint = xint;
		setText();
		}

	public int getYint() {
		return yint;
	}

	public void setYint(int yint) {
		this.yint = yint;
		setText();
	}

	JLabel x = new JLabel("x : -");
	JLabel y = new JLabel("y : -");
	JLabel intructions = new JLabel("Press 'enter' to attack");

	public Veiw() {
		Frame.setVisible(true);
		Frame.setSize(WIDTH, HEIGHT);
		Frame.add(gamePanel);
		gamePanel.add(playerPanel);
		gamePanel.add(enemyPanel);
		Frame.add(controlPanel);
		controlPanel.add(x);
		controlPanel.add(y);
		controlPanel.add(intructions);
		
		for (int row = 0; row < playerBoard.length; row++) {
			for (int columns = 0; columns < playerBoard.length; columns++) {
				gamePanel.setSize(200, 100);
				playerBoard[row][columns] = new JLabel("■");
				playerPanel.add(playerBoard[row][columns]);
				
				enemyBoard[row][columns] = new JLabel("■");
				enemyPanel.add(enemyBoard[row][columns]);
				playerBoard[row][columns].setOpaque(true);
				enemyBoard[row][columns].setOpaque(true);
				playerBoard[row][columns].setBackground(Color.green);
				enemyBoard[row][columns].setBackground(Color.orange);
				playerPanel.setLayout(new GridLayout(10, 10));
				enemyPanel.setLayout(new GridLayout(10, 10));
				gamePanel.setLayout(new GridLayout(1, 2));
				Frame.setLayout(new GridLayout(2, 1));
				playerBoard[row][columns].setBorder(BorderFactory.createLineBorder(Color.black));
				enemyBoard[row][columns].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			}
		}
	}
	public void setText(){
		x.setText("x : "+xint);
		y.setText("y : "+yint);
	}
	public void sinkShip(int x,int y){
		enemyBoard[x][y].setBackground(Color.red);
	}
	public void missedShip(int x, int y){
		enemyBoard[x][y].setBackground(Color.darkGray);
	}
	public void addListener(Controller controller) {
		Frame.addKeyListener(controller);
	}
}
