package day13_26012025;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter_PrintStream {

	public static void main(String[] args) throws FileNotFoundException {
		try (PrintWriter out = new PrintWriter("zoo.log")) {
			out.print(5); // PrintWriter method
			out.write(String.valueOf(5)); // Writer method
		}

	}

}
