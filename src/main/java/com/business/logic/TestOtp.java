package com.business.logic;

import java.util.Scanner;

public class TestOtp {
   static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many otp you want to check");
		int a= sc.nextInt();
		for(int i = 1;i<=a;i++) {
		 
		String otp = Otp.generateOTP();
		 System.out.print(otp + "  ");
		 
		 check(otp);
		 
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(count +"---> Test case failed");
	}
	
	public static void check(String otp) {
		  if(otp.charAt(0)=='0') {
			  count++;
		  }
	}

}
