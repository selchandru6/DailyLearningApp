/*
 * Purpose : sort all the values present in it in descending order using Stream functions.
 * Date    : Jul 26, 2021
 * Auther  : chandran sellappan
 */
package com.chandran.july;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAllValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15,345435,234,456456,234,5464,23424,423423,23424);

		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}
