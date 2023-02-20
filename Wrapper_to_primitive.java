package wrapper_classes;

public class Wrapper_to_primitive {

	public static void main(String[] args) {
		
		//wrapper object to primitive : xxxValue()  where xxx=all data types
		Integer i=Integer.valueOf(10);
		int a=i.intValue();
		double d=i.doubleValue();
		System.out.println(a+" "+d);
	
		//wrapper object to String
		Integer i1=Integer.valueOf(100);
		Integer i2=Integer.valueOf(300);
		
		String s1=i1.toString();// returns the value
		String s2=i2.toString();
		System.out.println(s1+s2);
		System.out.println((s1));
	}

}
