package com.learn.coding;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LonelyInteger {

	public static int lonelyinteger(List<Integer> a) {
		Map<Integer, Integer> ans = a.stream().collect(Collectors.toMap(Function.identity(), i -> 1, (i, j) -> i + 1));
		for (Entry<Integer, Integer> eachEntry : ans.entrySet()) {
			if (eachEntry.getValue() == 1)
				return eachEntry.getKey();
		}
		return 0;
	}

	public static void main(String[] args) {
		List<Integer> input = List.of(1, 2, 3, 4, 3, 2, 1);
		System.out.println(lonelyinteger(input));
	}

}
