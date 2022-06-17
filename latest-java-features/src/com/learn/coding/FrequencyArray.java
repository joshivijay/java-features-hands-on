package com.learn.coding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyArray {

	public static List<Integer> countingSort(List<Integer> arr) {
		List<Integer> frequencyArray = IntStream.generate(() -> 0).limit(100).boxed().collect(Collectors.toList());
		arr.forEach(a -> frequencyArray.set(a, frequencyArray.get(a) + 1));
		return frequencyArray;
	}

	public static void main(String[] args) {
		List<Integer> input = List.of(1, 2, 3, 4, 3, 2, 1);
		System.out.println(countingSort(input));
	}

}
