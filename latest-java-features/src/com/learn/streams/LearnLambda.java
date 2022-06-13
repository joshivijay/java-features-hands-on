package com.learn.streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class LearnLambda {

	public static void main(String[] args) {
		int offset = 0;
		ArrayList<Integer> listInt = new ArrayList<>();
		IntStream.range(1, 5).forEach(a -> {
			// offset = 1;
			// ^ This is not allowed
			// Reason Local variable offset defined in an enclosing scope must be final or
			// effectively final
			listInt.add(a); // This is allowed as ref variable is not reassigned
		});
		System.out.println(offset);
	}

}
