import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class image extends JPanel{
	JFrame jf = new JFrame();
public image() {
	jf.add(this);
	jf.setVisible(true);
	jf.setSize(1920, 1080);
}
public void paintComponent(Graphics g){

}
public static void main(String[] args) {
	image i = new image();
	
}
}
