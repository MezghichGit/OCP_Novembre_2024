package day5_08122024;

public class Main {
	
	enum Season {WINTER, SPRING, SUMMER, FALL}
	String getWeather(Season value) {
	return switch(value) {
	case WINTER ->{ yield "Cold";}
	case SPRING -> "Rainy";
	case SUMMER -> "Hot";
	default -> "Warm";
	//case FALL -> "Warm";
	};
	}


	static int val() {
		return 10;
	}

	public static void printDayOfWeek(int day) {
		var result = switch (day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid value";
		};
		System.out.print(result);
	}
	public void printSeason(int month) {
		switch(month) {
		case 1, 2, 3 -> System.out.print("Winter");
		case 4, 5, 6 -> System.out.print("Spring");
		case 7, 8, 9 -> System.out.print("Summer");
		case 10, 11, 12 -> System.out.print("Fall");
		} }
	
	public void printSeason2(int month) {
		String res = switch(month) {
		case 1, 2, 3 -> "Winter";
		case 4, 5, 6 -> "Spring";
		case 7, 8, 9 -> "Summer";
		case 10, 11, 12 -> "Fall";
		default ->"Ok";
		};
		//return res;
		}

	public static void main(String[] args) {
		int month = 5;
		printDayOfWeek(0);
		/*
		 * switch (month) { case 1, 2, 3: System.out.print("Winter"); case 4, 5, 6:
		 * System.out.print("Spring");// break; default: System.out.print("Unknown");
		 * case 7, 8, 9: System.out.print("Summer"); case 10, 11, 12:
		 * System.out.print("Fall"); }
		 */
		/*
		 * int day = 2;
		 * 
		 * switch(day) { case 1:case 2 : System.out.println("Work hard"); break; //
		 * before java 14 case 3,4,5 : System.out.println("Work hard more"); break;//
		 * from java 14 case 6,7 : System.out.println("vacation"); break; default :
		 * System.out.println("invalid value"); }
		 */
		
		int fish = 5;
		int length = 12;
		var name = switch(fish) {
		case 1 -> "Goldfish";
		case 2 -> {yield "Trout";}
		case 3 -> {
		if(length > 10) yield "Blobfish";
		else yield "Green";
		}
		default -> "Swordfish";
		};


	}

}
