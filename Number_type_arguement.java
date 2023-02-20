package wrapper_classes;

public class Number_type_arguement {
	 static void square(Number n) {
		System.out.println(n.toString());
	}
	public static void main(String[] args) {
		square(Integer.valueOf(10));
		square(Float.valueOf(10.5f));
		
		// Here the input type is Number but we have passed primitive type.Here the compiler will use autoboxing to convert primitive to wrapper class
		square(12);
		square(13.5);
	}
}
