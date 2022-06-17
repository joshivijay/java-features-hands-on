package com.learn.collections;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("abc");
		names.add("pqr");
		names.add(null);
		names.add("abc");
		names.add(null);
		names.forEach(System.out::println);
	}

}
