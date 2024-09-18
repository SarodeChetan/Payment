package com.business.logic;

import java.util.Scanner;

public class CharToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;) {
		System.out.println("Enter Charcter ");
	
		char c = sc.next().charAt(0);
		String fop="";
 
		
		int a= c ;
		System.out.println("First output is " +a);
		
 
		 
			int b=a;  /// 65 // 32 //16 // 8//4//2
			while(a>=2) {
				 b = a/2; //32  //16 // 8 //4//2 //1
				int ba= a%2;//1 // 0 // 0 // 0//0 //0
				fop = fop+ba;//1 // 10 // 100 //1000//10000//100000
				a=b; // 32 //16 //8 //4 //2 //1
			 
				if(a<2) {
					fop = fop+b;     //10000001
				}
			
				
				
			}
			
			StringBuffer sf = new StringBuffer(fop);
			
			System.out.println("Final OutPut is "+sf.reverse());
			
	
		}
		 


	}

}
