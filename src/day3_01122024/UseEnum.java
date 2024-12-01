package day3_01122024;

public class UseEnum {

	public static void main(String[] args) {
		
		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
			season.printHours();
		}
		
		OnlyOne firstCall = OnlyOne.ONCE; // prints constructing
		System.out.println("=====");
		OnlyOne secondCall = OnlyOne.TWO; // doesn't print anything

	}

}
