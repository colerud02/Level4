package STRINGTHINGS;

import java.util.Scanner;

public class StringThings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.next();
		String secondString = scanner.next();
		int a = 0;
		int b = 0;
		int c = 0;
		a = firstString.length();
		b = secondString.length();
		
		// 1. Print the total length of the strings.
		System.out.println(a + b);
		// 2. Is firstString lexicographically larger than than secondString? Print "Yes" or "No".
		// Hint: check out the compareTo() method in the String class.
		c = firstString.compareTo(secondString);
		if (c > 0) {
			System.out.println("Yes! " + c + " larger!");

		} else {
			System.out.println("No! " + c + " smaller!");
		}
		// 3. Capitalize both strings and print them on a single line separated by a space.
		
		System.out.println( firstString.substring(0,1).toUpperCase()+ firstString.substring(1,firstString.length())
		+ " "+ secondString.substring(0,1).toUpperCase()+ secondString.substring(1,firstString.length()));
		
	}
}
