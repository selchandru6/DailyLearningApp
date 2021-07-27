package com.chandran.july;

import java.util.Arrays;
import java.util.List;

/*
 * This program is for finding the first number.
 * Date : 08/26/2021.
 */

public class FindTheFirstElement {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().findFirst().ifPresent(System.out::println);
	}
}
