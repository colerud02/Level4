package Battlefield;

import javax.swing.text.View;

public class Driver {
public static void main(String[] args) {
	Veiw veiw = new Veiw();
	Model model = new Model();
	Controller conroller = new Controller(model, veiw);
	
}


}
