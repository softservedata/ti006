package com.softserve.edu03sort;

import java.util.Arrays;
import java.util.Random;

public class AppArr {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
		//
		System.out.println("Arrays: " + arr);
		System.out.println("Original Arrays: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Arrays: " + Arrays.toString(arr));
	}
}
