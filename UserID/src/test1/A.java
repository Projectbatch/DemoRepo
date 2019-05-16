package test1;

public class A {
	static void m1() {
		System.out.println("A m1");
	}
	static void m2() {
		System.out.println("A m2");
		m1();
	}
	
}
