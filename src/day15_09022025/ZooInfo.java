package day15_09022025;

import java.util.concurrent.*;

public class ZooInfo {
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(() -> System.out.println("Printing zoo inventory "+Thread.currentThread().getName()));
			service.execute(() -> {
				for (int i = 0; i < 3; i++)
					System.out.println("Printing record: " + i+ " " +Thread.currentThread().getName());
			});
			service.execute(() -> System.out.println("Printing zoo inventory "+Thread.currentThread().getName()));
			System.out.println("end");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
