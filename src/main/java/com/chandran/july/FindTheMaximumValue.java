package com.chandran.july;

import java.util.Arrays;
import java.util.List;

/*
 * Purpose : Find the maximum value element present in it using Stream functions.
 * Date : 08/26/2021.
 */

public class FindTheMaximumValue {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                         .max(Integer::compare)
                         .get();
        System.out.println(max);       
	}
}
