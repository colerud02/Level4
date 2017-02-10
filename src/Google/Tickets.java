package Google;

import java.util.Arrays;

public class Tickets {
	int[] vendors = {9,5,4,3,1};

	public int buyTickets() {
		int biggestNumber = 0;
		int tempBiggestNumber = 0;
		int permI = -1;
		int ticketsBought = 0;
		int moneySpent = 0;
		for (int i = 0; i < vendors.length; i++) {
			tempBiggestNumber = vendors[i];
		
			if (tempBiggestNumber > biggestNumber) {
				biggestNumber = tempBiggestNumber;
				permI = i;
				moneySpent += vendors[permI];
			}
			vendors[permI] --;
			ticketsBought ++;
		}
		System.out.println("Vendor array: "+ Arrays.toString(vendors));
		System.out.println("Tickets bought: "+ticketsBought);
		return moneySpent;
	}

	public Tickets() {
		// TODO Auto-generated constructor stub
	}

}