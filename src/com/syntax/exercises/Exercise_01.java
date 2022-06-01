package com.syntax.exercises;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {

		System.out.println("================Ex_1.0=====================");

		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number");
			arr[i] = in.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum of all stored elements in an array:" + sum);

		in.close();
	}
	
	
	
	
}
