package com.learn.inheritance;

class Base {
	public void print() {
	}
}

class Base1 extends Base {

}

class Base2 extends Base {

}

public class CastTest {

	public static void main(String[] args) {
		Base b = new Base1();
		((Base2) b).print();
	}

}
