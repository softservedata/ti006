package com.softserve.edu03sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppStud {
	public static void main(String[] args) {
		/*-
		Student[] students = new Student[7];
		students[0] = new Student("Oksana", 26);
		students[1] = new Student("Bogdan", 27);
		students[2] = new Student("Orest", 24);
		students[3] = new Student("Ira", 23);
		students[4] = new Student("Yarko", 21);
		students[5] = new Student("Bogdan", 30);
		students[6] = new Student("Bogdan", 22);
		*/
		// /*
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oksana", 26));
		students.add(new Student("Bogdan", 27));
		students.add(new Student("Orest", 24));
		students.add(new Student("Ira", 23));
		students.add(new Student("Yarko", 21));
		students.add(new Student("Bogdan", 30));
		students.add(new Student("Bogdan", 22));
		// */
		//String[] students = {"Oksana", "Bogdan", "Orest", "Ira", "Yarko"};
		//
		//System.out.println("Original Arrays: " + Arrays.toString(students));
		System.out.println("Original Arrays: " + students);
		//
		//Arrays.sort(students);
		// Arrays.sort(students, new Student.ByDestName());
		// Arrays.sort(students, new Student().new ByAge());
		//Arrays.sort(students, new Student.ByNameAndAge());
		//Arrays.sort(students, new Student.ByNameAndAge());
		//
		//Collections.sort(students);
		//Collections.sort(students, new Student.ByNameAndAge());
		//students.sort(new Student.ByDestName());
		Collections.sort(students, new Student().new ByAge());
		//
		//System.out.println("\nSorted Arrays: " + Arrays.toString(students));
		System.out.println("\nSorted Arrays: " + students);
		//
	}
}
