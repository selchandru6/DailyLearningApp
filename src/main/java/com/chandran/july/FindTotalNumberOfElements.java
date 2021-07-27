package com.chandran.july;

import java.util.Arrays;
import java.util.List;

/*
 * Purpose : Find the total number of elements present in the list using Stream functions.
 * Date : 08/26/2021.
 */

public class FindTotalNumberOfElements {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(101, 125, 84, 459, 2325, 9458, 33398, 3452, 23415);
		long count = myList.stream().count();
		System.out.println(count);
	}

}
