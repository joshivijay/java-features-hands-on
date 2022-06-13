package com.learn.streams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class LearnStream {
	public static void main(String[] args) {
		String str = "TestCharsCount";
		str.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(Function.identity(), (a) -> 1, (a, b) -> a + 1))
				.forEach((a, b) -> {
					System.out.println("key: " + a + " value: " + b);
				});
	}
}
