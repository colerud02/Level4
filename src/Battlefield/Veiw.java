package Battlefield;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Veiw{
	JFrame Frame = new JFrame();
	JPanel playerPanel = new JPanel();
	JPanel enemyPanel = new JPanel();
	public Veiw() {
		Frame.setVisible(true);
		Frame.add(playerPanel);
		Frame.add(enemyPanel);
		JLabel[][] playerBoard = new JLabel [5][5];
		JLabel[][] enemyBoard = new JLabel [5][5];
		for (int row = 0; row < playerBoard.length; row++) {
			for (int columns = 0; columns < playerBoard.length; columns++) {
				playerBoard[row][columns] = new JLabel("hi"); 
				playerPanel.add(playerBoard[row][columns]);
				enemyBoard[row][columns] = new JLabel("Hello"); 
				enemyPanel.add(enemyBoard[row][columns]);
			}
		}
	}
public void addListener(Controller controller){
	playerPanel.addMouseListener(controller);
}
}
