package com.learn.coding;

public class SecondLargestInUnsortedArray {

	public static void main(String[] args) {
		int[] arr = { 5, 5, 5 };
		int max = 0, second_max = 0;
		for (int a : arr) {
			if (a > max) {
				second_max = max;
				max = a;
			} else if (a < max && a > second_max) {
				second_max = a;
			}
		}
		System.out.println(max + " " + second_max);
	}

}
