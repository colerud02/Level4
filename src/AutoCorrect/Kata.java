package AutoCorrect;

public class Kata {
	int j = 0;
	int x = 0;

	public static String autocorrect(String string) {
		return string.replaceAll("(?i)\\b(u|you+)\\b", "your sister");
	}

}
