package test;

public class Test8 {
	public static void main(String[] args) {
		
	B8 b1=new B8();
	A8 a1=b1;
	
		System.out.println(b1.a);
		System.out.println(a1.a);
	//	System.out.println(B8.a+"..."+A8.a);
		
/*		b1.a=5;
		a1.a=7;
*/		
		System.out.println(b1.x);
		System.out.println(a1.x);
//		System.out.println(A8.a+"..."+B8.a);
	}
}
