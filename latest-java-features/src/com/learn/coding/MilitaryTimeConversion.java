package com.learn.coding;

public class MilitaryTimeConversion {

	public static String timeConversion(String s) {
		StringBuilder answer = new StringBuilder(s);
		if (s.endsWith("AM") && s.startsWith("12"))
			answer.replace(0, 2, "00");
		else if (s.endsWith("PM") && !s.startsWith("12")) {
			int hour = Integer.valueOf(s.substring(0, 2));
			hour += 12;
			answer.replace(0, 2, String.valueOf(hour));
		}
		return answer.delete(8, 10).toString();
	}

	public static void main(String[] args) {
		System.out.println(timeConversion("12:05:45AM"));
		System.out.println(timeConversion("12:05:45PM"));
		System.out.println(timeConversion("10:05:45PM"));
		System.out.println(timeConversion("10:05:45AM"));
		System.out.println(timeConversion("02:05:45AM"));
	}

}
