package test1;

public class Test {
	public static void main(String[] args) {
		B1 b1=new B1();
		B1 b2=new B1();
		A1 a=new B1();
		b1.a=15;
		b1.x=16;
		b2.a=18;
		b2.x=19;
		
		b1.m4();
		System.out.println();
		b2.m4();
		System.out.println();
		b1.m3();
		System.out.println();
		b2.m3();
		
		System.out.println();
		System.out.println(b1.a);
		System.out.println(a.a);
		System.out.println();
		System.out.println(b1.x);
		System.out.println(a.x);
	}
}
