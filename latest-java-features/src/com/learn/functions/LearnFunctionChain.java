package com.learn.functions;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.stream.IntStream;

import com.learn.comparators.MyPrivate;

public class LearnFunctionChain {

	public static void main(String[] args) {
		Function<Integer, Integer> multiplyByTwo = i -> 2 * i;
		Function<Integer, Integer> sqaure = i -> i * i;
		Function<Integer, Integer> multiplyByTwoAndSquare = multiplyByTwo.andThen(sqaure);
		IntStream.of(7, 1, 1, 6, 7, 2, 8, 2, 9, 10).boxed().map(multiplyByTwoAndSquare).forEach(System.out::println);
		System.out.println(LocalDateTime.now());
	}

}

class TestProtected extends MyPrivate {
	TestProtected() {
		this.id = 8;
	}
}
