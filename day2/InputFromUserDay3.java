package com.Bridgelab.day2;

import java.util.Scanner;

public class InputFromUserDay3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("enter the number");
			int num=sc.nextInt();
			System.out.println(num);
		}
		
	}

}
