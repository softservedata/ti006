package com.edu;

import java.util.Scanner;

public class AppSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.println("a + b = " + (a + b)); // Testability
        sc.close();
    }

}
