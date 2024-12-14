package day6_14122024.bounds;

import java.util.ArrayList;

public class ExempleGenerics {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		a = o;
		a = new Animal();
		
		ArrayList<? extends Animal>la = new ArrayList<Animal>();
		la = new ArrayList<Oiseau>();
		la = new ArrayList<Canari>();
		
		ArrayList<?>lo = new ArrayList<String>();
		lo = new ArrayList<Animal>();
		lo = new ArrayList<Integer>();
		
		ArrayList<? super Canari>lc = new ArrayList<Animal>();
		la = new ArrayList<Oiseau>();
		la = new ArrayList<Canari>();
		
		ArrayList<? super Oiseau>loi = new ArrayList<Animal>();
		loi = new ArrayList<Oiseau>();
		//loi = new ArrayList<Canari>();
	}

}
