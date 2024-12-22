package day7_22122024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestDuck {
	
	

	public static void main(String[] args) {
		Comparator<Duck> byWeigth = new Comparator<>() {

			@Override
			public int compare(Duck o1, Duck o2) {
				// TODO Auto-generated method stub
				return o1.getWeight()-o2.getWeight();
			}
			
		};
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack",7));
		ducks.add(new Duck("Puddles",10));
		
		Collections.sort(ducks); // sort by name
		System.out.println(ducks); // [Puddles, Quack]
		
		Collections.sort(ducks,byWeigth); 
		System.out.println(ducks);

	}

}
