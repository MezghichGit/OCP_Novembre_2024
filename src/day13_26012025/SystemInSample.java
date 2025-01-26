package day13_26012025;

import java.io.*;

public class SystemInSample {

	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String userInput = reader.readLine();
			System.out.println("Vous avez taper : " + userInput);
		}

	}

}
