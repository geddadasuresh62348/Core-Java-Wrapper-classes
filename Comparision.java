package wrapper_classes;

public class Comparision {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i1==i2);			//false
		System.out.println(i1.equals(i2));  //true
		
		// valueOf() data -128 to 127 with in the range points to same memory		
		Integer i3=Integer.valueOf(10);
		Integer i4=Integer.valueOf(10);
		System.out.println(i3==i4);			//true
		System.out.println(i3.equals(i4));  //true
		
		Integer i5=Integer.valueOf(200);
		Integer i6=Integer.valueOf(200);
		System.out.println(i5==i6);			//false
		System.out.println(i5.equals(i6));  //true
		
		// as it internally uses .valueOf() method
		Integer i7=Integer.valueOf(10);
		Integer i8=Integer.valueOf(10);
		System.out.println(i7==i8);			//true
		System.out.println(i7.equals(i8));  //true
		
		Integer i9=200;
		Integer i10=200;
		System.out.println(i9==i10);		//false
		System.out.println(i9.equals(i10));  //true
	}
}
