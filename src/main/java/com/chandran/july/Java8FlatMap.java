package com.chandran.july;

/*
 * Purpose : Map and flatMap Stream Operation.
 * Date    : Jul 28, 2021
 * Auther  : chandransellappan
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8FlatMap {

	public static void main(String[] args) {
		Map<String, List<String>> people = new HashMap<>();
		people.put("Cena", Arrays.asList("123-1123", "456-3389"));
		people.put("Undertaker", Arrays.asList("678-2243", "986-5264"));
		people.put("Khali", Arrays.asList("678-6654", "986-3242"));

		List<String> phonesWithmap = (List) people.values().stream().map(p -> p).collect(Collectors.toList());
		System.out.println("phones with map() : " + phonesWithmap);

		List<String> phonesWithFlatmap = (List) people.values().stream().flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println("phones with flatmap() : " + phonesWithFlatmap);

	}

}
