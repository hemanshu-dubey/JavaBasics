package com.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int arr[] = new int[n];

		String[] ca = s.split(" ");

		int i = 0;
		for (String in : ca) {

			arr[i] = Integer.parseInt(in);

			i++;

		}

		long max = 0;
		long sum = 0;
		for (i = 0; i < arr.length; i++) {
			sum = 0;
			
				for (int k = 0; k <= arr.length-i-1 && k + i < arr.length; k++) {
					
					sum = arr[i + k];

				
				System.out.println(sum);
				if (max < sum)
					max = sum;
			}

		}
		System.out.println(max);
		sc.close();
	}

}
