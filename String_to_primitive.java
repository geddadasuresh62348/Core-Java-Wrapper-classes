package wrapper_classes;

public class String_to_primitive {

	public static void main(String[] args) {
		String str1="100";
		String str2="200";
		
		Integer i=Integer.parseInt(str1);
		Double d=Double.parseDouble(str2);
		System.out.println(i+d);
	}
}
