package com.chandran.july;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * This program is for finding the duplicate numbers.
 * Date : 08/26/2021.
 */

public class FindDuplicateElements {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<Integer>();
        myList.stream()
              .filter(n -> !set.add(n))
              .forEach(System.out::println);
	}

}
