
package Battlefield;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controller implements KeyListener {
	Model model;
	Veiw veiw;
	boolean typed = false;

	public Controller(Model model, Veiw veiw) {
		this.model = model;
		this.veiw = veiw;
		veiw.addListener(this);
	}

	public void updateVeiw() {
		veiw.setXint(model.getxCoordinate());
		veiw.setYint(model.getyCoordinate());
		veiw.setText();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
		if (typed == false) {
			model.setxCoordinate(e.getKeyChar());
			updateVeiw();
			typed = true;

		} else {
			model.setyCoordinate(e.getKeyChar());
			updateVeiw();
			typed = false;

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
