
import java.util.Scanner;

public class StringThings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.next();
		String secondString = scanner.next();

		// 1. Print the total length of the strings.
		System.out.println(firstString.length() + secondString.length());
		// 2. Is firstString lexicographically larger than than secondString? Print "Yes" or "No". Hint: check out the compareTo() method in the String class.
		firstString.compareTo(secondString);
		// 3. Capitalize both strings and print them on a single line separated by a space.
		
	}
}
