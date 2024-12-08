package qcm1_05122024;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Predicate pre;
		var x = 10;
		final var ch = new String("OCP");
		ImpPrediction ip = new ImpPrediction();
		ip.test();
		
		Prediction p = ()->true;
		System.out.println(p.test());
		Prediction p2 = ()->false;
		System.out.println(p2.test());
		
		Calcul som = (double a, double b)->{int t = 0; return a+b;}; //  syntaxe versbose (complète)
		Calcul som1 = (a,b)-> a+b; //  syntaxe reduite 
		
		System.out.println(som.operation(12,20));
		
		Calcul prod = (double a, double b)->{return a*b;};
		
		System.out.println(prod.operation(12,20));
		
		Prediction p3 = (String ch2)->true;
		Prediction p4 = ch2->true;
		
		V v = ()->{};

	}

}
