package com.learn.coding;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class RomanNumeralGenerator {

	public static String intToRoman(int number) {
		StringBuilder romanNumeral = new StringBuilder();
		LinkedHashMap<Integer, String> integerToRoman = new LinkedHashMap<>();
		integerToRoman.put(1000, "M");
		integerToRoman.put(900, "CM");
		integerToRoman.put(500, "D");
		integerToRoman.put(400, "CD");
		integerToRoman.put(100, "C");
		integerToRoman.put(90, "XC");
		integerToRoman.put(50, "L");
		integerToRoman.put(40, "XL");
		integerToRoman.put(10, "X");
		integerToRoman.put(9, "IX");
		integerToRoman.put(5, "V");
		integerToRoman.put(4, "IV");
		integerToRoman.put(1, "I");

		for (Entry<Integer, String> eachEntry : integerToRoman.entrySet()) {
			int numberOfCurrentInt = number / eachEntry.getKey();
			romanNumeral.append(eachEntry.getValue().repeat(numberOfCurrentInt));
			number -= eachEntry.getKey() * numberOfCurrentInt;
			if (number <= 0)
				break;
		}

		return romanNumeral.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 14, 19, 20, 29, 44, 49, 50, 83, 93, 148, 1964, 1900, 3999)
				.forEach(a -> System.out.println(a + " -> " + intToRoman(a)));

	}

}
