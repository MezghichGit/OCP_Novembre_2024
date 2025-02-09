import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTasks {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		/*
		Runnable task1 = () -> System.out.println("Hello Zoo");
		Callable<String> task2 = ()->{System.out.println("Monkey"); return "Monkey";};
		
		Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
		Future<?> result2 = service.schedule(task2, 8, TimeUnit.SECONDS);
		*/
		System.out.println(LocalDateTime.now());
		Runnable task3 = () -> System.out.println(LocalDateTime.now());
		service.scheduleAtFixedRate(task3, 2, 3, TimeUnit.SECONDS);

	}

}
