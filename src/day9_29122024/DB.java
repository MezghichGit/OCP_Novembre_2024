package day9_29122024;

public class DB implements AutoCloseable{

	public DB()
	{
		System.out.println("Constructor");
	}
	public void processing()
	{
		System.out.println("Processing");
	}
	@Override
	public void close() throws Exception {
		System.out.println("DB closed");
		
	}

}
