
package Battlefield;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controller implements KeyListener{
	Model model;
	Veiw veiw;
public Controller(Model model, Veiw veiw) {
	this.model = model;
	this.veiw = veiw;
}
@Override
public void keyTyped(KeyEvent e) {
	
}
@Override
public void keyPressed(KeyEvent e) {
}
@Override
public void keyReleased(KeyEvent e) {
}

}
