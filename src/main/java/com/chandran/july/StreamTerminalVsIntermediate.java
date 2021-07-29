package com.chandran.july;

/*
 * Purpose : Stream operations are combined into pipelines to process streams. All operations are either intermediate or terminal.
 * Date    : Jul 28, 2021
 * Auther  : chandransellappan
 */

import java.util.Arrays;

public class StreamTerminalVsIntermediate {

	public static void main(String[] args) {
		System.out.println("Stream without terminal operation");

		Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
			System.out.println("doubling " + i);
			return i * 2;
		});

		System.out.println("Stream with terminal operation");
		long sum2 = Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
			System.out.println("doubling " + i);
			return i * 2;
		}).sum();
		System.out.println("Sum : " + sum2);

	}

}
