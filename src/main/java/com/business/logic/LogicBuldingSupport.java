package com.business.logic;

import java.sql.Connection;
import java.util.Scanner;

public class LogicBuldingSupport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 int count =0;
		 if(s.length()==0) {
			 System.out.println("Invalid Statement");
			 Thread.currentThread().interrupt();;
		 }
		 if( Thread.currentThread().isInterrupted())
		 {}
		 else {
		 for(int i = 0; i<s.length();i++) {
			 char c = s.charAt(i);
			 int b=c;
			 if(b>=65&&b<=122||c!=' ') {
				 
			 }
			 else {
				 count++;
			 }
					 
		 }
		 if(count ==0) {
			 System.out.println("Valid statement");
		 }
		 else {
			 System.out.println("Invalid statement");
		 }
		 sc.close();
		 

		 
	}
	}

}
