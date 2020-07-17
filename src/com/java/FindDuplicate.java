package com.java;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

		String str = "Hello selenium hello";
		str = str.toLowerCase();
		String[] word = str.split(" ");

		Set<String> set = new HashSet<>();
		for (String s : word) {
			if (set.add(s) == false) {
				System.out.print(s);
			}

		}

	}
}
