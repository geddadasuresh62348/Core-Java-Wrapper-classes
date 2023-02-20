package wrapper_classes;

public class Wrapper_class {

	public static void main(String[] args) {
        //deprecated since java 9
		Integer i1=new Integer(25);
		Integer i2=new Integer("56");
		System.out.println(i1+i2);
		
		//recommended approach
		Integer i3=Integer.valueOf(35);
		Integer i4=Integer.valueOf("35");
		System.out.println(i3+i4);
		
		Float f1=new Float(10.4);
		Float f2=Float.valueOf("10.4");
		System.out.println(f1+f2);
// to the boolean constructor if we pass other than true or false,always it returns false.
		Boolean b1=Boolean.valueOf(true); //true
		Boolean b2=Boolean.valueOf(false); //false
		Boolean b3=Boolean.valueOf("true"); //true
		Boolean b4=Boolean.valueOf("false"); //false
		Boolean b5=Boolean.valueOf(" "); //false
		Boolean b6=Boolean.valueOf(""); //false
		Boolean b7=Boolean.valueOf(null); //false
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
	}

}
