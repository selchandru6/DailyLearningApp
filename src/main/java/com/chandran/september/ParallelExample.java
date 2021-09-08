package com.chandran.september;

/*
 * Purpose : This is for Stream Parallel example
 * Date    : Sept 07, 2021
 * Auther  : chandransellappan
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelExample {

	private static final String DIR = System.getProperty("user.dir") + "/test/";

	public static void main(String[] args) throws IOException {

		Files.createDirectories(Paths.get(DIR));

		ParallelExample obj = new ParallelExample();

		List<Employee> employees = obj.generateEmployee(10000);
		Instant start = Instant.now();
		// normal, sequential
		 employees.stream().forEach(ParallelExample::save); // 27s-29s

		// parallel
		//employees.parallelStream().forEach(ParallelExample::save); // 7s-8s
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println("TimeElapsed : "+timeElapsed);
	}

	private static void save(Employee input) {

		try (FileOutputStream fos = new FileOutputStream(new File(DIR + input.getName() + ".txt"));
				ObjectOutputStream obs = new ObjectOutputStream(fos)) {
			obs.writeObject(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private List<Employee> generateEmployee(int num) {

		return Stream.iterate(0, n -> n + 1).limit(num).map(x -> {
			return new Employee(generateRandomName(4), generateRandomAge(15, 100),
					generateRandomSalary(900.00, 200_000.00));
		}).collect(Collectors.toList());

	}

	private String generateRandomName(int length) {

		return new Random().ints(5, 97, 122) // 97 = a , 122 = z
				.mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining());

	}

	private int generateRandomAge(int min, int max) {
		return new Random().ints(1, min, max).findFirst().getAsInt();
	}

	private BigDecimal generateRandomSalary(double min, double max) {
		return new BigDecimal(new Random().doubles(1, min, max).findFirst().getAsDouble()).setScale(2,
				RoundingMode.HALF_UP);
	}

}