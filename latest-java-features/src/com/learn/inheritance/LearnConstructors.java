package com.learn.inheritance;

class TestClass {
	private int i;
	private String msg;

	TestClass() {
		this(0, "default");
	}

	TestClass(int i) {
		this(i, "default");
	}

	TestClass(String msg) {
		this(0, msg);
	}

	TestClass(int i, String msg) {
		this.i = i;
		this.msg = msg;
	}

	void print() {
		System.out.println(i + " " + msg);
	}
}

public class LearnConstructors {

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		System.out.println("new TestClass()");
		tc.print();

		tc = new TestClass(12);
		System.out.println("new TestClass(12)");
		tc.print();

		tc = new TestClass("vj");
		System.out.println("new TestClass(\"vj\")");
		tc.print();

		tc = new TestClass(23, "kj");
		System.out.println("new TestClass(23, \"kj\")");
		tc.print();

	}

}
