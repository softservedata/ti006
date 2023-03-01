package com.softserve.edu.edu04list;

import java.util.Comparator;

class Student implements Comparable<Student> {

	public static class ByDestName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return -st1.getName().compareTo(st2.getName());
		}
	}

	public class ByAge implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getAge() - st2.getAge();
		}
	}

	public static class ByNameAndAge implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			int byName = st1.getName().compareTo(st2.getName());
			return byName == 0 ? st1.getAge() - st2.getAge() : byName;
		}
	}

	// --------------------
	
	private int age;
	private String name;

	public Student() {
		age = -1;
		name = "";
	}


	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nStudent [ age=" + age 
				+ ", name=" + name 
				+ " ]";
	}

	@Override
	public int compareTo(Student student) { // Default Sort
		return name.compareTo(student.getName());
		// return -age + student.getAge();
		// return age - student.getAge();
	}
	
}
