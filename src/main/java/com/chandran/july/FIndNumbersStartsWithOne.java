package com.chandran.july;

import java.util.Arrays;
import java.util.List;

/*
 * This program is for finding a numbers starts with one.
 * Date : 08/26/2021.
 */


public class FIndNumbersStartsWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,14,17,19,1);
        myList.stream()
              .map(s -> s + "") // Convert integer to String
              .filter(s -> s.startsWith("1"))
              .forEach(System.out::println);

	}

}
