package test1;

public class B extends A{
	static void m1() {
		System.out.println("B m1");
	}
	void m3() {
		System.out.println("B m3");
		m1();
		super.m2();
	}
}

