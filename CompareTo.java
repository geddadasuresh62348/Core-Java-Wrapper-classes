package wrapper_classes;
//1. If both values are equal returns 0;
//2. If value1>value2 returns 1
//3. If value1<value2 returns -1
public class CompareTo {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf(10);
		Integer i2=Integer.valueOf(20);
		Integer i3=Integer.valueOf(10);
		
		System.out.println(i1.compareTo(i2));//10==20-->-1
		System.out.println(i2.compareTo(i1));//20==10-->1
		System.out.println(i2.compareTo(i3));//20==10-->1
		System.out.println(i3.compareTo(i2));//10==20-->-1
		System.out.println(i1.compareTo(i3));//10==10-->0
		
		
		
	}

}
