package com.interview;

import java.util.HashMap;
import java.util.Map;
//count words in string using hashmap
public class CountWords {

	public static void main(String[] args) {
		String string = "This this is is java java code bro";
		Map<String, Integer> map = new HashMap<>();
		String[] string2 = string.split(" ");
//		for (int i = 0; i < string2.length; i++) {
//			int count = 1;
//			if (map.containsKey(string2[i])) {
//				map.put(string2[i], count + 1);
//			} else {
//				map.put(string2[i], count);
//			}
//		}
//		System.out.println(map);

		for (String i : string2) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		System.out.println(map);
	}
}
