package wrapper_classes;

public class Autoboxing {

	public static void main(String[] args) {
		
		// auto boxing :- Automatic conversion of primitive to wrapper object :Integer.valueOf()
		Integer i=108;
		System.out.println(i);
		
		// autoUnboxing :-automatic conversion of wrapper object to primitive :xxxValue()
		double d=Integer.valueOf(100);
        // int d1=Double.valueOf(100); //--> Not possible
		double d2=Double.valueOf(100);
		System.out.println(d);
	}

}
