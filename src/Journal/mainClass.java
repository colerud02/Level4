package Journal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		mainClass mc = new mainClass();
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
				if (args[i].equals("entry")) {
					String entry = mc.entry();
					System.out.println(entry);
					mc.writeToFile(entry);
				}
			}
		}
	}

	public String entry() {
		Scanner kb = new Scanner(System.in);
		String entry = null;
		boolean stop = false;
		while (stop == false) {
			String line = kb.nextLine();
			if (line.equals("stop")) {
				stop = true;
			}
			entry += line + "\n";
		}
		return entry;
	}

	public void writeToFile(String entry) {
		File file = new File("jrnl.txt");
		try {
			PrintWriter out = new PrintWriter(file);
			out.println(entry);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
