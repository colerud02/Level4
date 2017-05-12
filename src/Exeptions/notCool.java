package Exeptions;

import java.util.Scanner;

public class notCool {

	public static void main(String[] args) {
		Popular p = new Popular();
	}
	// Create a new Exception class called ‘NotCoolException’ with constructor.

	// Create a new Exception class called ‘OutOfStyleException’ that will inherit from NotCoolExeption with a
	// Constructor.

	// Create a new class called ‘Popular’ with a main method.

	// Create a “hipThings” method that will throw a NotCoolException, and/or OutOfStyleException if an input is uncool.

	// Use syso and the Scanner class to ask the user for everyday things and call the hipThings’ Method
	// hey future lvl 4s - Logan

}

class NotCoolExeption extends Exception {
	public NotCoolExeption() {
		super("not cool bro...");
	}
}

class OutOfStyleException extends NotCoolExeption {
	public OutOfStyleException() {
		super();
	}
}

class Popular {

	Popular(){
		Scanner kb = new Scanner(System.in);
		try {
			hipThings(kb.nextLine());
		} catch (NotCoolExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void hipThings(String string) throws NotCoolExeption {
		if (string == "figit spinner") {
			throw new NotCoolExeption();
		}
		if (string == "shoes") {
			throw new OutOfStyleException();
		}
	}

}
