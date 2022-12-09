package com.Bridgelab.day2;

import java.util.Scanner;

public class switchCaseDay3 {
  static int num;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number between 1 to 7");
			num=sc.nextInt();
		}
		switch(num){
		case 1 : System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		case 6: System.out.println("Six");
		break;
		case 7: System.out.println("Seven");
		break;
		}
		
	}

}
