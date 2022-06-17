package com.learn.miscellaneous;

public class StringFeatures {

	public static void main(String[] args) {
		jack();
		jill();
		System.out.println("ABC compare def = " + "ABC".compareToIgnoreCase("def"));
		System.out.println("ABC compare abcdefgh = " + "ABC".compareToIgnoreCase("abcdefgh"));
	}

	public static void jack() {
		String s1 = "hill5";
		String s2 = "hill" + "5";
		System.out.println(s1 == s2);
	}

	public static void jill() {
		String s1 = "hill5";
		String s2 = "hill" + s1.length();
		System.out.println(s1 == s2);
	}
}
