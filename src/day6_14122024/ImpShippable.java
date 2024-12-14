package day6_14122024;

public class ImpShippable<T> implements Shippable<T>{

	@Override
	public void ship(T t) {
		System.out.println(t);
		
	}

}
