package com.Bridgelab.day2;

import java.util.Scanner;

public class conditoinalStatementDay3 {
static int num;
static int num1;
static int num2;
	public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
		num=sc.nextInt();
		 num1=sc.nextInt();
		 num2=sc.nextInt();
	}
     if(num<num1)
     {
    	 System.out.println(num+"less than"+num1);
     }
     else if(num<num1)
     {
    	 System.out.println(num1+"greter than"+num2);
     }
     else if(num==num1)
     {
    	 System.out.println(num1+"equal to"+num2);
     }
      if(num1>num2)
     {
    	 System.out.println(num1+"greter than"+num2);
     }
     else if(num1<num2)
     {
    	 System.out.println(num1+"less than"+num2);
     }
     else if(num1==num2)
     {
    	 System.out.println(num1+"equal to"+num2);
     }
	}

}
