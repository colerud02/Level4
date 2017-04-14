package Battlefield;

import java.util.Random;

public class Ship {
	int x;
	int y;
public Ship() {
	for (int i = 0; i < 10; i++) {
	x = new Random().nextInt(10);
	y = new Random().nextInt(10);
	}
}	

}
