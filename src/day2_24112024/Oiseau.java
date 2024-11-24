package day2_24112024;

import java.io.IOException;

public class Oiseau extends Animal{
	
	 @Override
	 Oiseau info() throws IOException
	 {
		 //super.info();
		 System.out.println("Oiseau");
		 return new Oiseau();
	 }
	 @Override
	 public Integer display() {
			return 10;
		}

}
