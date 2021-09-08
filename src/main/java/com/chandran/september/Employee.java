package com.chandran.september;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
	private int age;
    private BigDecimal salary;
    
    public Employee(String generateRandomName, int generateRandomAge, BigDecimal generateRandomSalary) {
		this.name=generateRandomName;
		this.age=generateRandomAge;
		this.salary =generateRandomSalary;

	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public BigDecimal getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


}
