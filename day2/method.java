package com.Bridgelab.day2;

public class method {
  
	public static void m1() {
		System.out.println("this is a static method");
	}

	public static int m2(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        m1();
        System.out.println(m2(10,12));
        
	}

}
