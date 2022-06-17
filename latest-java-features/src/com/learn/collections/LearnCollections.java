package com.learn.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LearnCollections {

	public static void main(String[] args) {
		HashMap<String, String> props = new HashMap<>();
		props.put("jdbc", "mysql");
		props.put("jms", "amq");

		for (Entry<String, String> eachEntry : props.entrySet()) {
			if (eachEntry.getKey().equals("jms")) {
				// eachEntry.setValue("ibm mq");
				props.put("queue", "some value");
			}
		}

		props.forEach((a, b) -> System.out.println("Key = " + a + " Value = " + b));
		// Iterator<E>
		Iterator<Entry<String, String>> iterator = props.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> eachEntry = iterator.next();
			if (eachEntry.getKey().equals("jms")) {
				eachEntry.setValue("active mq");
			}
		}

		props.forEach((a, b) -> System.out.println("Key = " + a + " Value = " + b));
	}

}
