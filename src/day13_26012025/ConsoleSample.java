package day13_26012025;

import java.io.Console;

public class ConsoleSample {

	public static void main(String[] args) {
		Console console = System.console();
		if(console!=null)
		{
			String userInput = console.readLine("Donner votre nom");
			console.writer().println("Vous avez taper : " +userInput);
		}
		

	}

}
