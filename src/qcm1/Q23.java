package qcm1;

public class Q23 {

	public static void main(String[] args) {
		Float f = null;
		try {
			f = Float.valueOf("12.3"); // de String ==> Float
			String s = f.toString();
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Trouble : "+f);
		}

	}

}
