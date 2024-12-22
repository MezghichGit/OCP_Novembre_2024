package day7_22122024;

public class Duck implements Comparable<Duck>{

	private String name;
	private int weight;
	

	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Duck o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}
