package com.syntax.exercises;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		System.out.println("=============================== 2.0 =====================================");
		Scanner in = new Scanner(System.in);

		String[][] arr = new String[1][8];

		String capital;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				System.out.println("Enter a Country");
				arr[i][j] = in.nextLine();
				if (arr[i][j].equalsIgnoreCase("USA")) {
					capital = "DC";
				} else if (arr[i][j].equalsIgnoreCase("Morocco")) {
					capital = "Rabat ";
				} else if (arr[i][j].equalsIgnoreCase("Japan")) {
					capital = "Tokyo";
				} else if (arr[i][j].equalsIgnoreCase("Chile")) {
					capital = "Santiago";
				} else if (arr[i][j].equalsIgnoreCase("Brazil")) {
					capital = "Brasília";
				} else if (arr[i][j].equalsIgnoreCase("Egypt")) {
					capital = "Cairo";
				} else if (arr[i][j].equalsIgnoreCase("China")) {
					capital = "Beijing";
				} else if (arr[i][j].equalsIgnoreCase("Russia")) {
					capital = "Moscow";
				} else if (arr[i][j].equalsIgnoreCase("Saudi Arabia")) {
					capital = "Riyadh";
				} else {
					capital = "Not Listed";
				}

				System.out.println("The Capital for the country is :" + capital);

			}

		}
		in.close();

	}
}
