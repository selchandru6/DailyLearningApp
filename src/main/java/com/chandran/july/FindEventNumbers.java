package com.chandran.july;

import java.util.Arrays;
import java.util.List;

/*
 * This program is for finding the even number using streams.
 * Date : 08/26/2021.
 */

public class FindEventNumbers {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}