package com.learn.inheritance;

interface Top {
	public default void foo() {
		System.out.println("Top");
	}
}

interface I1 extends Top {
	@Override
	public default void foo() {
		System.out.println("I1");
	}
}

interface I2 extends Top {
	@Override
	public default void foo() {
		System.out.println("I2");
	}

}

interface I3 extends I1, I2 {

	@Override
	default void foo() {
		// TODO Auto-generated method stub
		I1.super.foo();
		I2.super.foo();
	}

}

class C1 implements I3 {

}

public class LearnDiamondProblem {
	public static void main(String[] args) {
		I1 class1 = new C1();
		class1.foo();
	}
}
