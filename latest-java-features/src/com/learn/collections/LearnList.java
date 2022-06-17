package com.learn.collections;

import java.util.ArrayList;

public class LearnList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("abc");
		names.add("def");
		names.add("jkl");
		names.add("abc");

		names.forEach(System.out::println);
		names.remove("abc");
		names.forEach(System.out::println);
	}

}
