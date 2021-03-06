package com.chandran.july;
/*
 * Purpose : You can read a dedicated article about Optional here.
 * Date    : Jul 28, 2021
 * Auther  : chandransellappan
 */

import java.util.Arrays;

public class OptionalExample {

	public static void main(String[] args) {
		int max1 = Arrays.stream(new int[] { 1, 2, 3, 4, 5,56,34,29,76 }).max().orElse(0);

		int max2 = Arrays.stream(new int[] {}).max().orElse(0);

		System.out.println("max1 : " + max1);
		System.out.println("max2 : " + max2);

	}

}