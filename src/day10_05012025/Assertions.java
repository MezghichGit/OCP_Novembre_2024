package day10_05012025;

public class Assertions {
	
	public void test() {
		throw new RuntimeException(); //unchecked
	}
	
	public static void test2() throws Exception {
		throw new Exception(); //checked
	}
	
	
	public static void main(String[] args)  {
		int numGuests = -5;
		assert (numGuests > 0):"nbre négatif";
		System.out.println(numGuests);
		
		try {
			test2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
} 
