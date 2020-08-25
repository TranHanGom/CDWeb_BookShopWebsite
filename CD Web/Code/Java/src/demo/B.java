package demo;

public class B extends A {
	public B() {
		super(y);
		y += 2;
	}
	public static void main(String[] args) {
		new B();
		System.out.println(y);
	}
}
