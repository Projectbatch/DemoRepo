package test;

public class B1 extends A1{
	static int b=m1();
	static int m1() {
		System.out.println("B SV");
		return 20; 
	}
	static {
		System.out.println("B SB");
	}
	public static void main(String[] args) {
		System.out.println("B main");
		System.out.println("B main a:"+a);
		System.out.println("B main b:"+b);
	}
	
}
