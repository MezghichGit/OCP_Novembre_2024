package day3_01122024;
/*
public enum Season {
	WINTER
	{

		@Override
		public void printHours() {
			System.out.println("Short Hours");
			
		}}, 
	SPRING {
		@Override
		public void printHours() {
			System.out.println("Medium Hours");
			
		}
	}, 
	SUMMER {
		@Override
		public void printHours() {
			System.out.println("Long Hours");
			
		}
	}, 
	FALL {
		@Override
		public void printHours() {
			System.out.println("Medium Hours");
			
		}
	};
	
	public abstract void printHours();
}
*/

public enum Season {
	WINTER
	{

		@Override
		public void printHours() {
			System.out.println("Short Hours");
			
		}}, 
	SUMMER {
		@Override
		public void printHours() {
			System.out.println("Long Hours");
			
		}
	}, 
	SPRING, FALL ;
	
	public void printHours() {
		System.out.println("Default hours");
		
	}
}
