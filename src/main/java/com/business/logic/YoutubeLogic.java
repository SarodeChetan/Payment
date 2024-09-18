package com.business.logic;

import java.util.Scanner;

public class YoutubeLogic {
	
	
	public static void main(String[] args) {
		
		 int input1 = 10;
			
		 int i=2;
		 int op=0;
		 while(i<=input1) {
			 
		   op=op+i;
		   
	   }
		 System.out.println(op);
 
		System.out.println("------------------------Choose One-------------------------");
		
		System.out.println();
		System.out.println();
		 System.out.println("a.Breakup song   b.Love Song  c. 90's Song");
		 Scanner sc  = new Scanner(System.in);
		 
		 char c = sc.next().charAt(0);
		 
		 sortSong(c);
		 
		 
		 
		 
	}
  
	
	public static void sortSong(char c) {
		
		switch(c) {
		
		case 'a' : Rough.openWebpage("https://www.youtube.com/watch?v=5lbysG7_KiI"); break;
		
		case 'b' :  Rough.openWebpage("https://www.youtube.com/watch?v=Bd8bpV2pxak"); break;
		
		case 'c' :  Rough.openWebpage("https://www.youtube.com/watch?v=aKNLArQ6uM8"); break;
		
		
		}
		
	}
}
