package com.softserve.edu03eq;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Ira", 25);
        Student student2 = new Student("Ira", 25);
        //
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2.toString());
        //
        System.out.println("(student1 == student2) : " + (student1 == student2));
        System.out.println("student1.equals(student2) : " + student1.equals(student2));

    }
}
