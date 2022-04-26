package com.learn.coding;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class FirstNonRepeatingCharacter {

	public static char getFirstNonRepeatingCharacter(String s) {

		LinkedHashSet<Character> charSet = new LinkedHashSet<>();
		for (char c : s.toCharArray()) {
			char lowercaseChar = Character.toLowerCase(c);
			char uppercaseChar = Character.toUpperCase(c);
			if (charSet.contains(c)) {
				charSet.remove(c);
			} else if (charSet.contains(uppercaseChar)) {
				charSet.remove(uppercaseChar);
			} else if (charSet.contains(lowercaseChar)) {
				charSet.remove(lowercaseChar);
			} else {
				charSet.add(c);
			}
		}
		return charSet.stream().findFirst().get();
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("turtle");
		list.add("Turtle");
		list.add("power");
		list.add("Futile");
		list.forEach(s -> System.out.println(s + " -> " + getFirstNonRepeatingCharacter(s)));
	}

}
