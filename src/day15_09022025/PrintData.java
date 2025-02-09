package day15_09022025;

public class PrintData implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Printing record: " + i +" By Thread "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		(new Thread(new PrintData())).start();
		(new Thread(new PrintData())).start();
	}
}
